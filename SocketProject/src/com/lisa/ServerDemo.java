package com.lisa;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) {
		// �������˲��� �� �����˿�-->��������-->��������-->�ر�����
		// 1. �����˿�   serverSocket = new ServerSocket(port);
		//	    ���port�˿��Ѿ�����ĳ���ռ�ã���ô���׳��쳣������ʵ�ּ���
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
		// 2. ������� �����пͻ������ӵ���ʱ������һ���Ϳͻ������Ӷ�Ӧ��Socket���Ӷ���ͬʱ�ͷſͻ������Ӷ��ڷ������˶˿ڵ�ռ�ã�
		//ͨ��������ӣ�ʹ�ÿͻ��˵������ڷ������˻���˱��֣�����ʹ�÷������˵Ķ˿��ͷų��������Լ����ȴ������Ŀͻ�������
			Socket socket = serverSocket.accept();
		// 3. ��������
			InputStream is = socket.getInputStream();//���տͻ�������
			OutputStream os = socket.getOutputStream();//��ͻ��˷��ͷ�������
	    // 4. �ر�����
			  socket.close();
			  serverSocket.close();

		} catch (IOException e) {
			
		}

	}

}
