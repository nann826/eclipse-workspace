package com.lisa;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8080);//服务端在8080端口上开启了一个ServerSocket，等待连接
		Socket conn = ss.accept();
		//创建一个Reader用于从网络上读数据，一个Writer向网络上写数据
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			bw.write(s.toUpperCase()+"\n");
			bw.flush();
			s = br.readLine();
		}		
		br.close();
		bw.close();
		conn.close();		
	}

}
