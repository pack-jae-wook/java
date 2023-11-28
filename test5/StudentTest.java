package test5;

//main함수를 포함한 실행 클래스를 따로 작성한 클래스이다.
public class StudentTest {

	public static void main(String[] args) {
		
		//클래스명 변수명 = new 클래스명();
		Stduent2 st = new Stduent2();
		
		System.out.println("-- 1번째 객체 만들기 : st --");
		System.out.println("st = " + st);
		System.out.println("--------------");
		
		st.show();
		System.out.println("--------------");
		
		st.studentName = "김자바";		
		System.out.println("이름 = " + st.studentName);
		
		st.getStudentName(); //호출도 하고 결과값도 가지고 있다.
		System.out.println("이름 = " + st.getStudentName());
		
		
		System.out.println("-- 2번째 객체 만들기 : st1 --");		
		Stduent2 st1 = new Stduent2();
		
		System.out.println("st1 = " + st1);
		System.out.println("--------------");
		
		st1.show();
		System.out.println("--------------");
		
		st1.studentName = "두번째";		
		System.out.println("이름 = " + st1.studentName);
		
		st1.getStudentName(); //호출도 하고 결과값도 가지고 있다.
		System.out.println("이름 = " + st1.getStudentName());
		
	}

}
