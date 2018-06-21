package com.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8080);//�������8080�˿��Ͽ�����һ��ServerSocket���ȴ�����
		Socket conn = ss.accept();
		//����һ��Reader���ڴ������϶����ݣ�һ��Writer��������д����
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
