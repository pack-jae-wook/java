package test5;

//설계만 해놓은 클래스이다.
public class Stduent2 {
	
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
		

}
