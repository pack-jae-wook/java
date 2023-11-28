package test5;

//학생관리를 위한 클래스(설계도)를 만들고 객체(인스턴스)만들어서 사용
public class Student1 {
	
	int studentID; //학번을 담아두는 멤버 변수
	String studentName; //학생이름을 담아두는 멤버 변수
	int grade; //학년을 담아두는 멤버 변수
	String address; //주소를 담아두는 멤버 변수	
	
	//4개의 멤버 변수에 저장되어 있는 데이터값을 출력하는 메서드
	//1유형 : 반환값이 없고, 매개변수가 없는 경우
	void show() {
		System.out.println("학번 = " + studentID);
		System.out.println("이름 = " + studentName);
		System.out.println("학년 = " + grade);
		System.out.println("주소 = " + address);
	}
	
	//멤버 변수의 이름에 저장되어 있는 데이터값 출력하는 메서드
	//4유형 : 반환값은 있고, 매개변수가 없는 경우
	String getStudentName() {
		return studentName; //멤버 변수 이름에 저장되어 있는 값만 호출한 곳으로 돌려준다.!!! 
	}
	
	
	public static void main(String[] args) {
		
		//자료형 변수명  = 값;
		int a = 10;
		
		//객체생성(인스턴스 생성)
		//자료형 변수명  = 값;
		//자료형 참조(변수명) or 객체명 = Heap영역에 배치하라 자료형();
		//Student1 st;
		//st = new Student1();
		
		//Student1 클래스내의 멤버 변수들을 Heap영역에 배치시키고 stack영역의 st변수에 찾아갈 주소를 담아준다.
		Student1 st = new Student1();
		
		System.out.println("a변수 = " + a); //변수명에는 값이 들어있음
		System.out.println("st변수 = " + st); //참조변수명(객체명)에는 주소가 들어있음
		System.out.println("------------------");
		
		System.out.println(st.studentID);
		System.out.println(st.studentName);
		System.out.println(st.grade);
		System.out.println(st.address);
		System.out.println("------------------");
		
		//멤버 변수에 데이터값 넣기
		st.studentID = 231127;
		st.studentName = "김자바";
		st.grade = 3;
		st.address = "부산광역시";
		
		System.out.println("학번 = " + st.studentID);
		System.out.println("이름 = " + st.studentName);
		System.out.println("학년 = " + st.grade);
		System.out.println("주소 = " + st.address);
		System.out.println("------------------");
		
		//1유형 호출
		st.show();
		System.out.println("------------------");
		
		//4유형 호출
		st.getStudentName(); //함수 호출도하고 결과값도 가지고 있다.
		String name = st.getStudentName();
		System.out.println("이름 = " + name);
		System.out.println("이름 = " + st.getStudentName());
		System.out.println("------------------");
		
		st.studentName = "프로그래밍";
		System.out.println("이름 = " + st.studentName); //멤버 변수명으로 출력
		System.out.println("이름 = " + st.getStudentName()); //만들어 놓은 메서드로 결과값 출력
		System.out.println("------------------");
	}

}
