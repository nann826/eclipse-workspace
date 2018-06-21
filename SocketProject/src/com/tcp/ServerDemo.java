package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author alisajin
 * example: echo 服务器
 * 将客户端发送的内容反馈给客户端
 *
 */
public class ServerDemo {
	

	public static void main(String[] args) {
		// 服务器端步骤 ： 监听端口-->接收连接-->交换数据-->关闭连接
		// 1. 监听端口   serverSocket = new ServerSocket(port);
		//	    如果port端口已经被别的程序占用，那么将抛出异常。否则将实现监听
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
		    serverSocket = new ServerSocket(8080);
		// 2. 获得连接 （当有客户端连接到达时，建立一个和客户端连接对应的Socket连接对象，同时释放客户端连接对于服务器端端口的占用）
		//通过获得连接，使得客户端的连接在服务器端获得了保持，另外使得服务器端的端口释放出来，可以继续等待其它的客户端连接
			socket = serverSocket.accept();
		// 3. 交换数据
			//InputStream is = socket.getInputStream();//接收客户端数据
			//OutputStream os = socket.getOutputStream();//向客户端发送反馈数据
			//读取数据
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//输出数据
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String read ;
			while((read = br.readLine())!=null) {
				System.out.println(read);
				bw.write(read);
				bw.newLine();
				bw.flush();
			}
			
			

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				br.close();
				bw.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	
	//InetAddress .getHostName 
}
