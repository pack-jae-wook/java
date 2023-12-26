package test5_2;

public class Student_Main {

	public static void main(String[] args) {
		
		
	  //기본생성자 호출해서 객체(인스턴스)생성
	  //public Student()호출	
      Student s = new Student();
      s.show();
      System.out.println("-------------");
    
      //일반 생성자 호출해서 객체(인스턴스)생성
      //멤버 변수 4개의 데이터값을 입력하지 않으면 객체를 생성해주지 않는다.!!
      Student s1 = new Student(231130,"김자바",3,"부산광역시");
      s1.show();
      System.out.println("-------------");
	}

}
