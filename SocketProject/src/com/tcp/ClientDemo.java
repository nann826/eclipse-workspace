package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	/**
	 * @author alisajin
	 * example: echo ������
	 * ���ͻ��˷��͵����ݷ������ͻ���
	 *
	 */
	public static void main(String[] args) {
		// �ͻ��˲��� : ������������-->��������-->�ر�����
		//1����������  ����Java API����java.net.Socket��Ķ�������������ӣ����Խ����ͻ����������ӣ�Ҳ���Ǵ���Socket���͵Ķ���
		//  Socket socket1 = new Socket("IP/Domain",port); 
		//  �����������ʱ���������粻ͨ����������˳���δ����������׳��쳣
		 BufferedWriter bw = null;
		 BufferedReader br = null;
		 Socket socket1 =  null;
		
		try {
			socket1 = new Socket ("10.0.108.183",8080);
		//2.���ݽ���  �� ���ݴ��书����Java IOʵ�֣����� ������-��Ӧ��ģ�ͣ�Ҳ����˵ֻ��Ҫ�������л������������������ɣ�Ȼ����Ҫ���͵�����д�����Ӷ����������У��ڷ�������Ժ���������ж�ȡ���ݼ��ɡ���
			// OutputStream os = socket1.getOutputStream();//�����  д�뷢������
			// InputStream is = socket1.getInputStream();//������  ��ȡ��������������
			 
			 //����� д������
			 bw = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
			 //����� ����
			 br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			 
			 bw.write(" hello , this is the first line .");
			 bw.newLine();
			 bw.flush();
			 System.out.println(br.readLine());
			 
			 bw.write("hello , this is the second line");
			 bw.newLine();
			 bw.flush();
			 System.out.println(br.readLine());
			
			
			
			
			 
			 
	    //3.�ر����� ���ͷ���������ռ�õ�ϵͳ�˿ں��ڴ����Դ��������������
			 //socket1.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				socket1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
