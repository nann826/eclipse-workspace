package al.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDBC java database connection
		
		try {
			//1.�������ݿ��������� Ӧ�ó��������ݿ⽻����Ҫ
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�������ݿ����ӡ���������������ִ��sql��䲢���ؽ��
			//DriverManager.getConnection("jdbc:oracle:thin:@host:port:database", "user", "password")
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.10.100.14:1551:UAT","appluat","appluat");
			//3.����ִ��SQL����statement
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
