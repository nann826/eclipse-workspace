package com.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author alisajin
 *  
 * ֧�ֶ�ͻ��˵ķ�������ʵ��
 * 
 * ʵ����һ��while��ʽ����ѭ��������accept�������������������Ե��ͻ�������δ����ʱ���������ó����ִ�У�
 * ���ͻ��˵���ʱ���ո����ӣ�������һ���µ�LogicThread�̴߳�������ӣ�Ȼ����ѭ����ִ�����̣������ȴ���һ���ͻ������ӡ�
 * �������κ�һ���ͻ������ӵ���ʱ��������һ��ר�ŵ��̴߳���ͨ������߳�֧�ֶ���ͻ���ͬʱ���� 
 */
public class MulThreadSocketServer {

	public static void main(String[] args) {
	 
		ServerSocket serverSocket = null;
		Socket socket = null;
		//�����˿ں�
		int port = 10000;
		
		try {
			//��������
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
