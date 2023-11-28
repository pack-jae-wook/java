package test5;

public class FunctionTest_4 {
	
	
	//p136
	//1개의 이름을 매개변수로 입력받아 출력하는 함수를 정의하고 main함수에서 호출하는 프로그램을 작성
	//2유형 : 반환값이 없고, 매개변수가 있는 경우
	
	public static void printGreeting(String name) {
	
			System.out.println(name + "님 안녕하세요..!!!");
		
		return;
	}
	
	
	//1개의 이름을 매개변수로 입력받아 10번 출력하는 함수를 정의하고 main함수에서 호출하는 프로그램을 작성
	public static void printGreeting1(String name) {
		
		for ( int i = 1 ; i <= 10 ; i++) {
			System.out.println(name + "님 안녕하세요..!!!");
		}
	
		return;
	}
	
	//2개의 정수를 매개변수로 입력받아 나누기 연산을 수행하는 함수를 정의
	//조건 : 
	//2번째 매개변수가 0이면 함수 수행을 멈추고.
	//2번째 매개변수가 0이 아니면 나누기 연산을 수행
	//main함수에서 호출하는 프로그램을 작성
	
	//                                            10     ,      0
	//                                            10     ,      2
	public static void divide(int num1, int num2) {
		//10/0 -> 프로그램 수행 중단된다!!
		
		//    0     ==  0
		if ( num2 == 0 ) {
			System.out.println("나누는 수는 0이 될 수 없습니다.!!");
			return; //함수 수행 종료
		} 
		else {
			//                  10    /  2
			int result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result + "입니다.!!!");
		}		
	}

	public static void main(String[] args) {
		
		//2유형 함수 호출
		//public static void printGreeting(String name)
		printGreeting("자바");
		printGreeting("이세나");
		System.out.println("----------------");
		
	   //public static void printGreeting1(String name)
		printGreeting1("함수");
		System.out.println("----------------");
		
		System.out.println(10/2);
		//System.out.println(10/0);
		System.out.println(0/2);
		System.out.println("----------------");
		
		//public static void divide(int num1, int num2) 
		divide(10, 2);
		divide(10, 0);
		
	}

}
