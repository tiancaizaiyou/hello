package cn.anygloble.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我是吴松".getBytes());
        bos.flush();
        bos.close();
    }
}
