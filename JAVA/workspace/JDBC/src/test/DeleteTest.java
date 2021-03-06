package test;

import java.sql.*;

public class DeleteTest {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		
		try {

			// 1. driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver ok");

			// 2. 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cafe", "1234");
			System.out.println("Connection ok");

			// 3. statement 생성
			stmt=con.prepareStatement("delete from member where memid=? ");
			stmt.setString(1, args[0]);
			
			
			// 4. SQL전송
			int i=stmt.executeUpdate();
			
			// 5. 결과 얻기
			System.out.println(i+"행이 delete 되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 6. 자원 종료
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				
			}
		}

	}

}
