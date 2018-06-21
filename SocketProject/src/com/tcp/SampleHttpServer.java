package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleHttpServer  {
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//建立一个Http服务器
		ServerSocket httpServer = new ServerSocket(9090);
		Socket conn = httpServer.accept();
		
		//读写
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		
		String read = br.readLine();
		while (read != null) {
			
			System.out.println(read);
			br.readLine();
		}
		
		String content = "";
		bw.write(content);
		
	}

}
