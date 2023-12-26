package test06_4;

public class StudentTest4 {

	public static void main(String[] args) {
	
	//클래스 변수의 데이터값이 public 일 경우 새로운 데이터값 넣기와 가져오기	
	//클래스 변수에 접근 형식:클래스명.변수명;	
	//System.out.println(Student2.serialNum);
	//System.out.println("-------------------");
	
	//클래스 변수의 데이터값을 변경
	//클래스 변수의 데이터값이 public 일 경우
	//Student2.serialNum = 10;
	//System.out.println("클래스 변수 Student2.serialNum:"+Student2.serialNum);
	
	//클래스 변수의 데이터값이 private 일 경우 새로운 데이터값 넣기와 가져오기
	//클래스 변수의 데이터값이 private 일 경우
	//public static void setSerialNum(int serialNum)
	Student2.setSerialNum(10);
	
	System.out.println(Student2.getSerialNum());
	
	
	System.out.println("-------------");
	
	//public Student2()	생성자 호출
     Student2 st1 = new Student2();
     //System.out.println("st1.serialNum=" + st1.serialNum);
     //System.out.println("st1.serialNum=" + Student2.serialNum);
     System.out.println(st1.getSerialNum());
     System.out.println(Student2.getSerialNum());
     System.out.println("-----------");
     
     //학생이름 변수에 데이터값 넣기 : private String studentName
     //getter, setter 만들어서 "이름:김자바"로 넣어주고 데이터값 출력하기
     //setter : public void setStudentName(String studentName)호출
     st1.setStudentName("김자바");
     System.out.println(st1.getStudentName());
     System.out.println(st1.getStudentName()+"학번:"+st1.studentID);
     System.out.println("-----------------");
     
     
     //st1.show();
     Student2 st2 = new Student2();
     //System.out.println("st2.serialNum="+st2.serialNum);
     //System.out.println("Student2.serialNum="+Student2.serialNum);
     System.out.println(st2.getSerialNum());
     System.out.println(Student2.getSerialNum());
     
     //System.out.println(Student2.serialNum);
     System.out.println("------------------");
	}

}
