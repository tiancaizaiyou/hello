package cn.anygloble;

public class HelloWorld {
    public static void main (String[] args){
//        int 年龄 = 29;
//        int mit = 3;
//        int MIT = 4;
//        float x1 = (float) 10.2;
//        float y1 = 10.1F;
//        System.out.println("helloWorld!");
//        System.out.println(年龄);
//        System.out.println(mit);
//        System.out.println(MIT);
        //System.out.println(x*y);

//        for(int x=1; x<=9; x++) {
//            for(int y =1; y<=x; y++){
//                System.out.print(y +"*"+ x +"="+ x*y +" ");
//                if (x == y){
//                    System.out.println();
//                }
//            }
//        }


//        int xx = 1;
//        int yy = 1;
//        while (xx<=9) {
//            while (yy<=9) {
//                System.out.print(xx + "*" + yy + "=" + xx * yy);
//                yy++;
//            }
//            if (xx==yy){
//                System.out.println();
//            }
//            xx++;
//        }
//        People p = null;
//        People.country="中国";
//        People p1 = new People();
//        setNum();
//        Integer m = new Integer(10);
//        int n = m.intValue();
//        Integer i = 10;
//        int j = i;

        //p=p1;
        //p.age=10;
//        p.eat();
//        Student stu = (Student) p;
//        stu.study();
        // System.out.println("p.age:" + p.age + " p1.age:" + p1.age);
        //System.out.println(p.country);
        //IMassage<String> msg = new MessageImpl<String>();
        //System.out.println(msg.echo("www.mldc.cn"));
        //ILink<String> link = new LinkImpl<String>();
        Person per1 = new Person();
        per1.name = "吴松";
        per1.age = 27;
        Person per2 = per1;
        per2.name = "张三";
        per1.eat();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
        System.out.println(per1.getClass());
        System.out.println(per1.getClass().getName());
        System.out.println(per1.getClass().getResource("/").getPath());
        System.out.println(Person.class.getClassLoader().getResource("").getPath());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.class.path"));
        int[][] a = new int[][]{{1,3,4},{2,3,5},{5,1,3,4}};
        int a1[][] = new int[3][4];
        a1 = a;
        for (int i = 0; i<a1.length;i++) {
            for(int j = 0 ;j<a1[i].length;j++){
                System.out.println(a1[i][j]);
            }
        }


    }
    public static void setNum(){
        System.out.println("111111");
    }
}

interface  IMassage<T>{
    public abstract String echo(T msg);
}
class MessageImpl<S> implements IMassage<S> {
    public String echo(S t){
        return "【ECHO】" + t;
    }
}
//class People{
//    int age;
//    static String country;
//    public void eat(){
//        System.out.println("吃饭");
//    }
//}
//class Student extends People{
//    @Override
//    public void eat(){
//        System.out.println("吃水煮鱼");
//    }
//    public void study(){
//        System.out.println("好好学习");
//    }
//}
//
//class Teachers extends People{
//    @Override
//    public void eat(){
//        System.out.println("吃樱桃");
//    }
//    public void teach(){
//        System.out.println("授课");
//    }
//}
class Person {
    String name;
    int age;
    public void eat(){
        System.out.println("我叫：" + this.name + ", 我" + this.age + "岁了");
    }
}
