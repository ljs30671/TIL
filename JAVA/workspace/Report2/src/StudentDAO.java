import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

	public void insertStudent(StudentDTO s) {
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JS", "1234");
			stmt = con.prepareStatement("insert into student values(?,?,?,?,?) ");
			stmt.setInt(1, s.getNo());
			stmt.setString(2, s.getName());
			stmt.setString(3, s.getDet());
			stmt.setString(4, s.getAddr());
			stmt.setString(5, s.getTel());

			int i = stmt.executeUpdate();
			System.out.println(i + "  Insert OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Insert Error : " + e);
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("Insert connection closing Error : " + e);
			}
		}

	}

	public void printAllStudents() {

		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JS", "1234");
			stmt = con.prepareStatement("select * from Student");
			ResultSet rs = stmt.executeQuery();
			ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
			System.out.println("Table Load OK\n");
			while (rs.next()) {
				int No = rs.getInt(1);
				String Name = rs.getString(2);
				String Det = rs.getString(3);
				String Addr = rs.getString(4);
				String Tel = rs.getString(5);
				StudentDTO s = new StudentDTO();
				list.add(s);
				System.out.println(No + "\t" + Name + "\t" + Det + "\t" + Addr + "\t" + Tel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Select Error : " + e);
		}finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println("Select connection closing Error : " + e);
			}
		}

	}

}
