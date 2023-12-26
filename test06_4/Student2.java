package test06_4;

//static멤버 = static으로 지정한 멤버 변수 or 멤버 메서드
//static 키워드를 붙여놓은 멤버 변수 or 멤버 메서드
//접근형식) 클래스명.static변수명
//static  변수 = 정적변수 = 클래스 변수(class) 변수
//static영역 : 클래스 파일(*.class)의 bytecode가 로드되는 장소이다.
//class가 로드될때 클래스 내부에 정의된 클래스 변수와 클래스 메서드는 할당되고 초기화된다.
//객체의 생성없이 바로 접근(사용)할 수 있다.
//->static 영역에 존재하는 변수와 메서드는 객체가 생성되기 이전에 이미 할당되어 있기 때문이다.
//**static키워드를 통해 static영역에 할당된 변수와 메서드는 모든 객체가 공유해서 사용한다.
//클래스에 기반하기 때문에 클래스 변수(class variable),클래스 메서드(class method)라고 한다.

//인스턴스멤버 = 객체생성후 사용할 수 있는 멤버 static 키워드가 붙지 않은 멤버 변수 or 멤버 메서드
//반드시 객체를 생성해서 생성된 객체내에서만 변수나 메서드를 사용할 수 있다.
//접근형식)객체명,변수명

public class Student2 {
	
	//클래스 변수내의 데이터값을 수정하지 못하도록-> private 접근 제어자
	private static int serialNum = 1000; //클래스 멤버, 클래스 변수
	public int studentID;
	private String studentName;
	public int grade;
	public String address;
	
	//기본 생성자
	public Student2() {
		serialNum++;
		this.studentID = serialNum;
	}
	
	
	
	//클래스 변수에 접근해서 데이터값을 가져오는 메서드
	//getter
	public static int getSerialNum() {
		return serialNum;
	}

   
   //setter : 클래스 변수에 접근해서 새로운 데이터값을 넣어주는 메서드
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}





	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	//멤버 변수내에 저장되 데이터값을 출력하는 일반 메서드
     public void show() {
    	 System.out.println("studentID=" + studentID);
    	 System.out.println("studentName=" + studentName);
    	 System.out.println("grade" + grade);
    	 System.out.println("address=" + address);
     }
	
	
	
}
