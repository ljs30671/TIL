
public class StudentTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Register OK\n");
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("Driver Register Error : " + e);
			
		}
		
		StudentDAO DAO = new StudentDAO();
		StudentDTO DTO = new StudentDTO();
		
		DAO.insertStudent(DTO);
		DAO.printAllStudents();
		
	}
	
}
