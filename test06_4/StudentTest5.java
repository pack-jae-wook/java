package test06_4;

public class StudentTest5 {

	public static void main(String[] args) {

		//결과 :
		//이지원 학번 : 1001
		//손수경 학번 : 1002
		
		//클래스 멤버 사용: 객체 생성없이 바로 사용이 가능하다.!!!
		//**클래스 멤버에 접근: 클래스명.변수명 or 클래스명.메서드명();
		System.out.println(Student3.getSerialNum());
		System.out.println("----------------------");
		
		//학번 생성 기준값을 10으로 변경
		Student3.setSerialNum(10);
		System.out.println(Student3.getSerialNum());
		System.out.println("----------------------");

		
		
		
		//**클래스 멤버에 접근: 클래스명.변수명 or 클래스명.메서드명()
		//**인스턴스 멤버에 접근 : 객체명.변수명 or 객체명.메서드명()
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentLee.getStudentName() + "학번:" + studentLee.studentID);

		System.out.println("---------------------");

		Student3 studentSon = new Student3();
		studentSon.setStudentName("손수경");
		System.out.println(Student3.getSerialNum());
		System.out.println(studentSon.getStudentName() + "학번:" + studentSon.studentID);
	}

}
