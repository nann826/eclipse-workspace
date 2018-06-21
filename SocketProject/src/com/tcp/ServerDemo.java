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
 * example: echo ������
 * ���ͻ��˷��͵����ݷ������ͻ���
 *
 */
public class ServerDemo {
	

	public static void main(String[] args) {
		// �������˲��� �� �����˿�-->��������-->��������-->�ر�����
		// 1. �����˿�   serverSocket = new ServerSocket(port);
		//	    ���port�˿��Ѿ�����ĳ���ռ�ã���ô���׳��쳣������ʵ�ּ���
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
		    serverSocket = new ServerSocket(8080);
		// 2. ������� �����пͻ������ӵ���ʱ������һ���Ϳͻ������Ӷ�Ӧ��Socket���Ӷ���ͬʱ�ͷſͻ������Ӷ��ڷ������˶˿ڵ�ռ�ã�
		//ͨ��������ӣ�ʹ�ÿͻ��˵������ڷ������˻���˱��֣�����ʹ�÷������˵Ķ˿��ͷų��������Լ����ȴ������Ŀͻ�������
			socket = serverSocket.accept();
		// 3. ��������
			//InputStream is = socket.getInputStream();//���տͻ�������
			//OutputStream os = socket.getOutputStream();//��ͻ��˷��ͷ�������
			//��ȡ����
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//�������
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
