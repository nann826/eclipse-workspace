package com.lisa;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) {
		// 客户端步骤 : 建立网络连接-->交换数据-->关闭连接
		//1、建立连接  （在Java API中以java.net.Socket类的对象代表网络连接，所以建立客户端网络连接，也就是创建Socket类型的对象）
		//  Socket socket1 = new Socket("IP/Domain",port); 
		//  如果建立连接时，本机网络不通，或服务器端程序未开启，则会抛出异常
		try {
			Socket socket1 = new Socket("127.0.0.1",8080);
		//2.数据交换  （ 数据传输功能由Java IO实现，按照 “请求-响应”模型，也就是说只需要从连接中获得输入流和输出流即可，然后将需要发送的数据写入连接对象的输出流中，在发送完成以后从输入流中读取数据即可。）
			 OutputStream os = socket1.getOutputStream();//输出流  写入发送数据
			 InputStream is = socket1.getInputStream();//输入流  读取服务器反馈数据
	    //3.关闭连接 （释放网络连接占用的系统端口和内存等资源，完成网络操作）
			 socket1.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
