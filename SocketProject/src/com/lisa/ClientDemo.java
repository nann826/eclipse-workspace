package com.lisa;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) {
		// �ͻ��˲��� : ������������-->��������-->�ر�����
		//1����������  ����Java API����java.net.Socket��Ķ�������������ӣ����Խ����ͻ����������ӣ�Ҳ���Ǵ���Socket���͵Ķ���
		//  Socket socket1 = new Socket("IP/Domain",port); 
		//  �����������ʱ���������粻ͨ����������˳���δ����������׳��쳣
		try {
			Socket socket1 = new Socket("127.0.0.1",8080);
		//2.���ݽ���  �� ���ݴ��书����Java IOʵ�֣����� ������-��Ӧ��ģ�ͣ�Ҳ����˵ֻ��Ҫ�������л������������������ɣ�Ȼ����Ҫ���͵�����д�����Ӷ����������У��ڷ�������Ժ���������ж�ȡ���ݼ��ɡ���
			 OutputStream os = socket1.getOutputStream();//�����  д�뷢������
			 InputStream is = socket1.getInputStream();//������  ��ȡ��������������
	    //3.�ر����� ���ͷ���������ռ�õ�ϵͳ�˿ں��ڴ����Դ��������������
			 socket1.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
