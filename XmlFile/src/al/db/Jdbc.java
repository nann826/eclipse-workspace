package al.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JDBC java database connection
		
		try {
			//1.加载数据库驱动程序。 应用程序与数据库交互需要
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.建立数据库链接。在连接上下文中执行sql语句并返回结果
			//DriverManager.getConnection("jdbc:oracle:thin:@host:port:database", "user", "password")
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.10.100.14:1551:UAT","appluat","appluat");
			//3.创建执行SQL语句的statement
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
