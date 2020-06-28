package cn.anygloble.inter;

import java.io.*;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String s1 =new String("abc").intern();
        String s2 = "abc";
        System.out.println(s1==s2);
        boolean equals1 = Objects.equals(s1, s2);
        System.out.println(equals1);
        File file = new File("d:"+ File.separator+"Apple"+File.separator+"test.txt");
        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("jiji金沙江发dfdfdsfsd".getBytes());
        outputStream.close();

        InputStream inputStream = new FileInputStream(file);
        byte[] ints = new byte[1024];
        int read = inputStream.read(ints);
        System.out.println(new String(ints,0,read));
        inputStream.close();
    }
}
