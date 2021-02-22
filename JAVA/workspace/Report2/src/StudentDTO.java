
public class StudentDTO {

	private int No = 3;
	private String Name = "나길동";
	private String Det = "영문학과";
	private String Addr = "제주";
	private String tel = "010-3333-3333";

//	public StudentDTO() {
//		super();
//	}
//
//	public StudentDTO(int No, String Name, String Det, String Addr, String Tel) {
//		super();
//		setNo(No);
//		setName(Name);
//		setDet(Det);
//		setAddr(Addr);
//		setTel(Tel);
//	}

	public int getNo() {
		return No;
	}

	public void setNo(int No) {
		if ((Integer.toString(No) != null)) {
			this.No = No;
		} else {
			System.out.println("Student Number must be Inserted");
			System.exit(0);
		}
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDet() {
		return Det;
	}

	public void setDet(String det) {
		this.Det = det;
	}

	public String getAddr() {
		return Addr;
	}

	public void setAddr(String addr) {
		this.Addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
