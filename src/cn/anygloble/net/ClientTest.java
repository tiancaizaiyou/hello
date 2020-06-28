package cn.anygloble.net;

import java.io.*;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",8888);
        FileInputStream fi = new FileInputStream("d:\\1.jpg");
        OutputStream os = client.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fi.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        client.shutdownOutput();
        InputStream is = client.getInputStream();
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fi.close();
        client.close();
    }
}
