package com.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author alisajin
 *  
 * 支持多客户端的服务器端实现
 * 
 * 实现了一个while形式的死循环，由于accept方法是阻塞方法，所以当客户端连接未到达时，将阻塞该程序的执行，
 * 当客户端到达时接收该连接，并启动一个新的LogicThread线程处理该连接，然后按照循环的执行流程，继续等待下一个客户端连接。
 * 这样当任何一个客户端连接到达时，都开启一个专门的线程处理，通过多个线程支持多个客户端同时处理 
 */
public class MulThreadSocketServer {

	public static void main(String[] args) {
	 
		ServerSocket serverSocket = null;
		Socket socket = null;
		//监听端口号
		int port = 10000;
		
		try {
			//建立连接
			serverSocket = new ServerSocket(port);
			while(true) {
				socket = serverSocket.accept();
				new LogicThread(socket);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
