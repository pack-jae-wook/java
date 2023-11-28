package test5;

public class FunctionTest_2 {
	
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	
	//                       
	//기존의 변수내의 값을 함수의 매개변수값으로 넣기
	//                           num1 = 10,  num2  = 20 //
	//                                 10,       20
	public static int add(int n1, int n2) {
		
		int result = n1 + n2;
		return result; //호출한 곳으로 반환값(결과값)을 돌려준다.
		
	}
	
	//예제1)
	//매개변수 : 함수내에서만 사용하는 변수
	//3유형으로 작성 : 반환값이 있고, 매개변수가 있는 유형
	//4개의 함수 작성(정의) 
	//1)더하기 연산을 하는 함수 : sum 
	//2)빼기 연산을 하는 함수 : sub
	//3)곱하기 연산을 하는 함수 : mul
	//4)나누기 연산을 하는 함수 : div
	//각 함수는 2개의 매개변수를 입력받아 더하기 연산, 빼기 연산,곱 하기 연산, 나누기 연산을 수행
	//main 함수에서 호출하여 사용하기
	
	//                                 10  ,  20
	public static int sum(int a, int b) {	
			
		    //      30 =  10  +  20
			//int result = a + b;
			//         30
			//return result; //호출한 곳으로 반환값(결과값)을 돌려준다.
			return a + b;		
	}
	
	//                                 10,  20
	public static int sub(int a, int b) {
			//       10 - 20;
			return a - b;	//호출한 곳으로 반환값(결과값)을 돌려준다.
	}
	
	//                                10,   20
	public static int mul(int a, int b) {	
			//      10 * 20
			return a * b;	//호출한 곳으로 반환값(결과값)을 돌려준다.	
	}
	
	//                               10,   20
	public static int div(int a, int b) {	
			//       10 / 20
			return a / b;	//호출한 곳으로 반환값(결과값)을 돌려준다.	
	}
	

	public static void main(String[] args) {
		
		//public static int add(int n1, int n2)
		add(10, 20); //처음에는 호출하고 나중에는 함수내에서 돌려받은 반환값(결과값)을 가지고 있다.
		int sum = add(10, 20);
		System.out.println("함수내에서 돌려받은 결과값 sum변수 = " + sum);
		System.out.println("함수내에서 돌려받은 결과값 출력= " + add(10, 20));
		System.out.println("-------------------");
		
		int num1 = 10;
		int num2 = 20;
	
		//기존의 변수내의 값을 함수의 매개변수값으로 넣기
		//public static int add(int n1, int n2)
		//add(num1 = 10, num2=20);
		add(num1, num2);
		
		int sum1 = add(10, 20);
		System.out.println("함수내에서 돌려받은 결과값 sum1변수 = " + sum1);
		System.out.println("함수내에서 돌려받은 결과값 출력= " + add(num1, num2));
		System.out.println("-------------------");
		
		//public static int sum(int a, int b) 
		sum(10, 20); //먼저 함수 호출하고 나중에는 함수내에서 돌려받은 반환값(결과값)을 가지고 있다.
		
		int total = sum(num1, num2); //호출도 하고 결과값도 가지고 있다.
		System.out.println("함수내에서 돌려받은 결과값 total 변수 = " + total);
		System.out.println("함수내에서 돌려받은 결과값 확인 = " + sum(10, 20));
		System.out.println("-------------------");
		
		//public static int sub(int a, int b)
		
		sub(10, 20); //호출도 하고 결과값도 가지고 있다.
		int total1 = sub(10, 20);
		System.out.println("함수내에서 돌려받은 결과값 total1 변수 = " + total1);
		System.out.println("함수내에서 돌려받은 결과값 확인 = " + sub(10, 20));
		System.out.println("-------------------");
	
		//public static int mul(int a, int b)
		mul(10, 20);
		int total2 = mul(10, 20);
		System.out.println("함수내에서 돌려받은 결과값 total2 변수 = " + total2);
		System.out.println("함수내에서 돌려받은 결과값 확인 = " + mul(10, 20));
		System.out.println("-------------------");
	
		//public static int div(int a, int b) 
		div(10, 20);
		int total3 = div(10, 20);
		System.out.println("함수내에서 돌려받은 결과값 total3 변수 = " + total3);
		System.out.println("함수내에서 돌려받은 결과값 확인 = " + div(10, 20));
		System.out.println("-------------------");
		
		
	}
	

}
