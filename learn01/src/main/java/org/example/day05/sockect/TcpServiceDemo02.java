package org.example.day05.sockect;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServiceDemo02 {
    public static void main(String[] args) throws Exception{
        //创建服务
        ServerSocket socket = new ServerSocket(9090);
        //监听客户端链接
        Socket socket1 = socket.accept();//阻塞式监听，会一直等待客户端链接
        //获取输入流
        InputStream is = socket1.getInputStream();
        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        //关闭资源
        fos.close();
        is.close();
        socket1.close();
        socket.close();

    }
}
