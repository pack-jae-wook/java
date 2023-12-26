package test5_2;

//정보 은닉:멤버변수에 새로운 데이터값을 넣지 못하도록 한다.!!!
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
	public int grade;
	public String address;
	
	//기본 생성자(default constructor)
	 public Student() { }
	
	//일반생성자
	//멤버 변수4개의 데이터값을 입력하지 않으면 객체를 생성해주지 않는다.!!
	 
	/*
	public Student(int ID, String Name, int g, String ad){
		//멤버변수 = 매개변수(메서드 내에서만 사용되고 사라지는 변수)
		studentID = ID;
		studentName = Name;
		grade = g;
		address = ad;
		
	}*/
	 
	 //                  231130,         "김자바",         3,        "부산광역시"
	 public Student(int studentID,String studentName,int grade,String address) {
	    //** this키워드 사용: 클래스의 멤버변수와 매서드안에서만 사용되는 매개변수의 (이름이 같은 경우) 구분을 명확히 하기 위해 사용된다.
		//** 클래스내에서 자신의 멤버에 접근하고자 할때도 사용된다.
		//** this가 지정된 변수는 클래스내에서 사용되는 멤버 변수라고 표현한다.!!!
		//멤버 변수 = 매개변수에 담긴값
		 
		 this.studentID = studentID;
		 this.studentName = studentName;	 
		 this.grade = grade;
		 this.address = address;
	 }
	
    public void show() {
    	System.out.println("학번= " + studentID);
    	System.out.println("이름= " + studentName);
    	System.out.println("학년= " + grade);
    	System.out.println("주소= " + address);
    }
}
