package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException {
		//readLine()Ҫ���л��б�ʶ��write()Ҫ������б�ʶ��Ҫ����flush()ˢ�»�����
		Socket conn = new Socket ("10.0.108.183",8080);
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		bw.write("hello\n");//write()Ҫ������б�ʶ  ʹ�á�\n������bw.newLine()
        bw.flush();//ˢ�»�����
        String s = br.readLine();
        System.out.println(s);

        bw.write("world\n");//write()Ҫ������б�ʶ  ʹ�á�\n������bw.newLine()
        bw.flush();//ˢ�»�����
        s = br.readLine();
        System.out.println(s);
		
		br.close();
        bw.close();
        conn.close();

	}

}
