package test;

import java.sql.*;

public class SelectWhereTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {

			// 1. driver ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver ok");

			// 2. ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Shop", "1234");
			System.out.println("Connection ok");

			// 3. statement ����
			stmt=con.createStatement();
			
			// 4. SQL����
			rs=stmt.executeQuery("select * from membertbl where memberaddress like '%"+args[0]+"%' ");
			
			// 5. ��� ���
			while(rs.next()) {
				String id=rs.getString("memberid");
				String name=rs.getString("membername");
				String addr=rs.getString(3);
				System.out.println("id:"+id+"name:"+name+"addr:"+addr);
			}
			
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
