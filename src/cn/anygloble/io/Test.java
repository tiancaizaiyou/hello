package cn.anygloble.io;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        show03();
    }

    private static void show03() {
        int t = b(1);
        System.out.println(t);
    }

    private static int b(int i) {
        System.out.println(i);
        if(i==1){
            return 1;
        }
        return i*b(i-1);
    }

    private static void show02() {
        File file = new File("C:\\Users\\wusong\\IdeaProjects\\hello\\src");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void show01() {
        File file = new File("C:\\Users\\wusong\\IdeaProjects\\hello");
        System.out.println(file.length());

        File file1 = new File("C:\\Users\\wusong\\IdeaProjects\\hello\\hello.iml");
        System.out.println(file1.length());

        /*File file2 = new File("C:\\Users\\wusong\\IdeaProjects\\hello\\src\\cn\\anygloble\\io\\1.txt");
        boolean newFile = file2.createNewFile();
        file2.delete();*/
        File file2 = new File("io\\111");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);
        File file3 = new File("1.txt");
        String path = file3.getPath();
        System.out.println(path);
        File file4 = new File("src\\ff");
        boolean mkdir1 = file4.mkdir();
        System.out.println(mkdir1);
        File file5 = new File("1.txt");
        System.out.println(file5.getAbsoluteFile());
    }
}
