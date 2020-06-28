package cn.anygloble.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\a.txt");
        FileChannel channel = fis.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(10);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len=0;
        while((len=channel.read(buffer))!=-1){
            buffer.flip();
            while(buffer.hasRemaining()){
                bos.write(buffer.get());
            }
            buffer.clear();
            System.out.println(new String(bos.toByteArray()));
            bos.reset();
        }

        channel.close();
        fis.close();
    }
}
