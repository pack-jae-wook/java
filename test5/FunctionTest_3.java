package test5;

import java.util.Scanner;

public class FunctionTest_3 {
	
	
	
	//                                num1, num2
	public static int sum(int a, int b) {	
				return a + b;	 //호출한 곳으로 반환값(결과값)을 돌려준다.	
	}	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("정수1 입력 >>");
		int num1 = sc.nextInt();
		
		System.out.println("정수2 입력 >>");
		int num2 = sc.nextInt();
		
		//public static int sum(int a, int b) 
		sum(num1, num2);
		int total = sum(num1, num2);
		
		System.out.println("함수내에서 돌려받은값을 저장한 total변수 = " + total);
		
	}

}
