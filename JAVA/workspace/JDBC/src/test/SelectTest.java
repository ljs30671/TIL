package test;
import java.sql.*;
public class SelectTest {
	public static void main(String[] args) {	
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//1.driver ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			
			//2.����
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cafe","1234");
			System.out.println("con ok");
			
			//3.Statement ����
			 stmt=con.createStatement();
			
			//4.SQL����
			 rs=stmt.executeQuery("select * from member");
			
			//5.��� ���
			while(rs.next()) {
				String id=rs.getString(1);
				String name=rs.getString(2);
				String date=rs.getString(3);
				String phone=rs.getString(4);
				int point=rs.getInt(5);
				System.out.println(id+":"+name+":"+date+":"+phone+":"+point);
			}			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.�ڿ� ����
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				
			}
		}

	}

}