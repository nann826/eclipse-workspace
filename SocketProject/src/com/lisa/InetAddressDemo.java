package com.lisa;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
 /**
 * ��ʾInetAddress��Ļ���ʹ��
 */
public static void main(String[] args) {
	try {
		//ʹ��������������
		InetAddress inet1 = InetAddress.getByName("www.baidu.com");
		System.out.println(inet1);
		//ʹ��IP��������
		InetAddress inet2 = InetAddress.getByName("127.0.0.1");
		System.out.println(inet2);
		//ʹ�ñ�����ַ��������
		InetAddress inet3 = InetAddress.getLocalHost();
		System.out.println(inet3);
		//��ȡ�����д洢������
		String host = inet3.getHostName();
		System.out.println("Domain: " + host);
		//��ȡ�����д洢��IP
		String ip = inet3.getHostAddress();
		System.out.println("IP: " + ip);
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
   }

}
