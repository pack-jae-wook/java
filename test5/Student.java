package test5;

//학생관리를 위해서 만들어 놓은 클래스 : 설계도를 만든다.
//컴퓨터 내부에서 아무런 기능(동작)을 할 수 없다.
public class Student {
	
	//클래스내의 변수 = 속성 = 특징
	int studentID; //학번을 담아두는 멤버 변수
	String studentName; //학생이름을 담아두는 멤버 변수
	int grade; //학년을 담아두는 멤버 변수
	String address; //주소를 담아두는 멤버 변수	
	
	//클래스내의 함수: 메서드(method) = 동작을 하기 위해서 만듬 
	void show() {
		System.out.println("학번 : " + studentID );
		System.out.println("이름 : " + studentName );
		System.out.println("학년 : " + grade );
		System.out.println("주소 : " + address );		
	}
		
	public static void main(String[] args) {
		
		//객체 생성 (인스턴스 생성): 클래스 설계대로 메모리 공간에 배치시켜서 사용하기
		//int a = 10;
		//System.out.println(a);
		
		//Student st;
		//st = new Student();
		
		Student st = new Student();
		
		st.studentID = 20231123;
		st.studentName = "김하나";
		st.grade = 3;
		st.address = "부산광역시 부산진구 동천로 19";
		
//		System.out.println("학번 : " + st.studentID);
//		System.out.println("이름 : " + st.studentName);
//		System.out.println("학년 : " + st.grade);
//		System.out.println("주소 : " + st.address);
		
		//1유형 멤버 메서드 호출
		//void show() 
		st.show();
		

	}

}
