package test5;

public class FunctionTest {

	//함수(function) : 하나의 기능을 수행하는 일련의 코드이다. 어떤 재료를 넣어서 새로운 값을 만드는 틀이다.
	//함수는 정의와 호출로 이루어진다.(함수 정의만 해놓으면 바로 사용할 수 없고 꼭 호출을 해서 사용한다.)
	//형식)반환데이터형 함수이름(매개변수 or 인자 or 인수) 
	//    { 수행할 내용 
	//      return 반환값; 
	//    }
	
	//함수 정의
	//1유형 : 함수내에서 처리한 결과값을 반환할 필요가 없고, 함수내에서 수행에 필요한 데이터값을 넣어주지 않아도 되는 경우
	//1유형 : 반환값이 없고, 매개변수가 없는 경우
	
	public static void add() {
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("reault = " + result);
		return;
	}
		
	//2유형 : 함수내에서 처리한 결과값을 반환할 필요가 없고, 함수내에서 수행에 필요한 데이터값을 넣어주어야 하는 경우
	//2유형 : 반환값이 없고, 매개변수가 있는 경우
	
	//                 add1(50, 30);
	//                 add1(10, 20);
	//                          10  ,     20
	public static void add1(int num1, int num2) {		
		int result = num1 + num2;
		System.out.println("reault = " + result);
		return;
	}
	
	
	//3유형 : 함수내에서 처리한 결과값을 반환할 필요가 있고, 함수내에서 수행에 필요한 데이터값을 넣어주어야 하는 경우
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	
	//                add2(     10,      20)
	public static int add2(int num1, int num2) {
		int result = num1 + num2;
		return result; //호출한 곳으로 반환값(결과값)을 돌려보낸다.!!!(30을 정수형으로 돌려보낸다.)
	}
	
	
	public static void main(String[] args) {
	
		/*
		//함수호출 형식) 함수이름(매개변수값 or 인자값 or 인수값); 
		//1유형 : 반환값이 없고, 매개변수가 없는 경우
		add();
		System.out.println("---------------");
		
		//2유형 : 반환값이 없고, 매개변수가 있는 경우
		//void add1(int num1, int num2);
		add1(10, 20);
		add1(50, 30);
		System.out.println("---------------");
		
		//3유형 : 반환값이 있고, 매개변수가 있는 경우
		//int add2(int num1, int num2)
		//add2(10, 20); //호출도 하고 함수내에서 돌려보내준 (반환받은)값을 가지고 있다.
		int sum = add2(10, 20);
		System.out.println("sum = " + sum);
		System.out.println("sum = " + add2(10, 20));
		*/
		
		int num1 = 0;
		int num2 = 10;
		
		
		
		
	}

}
