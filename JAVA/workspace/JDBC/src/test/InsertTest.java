package test;
import java.sql.*;
public class InsertTest {
	public static void main(String[] args) {	
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {
			//1.driver ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			
			//2.����
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","cafe","1234");
			System.out.println("con ok");
			
			//3.Statement ����
			 stmt=con.prepareStatement("insert into member(memid,memname,memdate,phone,point) values(?,?,?,?,?)");
			 stmt.setString(1,args[0]);
			 stmt.setString(2,args[1]);
			 
			 java.util.Date today=new java.util.Date();		
			 Date now=new Date(today.getTime());
			 
			 stmt.setDate(3, now);
			 stmt.setString(4,args[2]);
			 stmt.setInt(5, 0);
			
			//4.SQL����
			 int i=stmt.executeUpdate();
			 
			
			//5.��� ���
			 System.out.println(i+"���� insert�Ǿ����ϴ�");	
			
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