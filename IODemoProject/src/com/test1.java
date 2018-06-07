package com;

import java.io.File;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) {
		//在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
		//录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
		
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
