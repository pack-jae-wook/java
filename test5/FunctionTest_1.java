package test5;

public class FunctionTest_1 {
	
	 //함수(function) : 하나의 기능을 수행하는 일련의 코드이다. 어떤 재료를 넣어서 새로운 값을 만드는 틀이다.
	//함수는 정의와 호출로 이루어진다.(함수 정의만 해놓으면 바로 사용할 수 없고 꼭 호출을 해서 사용한다.)
	//형식)반환데이터형 함수이름(매개변수 or 인자 or 인수) 
	//    { 수행할 내용 
	//      return 반환값; 
	//    }
		
	
	//원의 넓이를 구하는 함수를 정의하고 main 함수에서 호출하기
	//함수 정의
	//1유형 : 함수내에서 처리한 결과값을 반환할 필요가 없고, 함수내에서 수행에 필요한 데이터값을 넣어주지 않아도 되는 경우
	//1유형 : 반환값이 없고, 매개변수가 없는 경우
	
	public static void circle() {
		
		//원의 넓이 = 반지름 * 반지름 * 3.14;
		int radius = 10; //반지름을 담고 있는 변수
		double result = radius * radius * 3.14;
		System.out.println("원의 넓이 result = " + result);
		//System.out.println("원의 넓이 result = " + (radius * radius * 3.14));
		return ;
	}
	
	
	//2유형 : 함수내에서 처리한 결과값을 반환할 필요가 없고, 함수내에서 수행에 필요한 데이터값을 넣어주어야 되는 경우
	//2유형 : 반환값이 없고, 매개변수가 있는 경우
	
	//                                          
	//                                          10
	public static void circle1(int radius) {
		
		//                         10  *    10       * 3.14;
		double result = radius * radius * 3.14;
		System.out.println("원의 넓이 result = " + result);
		return;
	}
	

	//3유형 : 함수내에서 처리한 결과값을 반환할 필요가 있고, 함수내에서 수행에 필요한 데이터값을 넣어주어야 되는 경우
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	
	//                                                10
	public static  double circle2(int radius) {
		
		double result = radius * radius * 3.14;
		return result; //호출한 곳으로 반환값(결과값)을 돌려준다.
		
	}
	
	
	public static void main(String[] args) {
		
		//함수 호출 형식) 함수이름(매개변수값 or 인수 or 인자)
		//1유형 함수 호츨
		circle();
		System.out.println("-----------------");
		
		//2유형 함수 호츨
		//public static void circle1(int radius)
		circle1(10);		
		circle1(5);		
		System.out.println("-----------------");
		
		//3유형 함수 호츨
		//public static  double circle2(int radius)
		circle2(10); //처음에는 함수 호출하고 나중에는 함수내에서 돌려받은 결과값을 가지고 있다.
		
		//변수에 함수내에서 돌려받은값을 저장해서 다른 곳에서 재사용
		double result = circle2(10);
		System.out.println("함수내에서 돌려받은 반환값을 저장한 변수 result = " + result);
		
		//함수내에서 돌려받은값을 확인만 하는 경우
		System.out.println("함수내에서 돌려받은 반환값을 출력 = " + circle2(10));
		
	}

}
