package cn.anygloble;

public class TestDemo {
    public static void main(String[] args){
        int data1[] = new int[]{9,3,4,1,2,5,8,43,232,11,23,21,67,87,67,565,666,5656,444};
        int data2[] = new int[]{9,3,4,1,2,5,8,43,232,11,23,21,67,87,67,565,666,5656,444};
        long time1 = System.currentTimeMillis();
        sort1(data1);
        long time2 = System.currentTimeMillis();
        sort2(data2);
        long time3 = System.currentTimeMillis();
        System.out.println(time1+","+time2+","+time3);
        //System.out.println((time2-time1)+","+(time3-time2));
        print(data1);
        print(data2);
    }
    public static void sort1(int data[]){
        for (int i=0;i<data.length;i++) {
            for(int j=0;j<data.length-i-1;j++) {
                if (data[j] > data[j+1]){
                    int x = data[j];
                    data[j]=data[j+1];
                    data[j+1] = x;
                }
            }
        }
    }

    public static void sort2(int data[]){
        for (int i=0;i<data.length;i++) {
            for(int j=0;j<data.length;j++) {
                if (data[i] < data[j]){
                    int x = data[j];
                    data[j]=data[i];
                    data[i] = x;
                }
            }
        }
    }

    public static void print(int data[]){
        for(int tem:data){
            System.out.println(tem);
        }
    }
}
