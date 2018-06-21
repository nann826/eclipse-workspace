package com.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException {
		//readLine()要求有换行标识，write()要输出换行标识，要调用flush()刷新缓冲区
		Socket conn = new Socket ("10.0.108.183",8080);
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		bw.write("hello\n");//write()要输出换行标识  使用“\n”或者bw.newLine()
        bw.flush();//刷新缓冲区
        String s = br.readLine();
        System.out.println(s);

        bw.write("world\n");//write()要输出换行标识  使用“\n”或者bw.newLine()
        bw.flush();//刷新缓冲区
        s = br.readLine();
        System.out.println(s);
		
		br.close();
        bw.close();
        conn.close();

	}

}
