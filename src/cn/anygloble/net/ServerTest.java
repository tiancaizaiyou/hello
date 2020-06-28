package cn.anygloble.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        while(true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        InputStream is = socket.getInputStream();
                        File file = new File("e:\\upload");
                        if (!file.exists()){
                            file.mkdir();
                        }
                        String fileName = "itcast" + System.currentTimeMillis()+new Random().nextInt(99999) + ".jpg";
                        FileOutputStream fo = new FileOutputStream(file + File.separator+fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while((len = is.read(bytes))!=-1){
                            fo.write(bytes,0,len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());
                        fo.close();
                        socket.close();
                    }
                    catch(IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
    }
}
