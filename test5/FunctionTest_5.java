package test5;

public class FunctionTest_5 {

	//2개의 정수와 하나의 연산자를 매개변수로 입력받아 더하기, 빼기, 곱하기, 나누기 결과를 모두 출력하는 함수를 정의하고
	//main 함수에서 호출하는 프로그램 작성
	
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	//if ~ else if ~ else문
	//switch case문 
	
	//                                '+'        ,   10 ,    20
	public static int cal(char oper, int a, int b) {
		
		/*
		switch (oper) {
		case '+': 	return a + b;	//호출한 곳으로 반환값(결과값)을 돌려준다.		
			
		case '-': 	return a - b;	//호출한 곳으로 반환값(결과값)을 돌려준다.		
		
		case '*': 	return a * b;	 //호출한 곳으로 반환값(결과값)을 돌려준다.		
		
		case '/':  	return a + b;	//호출한 곳으로 반환값(결과값)을 돌려준다.		
			
		default :  return 0;		//호출한 곳으로 반환값(결과값)을 돌려준다.	
		}	
		*/
		
		if (oper == '+') return a+ b;
		else if (oper == '-') return a- b;
		else if (oper == '*') return a* b;
		else if (oper == '/') return a/ b;
		else return 0;
	}	
	
	
	//1개의 정수를 매개변수로 입력받아서 입력값이 양수, 0, 음수인지 문자열로 (반환)출력하는 함수를 정의하고
	//main 함수에서 호출하는 프로그램 작성
	//3유형 : 반환값이 있고(String), 매개변수값이 있는 경우(int)
	//                   양수, 0, 음수    ,       1
	
	
	//                                          10
	public static String func(int num) {
		
		/*
		String result; 
		
		    //  10
			if (num > 0) {
				result = "양수";
				
			} else if (num == 0) {
				result = "제로";
				
			} else {
				result = "음수";
			}
		
			//       "양수"
			return result; //호출한 곳으로 반환값(결과값)을 돌려준다.
		 */
		
		    //   10
			if (num > 0) {
				return "양수";
				
			} else if (num == 0) {
				return "제로";
				
			} else {
				return "음수";
			}
	}
	
	
	
	public static void main(String[] args) {
		
		//public static int cal(char oper, int a, int b)
		int result = cal('+', 10, 20); //함수 호출도 하고 결과값도 가지고 있다.
		System.out.println("함수내에서 돌려받은 값을 저장해놓은 result변수 = " + result);
		System.out.println("함수내에서 돌려받은 값 출력 = " + cal('+', 10, 20));
		System.out.println("---------------");
				
		int result1 = cal('-', 10, 20); //함수 호출도 하고 결과값도 가지고 있다.
		System.out.println("함수내에서 돌려받은 값을 저장해놓은 result1변수 = " + result1);
		System.out.println("함수내에서 돌려받은 값 출력 = " + cal('-', 10, 20));
		System.out.println("---------------");
		
		//public static String func(int num)
		
		//func(10); //함수 호출도하고 함수내에서 돌려받은 반환값(결과값)도 가지고 있다.
		String result2 = func(-1);
		System.out.println("함수내에서 돌려받은 값을 저장해놓은 result2변수 = " + result2);
		System.out.println("함수내에서 돌려받은 값 출력 = " + func(-1));
		System.out.println("---------------");
		
	}

}
