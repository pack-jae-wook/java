package test5_3;
//정보 은닉:멤버변수에 새로운 데이터값을 넣지 못하도록 한다.!!!
//->멤버 앞에 private 접근제어자를 붙여서 새로운 데이터값을 대입하지 못하도록 한다.

//접근 제어자
//1)public:외부 클래스 어느 곳에나 접근 제한이 없다.
//2)protected:동일한 패키지 내에 존재하거나 상속관계의 하위 클래스에서만 접근이 가능하다.
//3)아무것도 없는 경우(default):아무런 접근 제어자를 지정하지 않은 경우이고, 동일한 패키지 내에서만 접근이 가능하다.
//4)private : 자신의 클래스 내에서만 접근이 가능하다.

//this키워드
//** 클래스의 멤버변수와 메서드안에서만 사용되는 매개변수의 (이름이 같은 경우) 구분을 명확기 하기 위해 사용된다.
//this 키워드를 통해 클래스내의 멤버에 접근할 수 있다.!!
//자기 자신(객체)의 메모리 주소를 나타낸다.
//객체 자신의 참조가 필요할 경우에 사용된다.
public class Student {
 public int studentID;
 private String studentName;
 private int grade;
 public String address;
 
 //생성자를 하나라도 개발자가 만들어주지 않으면 컴파일러가 기본 생성자(default construct)형식으로 만들어서
 //추가해서 멤버 변수의 자료형이 가지고 있는 기본값으로 멤버 변수데 데이터값을 초기화시켜준다.
 public Student() { }
 
 
 //private 접근제어자로 대입할 수 없는 멤버 변수에 데이터값을 넣을 수 있도록 하는 방법
 //필요시에 멤버 변수에 데이터값을 넣어야 하는 경우 필요하다.!!
 //**세터(setter)와 게터(getter)메서드 작성
 //**설정자 메서드: 세터(setter), 접근자 메서드: 게터(getter)
 
 //private 변수 1개당 접근자와 설정자는 각각1개씩 존재해야 한다.!!
 //일반 메서드 형식
 //접근자 메서드: 게터(getter)->멤버 변수에 저장된 데이터값을 가져오는 역할을 하는 메서드 작성
 public String getStudentName() {
	 //멤버 변수내의 값을 반환받아와야 한다.!!!
	 return this.studentName;//호출하는 곳으로 반환값(결과값)을 돌려준다.!!!
 }
 //설정자 메서드 : 세터(setter) -> 멤버 변수에 새로운 데이터값을 저장하는 역할을 하는 메서드 작성
 public void setStudentName(String studentName){
	 //멤버 변수 = 매개변수값
	 //this.studentName = "이상엽";
	 this.studentName = studentName;
 }
 public int getGrade() {
	 return this.grade;
 }
 
 public void setGrage(int grade) {
	 
	 //멤버 변수 = 매개변수값
	 this.grade = grade;
 }
 
 //멤버 변수내의 데이터값을 출력해주는 일반 메서드 작성
 public void show() {
	 System.out.println("studentID=" + studentID);
	 System.out.println("studentName=" + studentName);
	 System.out.println("grade" + grade);
	 System.out.println("address=" + address);
 }
 
}
