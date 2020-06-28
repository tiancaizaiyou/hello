package cn.anygloble.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) throws Exception {
        File file = new File("2.txt");
        FileOutputStream f =new FileOutputStream(file);
        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));
        f.write(98);
        f.write(bytes);
        f.close();
    }
}
