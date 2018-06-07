package com.lisa;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
 /**
 * 演示InetAddress类的基本使用
 */
public static void main(String[] args) {
	try {
		//使用域名创建对象
		InetAddress inet1 = InetAddress.getByName("www.baidu.com");
		System.out.println(inet1);
		//使用IP创建对象
		InetAddress inet2 = InetAddress.getByName("127.0.0.1");
		System.out.println(inet2);
		//使用本机地址创建对象
		InetAddress inet3 = InetAddress.getLocalHost();
		System.out.println(inet3);
		//获取对象中存储的域名
		String host = inet3.getHostName();
		System.out.println("Domain: " + host);
		//获取对象中存储的IP
		String ip = inet3.getHostAddress();
		System.out.println("IP: " + ip);
	} catch (UnknownHostException e) {
		e.printStackTrace();
	}
   }

}
