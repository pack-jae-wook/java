package test06_4;

public class Student3 {

	private static int serialNum = 1000;
	public int studentID;
	private String studentName;
	public int grade;
	public String address;

	public Student3() {
		serialNum++;
		this.studentID = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
