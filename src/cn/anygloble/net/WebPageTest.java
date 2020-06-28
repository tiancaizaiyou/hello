package cn.anygloble.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebPageTest {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        /*int len= 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }*/
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        String[] arr = line.split(" ");
        String htmlPath = arr[1].substring(1);
        FileInputStream fis = new FileInputStream("C:\\Users\\wusong\\IdeaProjects\\" + htmlPath);
        //FileInputStream fis = new FileInputStream(htmlPath);
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());
        int len= 0;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        fis.close();
        socket.close();
        server.close();
    }
}
