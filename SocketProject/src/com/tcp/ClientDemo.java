package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	/**
	 * @author alisajin
	 * example: echo 服务器
	 * 将客户端发送的内容反馈给客户端
	 *
	 */
	public static void main(String[] args) {
		// 客户端步骤 : 建立网络连接-->交换数据-->关闭连接
		//1、建立连接  （在Java API中以java.net.Socket类的对象代表网络连接，所以建立客户端网络连接，也就是创建Socket类型的对象）
		//  Socket socket1 = new Socket("IP/Domain",port); 
		//  如果建立连接时，本机网络不通，或服务器端程序未开启，则会抛出异常
		 BufferedWriter bw = null;
		 BufferedReader br = null;
		 Socket socket1 =  null;
		
		try {
			socket1 = new Socket ("10.0.108.183",8080);
		//2.数据交换  （ 数据传输功能由Java IO实现，按照 “请求-响应”模型，也就是说只需要从连接中获得输入流和输出流即可，然后将需要发送的数据写入连接对象的输出流中，在发送完成以后从输入流中读取数据即可。）
			// OutputStream os = socket1.getOutputStream();//输出流  写入发送数据
			// InputStream is = socket1.getInputStream();//输入流  读取服务器反馈数据
			 
			 //输出流 写入数据
			 bw = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
			 //输入读 数据
			 br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			 
			 bw.write(" hello , this is the first line .");
			 bw.newLine();
			 bw.flush();
			 System.out.println(br.readLine());
			 
			 bw.write("hello , this is the second line");
			 bw.newLine();
			 bw.flush();
			 System.out.println(br.readLine());
			
			
			
			
			 
			 
	    //3.关闭连接 （释放网络连接占用的系统端口和内存等资源，完成网络操作）
			 //socket1.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				socket1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
