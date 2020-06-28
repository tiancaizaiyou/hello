package cn.anygloble.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\wusong\\IdeaProjects\\hello\\a.txt");
        fw.write(98);
        fw.write("我是吴松");
        char[] chars = {'d','c','吴'};
        fw.write(chars,0,2);
        fw.write("程序员",0,1);
        fw.flush();
        fw.close();
    }
}
