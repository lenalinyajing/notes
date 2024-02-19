package org.example.day05.sockect;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception{
        //创建一个socket链接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
        //创建一个输出6⃣流
        OutputStream os = socket.getOutputStream();
        //读取文件
        FileInputStream fis = new FileInputStream(new File("happy  .jpg"));
        //写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }

        //关闭资源
        fis.close();
        os.close();
    }
}
