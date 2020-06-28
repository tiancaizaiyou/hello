package cn.anygloble;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random randomNum = new Random();
        //[1~100]内随机数字
        int num = randomNum.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入我随机生成的数字：");
        int inputNum = scanner.nextInt();
        //查找次数
        int searchNum = 1;

        /*do{
            if (inputNum > num){
                System.out.println("你猜大了！，请再次输出：");
                inputNum=new Scanner(System.in).nextInt();
            }else {
                System.out.println("你猜小了！，请再次输出：");
                inputNum=new Scanner(System.in).nextInt();
            }
            searchNum ++;
        }while (num!=inputNum);*/

        while (num!=inputNum){
            if (inputNum > num){
                System.out.println("你猜大了！，请再次输出：");
                inputNum=scanner.nextInt();
            }else {
                System.out.println("你猜小了！，请再次输出：");
                inputNum=scanner.nextInt();
            }
            searchNum ++;
        }

        System.out.println("你猜了" + searchNum + "次，随机生成的数字是："+ num);
    }
}