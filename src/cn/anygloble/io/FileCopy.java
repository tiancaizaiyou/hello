package cn.anygloble.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("E:\\IMG_20160628_173539.jpg");
        FileInputStream fis = new FileInputStream("D:\\IMG_20160628_173539.jpg");
        int b= 0;
        byte[] a = new byte[1024];
        while((b=fis.read(a))!=-1){
            fos.write(a);
        }

        /*while((a= fis.read())!=-1){
            fos.write(a);
        }*/
        fos.close();
        fis.close();
        long end= System.currentTimeMillis();
        System.out.println("复制耗时：" + (end -begin)+"毫秒");
    }
}
