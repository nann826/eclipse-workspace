package com;

import java.io.File;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) {
		//�ڵ���D���´���һ���ļ�ΪHelloWorld.txt�ļ����ж������ļ�����Ŀ¼���ڴ���һ��Ŀ
		//¼IOTest,֮��HelloWorld.txt�ƶ���IOTestĿ¼��ȥ��֮�����IOTest���Ŀ¼�µ��ļ�
		
		File file = new File("D:\\HelloWorld.txt");
		System.out.println(file.getPath() +"  "+file.getName());
		try {
		if (!file.exists()) {
			boolean isCreate = file.createNewFile();
			if (isCreate) {
				System.out.println("File create success");
			}else {
				System.out.println("failure");
			}
		}else {
			System.out.println("file exist");
		}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			if(file.isDirectory()) {
				System.out.println("Directory");
			}else if (file.isFile()) {
				System.out.println("File");
			}
			
			File dir = new File("D:\\IO_Test");
			
			boolean isdir = dir.mkdirs();
			 
			
			if(file.renameTo(dir)) {//??
				System.out.println("move success");
			}
			String[] filenames = dir.list();
			for(String name : filenames) {
				System.out.println(name);
			}
			
		
				
		
	}

}