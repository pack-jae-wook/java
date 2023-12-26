package test06_3;

public class StudentTest2 {

	public static void main(String[] args) {
	   Student1 studentLee = new Student1();
	   studentLee.setStudentName("이지원");
	   
	   
	   
	   
	   //클래스 변수: 객체 생성없이 static 멤버 변수에 접근
	   //형식) 클래스명.변수명
	   //
	   System.out.println(studentLee.serialNum);
	   System.out.println("----------------------");
	   System.out.println(studentLee.studentName + "학번:" + studentLee.studentID);
	   
	   //StudentName 멤버변수에 이름을 넣어주는 경우
	   //setter 함수를 호출해서 넣어주기
	   Student1 studentSon = new Student1();
	   studentSon.setStudentName("손수경");
	   System.out.println(studentSon.serialNum);
	   System.out.println(studentSon.studentName + "학번:" + studentSon.studentID);
	   
	   
	}

}
