package test06_3;

public class Student_Main {

	public static void main(String[] args) {
		
	  //클래스 변수(static variable)
	  //객체를 생성하지 않고도 사용이 가능하다.!!!	
	  //접근 방법: 클래스명.변수명
	  System.out.println("클래스 변수 출력=" + Student.grade); 	
	  System.out.print("-------------------");
	  
	  Student st = new Student();
	  st.studentName = "이지원";
	  System.out.println("학년 =" + st.grade);
	  System.out.print("-------------------");
	  
	  st.show();
	  System.out.println("-------------------");
	  
	  //2번째 객체 생성
	  Student st1 = new Student();
	  st1.studentName = "손수경";
	  st1.grade=1;
	  System.out.println("이름=" + st1.studentName);
	  System.out.println("학년=" + st1.grade);
	  System.out.println("-------------------");
	  
	  Student st2 = new Student();
	  st2.studentName =  "박재욱";
	  System.out.println("이름=" + st2.studentName);
	  System.out.println("학년=" + st2.grade);
	  System.out.println("-------------------");
	}

}
