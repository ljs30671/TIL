package test;

import java.sql.*;

public class CreateTest {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {

			// 1. driver ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver ok");

			// 2. ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cafe", "1234");
			System.out.println("Connection ok");

			// 3. statement ����
			stmt=con.prepareStatement("create table product (pno integer, pname varchar2(20), price integer) ");
			
			
			// 4. SQL����
			int i=stmt.executeUpdate();
			
			// 5. ��� ���
			System.out.println(i+"���̺��� ���� �Ǿ����ϴ�.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 6. �ڿ� ����
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				
			}
		}

	}

}
