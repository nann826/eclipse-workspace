package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author alisajin
 * InputStream �����ֽ���   OutputStream ����ֽ���    ���࣬�����ֽ������̳�����������
 * -- FileInputStream �� FileOutputStream  
 * -- ByteArrayInputStream��StringBufferInputStream��FileInputStream �����ֻ����Ľ����������Ƿֱ��Byte ���顢StringBuffer���ͱ����ļ��ж�ȡ���ݡ�
 */
public class InputStreamDemo {
	
	/**
     * �����ļ�·������������ FileInputStream
     * @param filePath �� �ļ���·��
     *
     */
	
	public String readFileByByte(String filePath){		
		FileInputStream fis = null;
		String result = "";
		try {
			//1.����·��ʵ����һ��������
		    fis = new FileInputStream(filePath);
		    //2.����������������Ա�����ʣ�µ�bytes�ֽڵĹ���ֵ
			int size = fis.available();
			//3.�����������е��ֽ�������byte����
		    byte[] array = new byte[size];
		    //4.�����ݶ��뵽������
		    fis.read(array);
		    //5.���ݻ�ȡ����byte�����½�һ���ַ��������
		    result = new String(array); 
		  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//6.�ر������� �ͷ���Դ
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
		return result;				
	}

	/**
     * �����ļ�·����������� FileOutputStream
     * @param filePath �� �ļ���·��
     * @param content : ��Ҫд�������
     */
	
	public void writeFileByByte(String filePath, String content) {
		FileOutputStream fos = null;
		
		try {
			//1.�����ļ�·�����������
			fos = new FileOutputStream(filePath);
			//2.��String ת��Ϊbyte[]
			byte[] array = content.getBytes();
			//3.��byte[] �����
			fos.write(array);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
	
	
	/**
     * �����ļ�·����������� FileWriter
     * @param filePath �� �ļ���·��
     * @param content : ��Ҫд�������
     */
	
	public void writeFileByChar(String filePath, String content) {
		FileWriter fw = null;
		
		try {
			//1.�����ļ�·�����������
			fw = new FileWriter(filePath);
			//2.��String ת��Ϊchar[]
			char[] array = content.toCharArray();
			//3.��char[] �����
			fw.write(array);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
	
	/**
     * �����ļ�·������������ FileReader
     * @param filePath �� �ļ���·��
     *
     */	
	public String readFileByChar(String filePath){		
		FileReader fr = null;
		String result = "";
		try {
			//1.����·��ʵ����һ��������
		    fr = new FileReader(filePath);
		   //2.�����������е��ֽ�������byte����
		    char[] cbuf = new char[30];
		    //3.�����ݶ��뵽������
		    while((fr.read(cbuf)) != -1) {
		    //5.���ݻ�ȡ����char�����½�һ���ַ��������
			result = result + new String(cbuf);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//6.�ر������� �ͷ���Դ
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
		return result;				
	}
	
	
	
	/**
     * �����ļ��������������ֽ��� BufferedReader 
     * @param filePath �� �ļ���·��
     *
     */	
	public String readFileByLine(String filePath){		
		BufferedReader br = null;
		File file = new File(filePath);
		String result = "";
		try {
			//1.����·��ʵ����һ������������
		    br = new BufferedReader(new FileReader(filePath));
		   // br = new BufferedReader(new FileReader(file));
		   
		   //2.���ж����� br.readLine()
		    while(br.readLine() != null) {
		    	System.out.println();
		    }
		   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//6.�ر������� �ͷ���Դ
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
		return result;				
	}

	public static void main(String[] args) {
		InputStreamDemo isd = new InputStreamDemo();
		
		String filePath = "D:\\IO_Test\\FileInputStream.txt";
		
		String content = "This is a new file for FileInputStream test. line add;";
		isd.writeFileByByte(filePath, content);
		content = "This is a new file for FileInputStream test. line add2;";
		isd.writeFileByChar(filePath, content);
		
		//String result = isd.readFileByByte(filePath);
		String result = isd.readFileByChar(filePath);
		System.out.println(result);
				
	
	}

}