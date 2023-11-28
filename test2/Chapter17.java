package test2;

import java.util.Scanner;

public class Chapter17 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 /*
		 //Q1.
		 //2개의 정수와 연산자를 입력받아 + , -, * , / , % 연산을 수행하는 프로그램작성
		 //int num1 = 10;
		 //int num2 = 2;
		 //char operator = '+'; //조건 지정 		
		 // 1)if ~ else if ~ else 문
		 // 2)switch case문 
		
		
		
		 //int num1 = 10;
		 //int num2 = 2;
		 //char operator = '-';
		 System.out.println("num1 변수값 입력 >>");
		 int num1 = sc.nextInt();
		 
		 System.out.println("num2 변수값 입력 >>");
		 int num2 = sc.nextInt();
		 
		 System.out.println("operator 연산자 입력 >>");
		 char operator = sc.next().charAt(0);
		 
		 if (operator == '+') {
			 System.out.println("num1 + num2 = " + (num1 + num2));
		 }
		 else if (operator == '-') {
			 System.out.println("num1 - num2 = " + (num1 - num2));			 
		 }
		 else if (operator == '*') {
			 System.out.println("num1 * num2 = " + (num1 * num2));			 
		 }
		 else if (operator == '/') {
			 System.out.println("num1 / num2 = " + (num1 / num2));			 
		 }
		 else {
			 System.out.println("잘못된 연산자 입니다.!!!");
		 }
		 
		 
		 switch (operator) {
		 
		 case '+':
			 System.out.println("num1 + num2 = " + (num1 + num2));
			 break;
			 
		 case '-':
			 System.out.println("num1 - num2 = " + (num1 - num2));
			 break;
			 
		 case '*':
			 System.out.println("num1 * num2 = " + (num1 * num2));
			 break;
			 
		 case '/':
			 System.out.println("num1 / num2 = " + (num1 / num2));
			 break;
			 
		 default :
			 System.out.println("잘못된 연산자 입니다.!!!");
			 break;
		 }
		 System.out.println("----------------");
		 */
		 
		 /*
		 //Q2.구구단 2단 ~ 9단까지 모두 출력 (for문)
		 //이중 for문 : 바깥 for문이 1번 수행될 동안 안쪽 for문은 반복횟수를 모두 수행해야 한다.!!!
		 
		 //2 * 1 = 2, 2 * 2 = 4
		 //단수(2)  * 곱해주는 수(1 ~ 9) = 곱한값
		
		 //int dan; //초기화변수
		 
		 //바깥쪽 for문 : 단수 (2단 ~ 9단)
		 for (int dan = 2 ;  dan <= 9 ; dan++) {			
			 System.out.println(dan + "단");
			 
			//안쪽 for문 : 곱해주는 수 (1 ~ 9)
			 for (int i = 1 ; i <= 9 ; i++) {
				 
				 System.out.println(dan + " * " + i + " = " + (dan * i));
			 }
			 System.out.println();
			 
		 }
		 System.out.println("----------------");
		 
		//Q2-1.구구단 2단 ~ 9단까지 짝수단만 출력 (for문)
		
		//바깥쪽 for문 : 단수 (2단 ~ 9단)
		 for (int dan = 2 ;  dan <= 9 ; dan++) {			
			 System.out.println(dan + "단");
			 			 
			 if ( dan % 2 == 1) { //dan이 홀수이면 다시 바깥 for문 단을 반복 수행하러 가기!!!
				 continue;
			 }
			 
			//안쪽 for문 : 곱해주는 수 (1 ~ 9)
			 for (int i = 1 ; i <= 9 ; i++) {
				 
				 System.out.println(dan + " * " + i + " = " + (dan * i));
			 }
			 System.out.println();
			 
		 }
		 System.out.println("----------------");
		 
		//Q3.구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		//2단
		//2*1=2
		//2*2=4
			
		//3단
		//3*1=3
		//3*2=6
		//3*3=9
		
		//바깥쪽 for문 : 단수 (2단 ~ 9단)
		 for (int dan = 2 ;  dan <= 9 ; dan++) {			
			 System.out.println(dan + "단");
					 
			//안쪽 for문 : 곱해주는 수 (1 ~ 9)
			 for (int i = 1 ; i <= 9 ; i++) {
				 
				 System.out.println(dan + " * " + i + " = " + (dan * i));
				 
				 //   3  <= 3 :참 -> break
				 //   3  <= 2 :거짓
				 //   3  <= 1 :거짓
				 
				 //   2  <= 2 :참 -> break
				 //   2  <= 1 : 거짓
				 if (dan <= i) {
					 break;
				 }
				 
			 }
			 System.out.println();
			 
		 }
		 System.out.println("----------------");
		 */
		 
		 //Q4.별찍기 - 1
		 
		 //별찍기 - 1)
		 	//1줄*****
			//2줄*****
			//3줄*****
			//4줄*****
			//5줄*****		 
		 for (int i = 1 ; i <= 5 ; i++) {			 
			 
			 for (int j = 1 ; j <= 5 ; j++) {
				 System.out.print("*");
			 }
			 
			 System.out.print(i + "줄");
			 System.out.println();
			 
		 }
		 System.out.println("---------------");
		
		//별찍기 - 2
		//*1줄
		//**2줄
		//***3줄
		//****4줄
		//*****5줄
		 
		 //		      2
		 //           1
		 for (int i = 1 ; i <= 5 ; i++) {			 
		
			 
			 //               2 <= 2  -> 별을 두개 찍기           
			 //               1 <= 2  -> 별을 두개 찍기
			 
			 //               1 <= 1  -> 별을 하나만 찍기   
			 for (int j = 1 ; j <= i ; j++) {
				 System.out.print("*");
			 }
			 
			 System.out.print(i + "줄");
			 System.out.println();
			 
		 }
		 System.out.println("---------------");
		
		//별찍기 - 3
		//*****1줄
		//****2줄
		//***3줄
		//**4줄
		//*5줄
		 for (int i = 1 ; i <= 5 ; i++) {			 
		
			 //           3  3 <= 5 ->3번 반복
			 //           2  2 <= 5 ->4번 반복
			 //           1  1 <= 5 ->5번 반복
			 for (int j = i; j <= 5 ; j++) {
				 System.out.print("*");
			 }
			 
			 System.out.print(i + "줄");
			 System.out.println();
			 
		 }
		 System.out.println("---------------");
		 
		 //
		 //SSSSS*1줄
		 //SSSS**2줄
		 //SSS***3줄
		 //SS****4줄
		 //S*****5줄
		 for (int i = 1 ; i <= 5 ; i++) {	
			 
			 for (int j = i; j <= 5 ; j++) {
				 System.out.print("S");
				 
			 }
			 
			 for (int k = 1 ; k <= i ; k++) {
				 System.out.print("*");
			 }
			 
			 System.out.print(i + "줄");
			 System.out.println();			  
			 
		 }
		 System.out.println("---------------");
		 
		 //별찍기 - 4
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		 
		 for (int i = 1 ; i <= 5 ; i++) {	
			 
			 //           2  2 <= 5
			 //           1  1 <= 5       
			 for (int j = i; j <= 5 ; j++) {
				 //System.out.print("S");
				 System.out.print(" ");
			 }
			 
			 //                   (3 * 2) + 1   = 7  			 
			 //                   (2 * 2) + 1   = 5    			 
			 //                   (1 * 2) + 1   = 3       
			 for (int k = 3; k <= (i * 2) + 1 ; k++) {
				 System.out.print("*");
			 }
			 
			
			 /*
			 //               1 <= 2
			 //               1 <= 1
			 for (int j = 1 ; j <= i ; j++) {
				 System.out.print("*");
			 }
			 
			 
			 for (int j = 1 ; j <= i - 1 ; j++) {
				 System.out.print("*");
			 }
			 */
			 System.out.print(i + "줄");
			 System.out.println();
		 }
		 
		 
		 
		 
	}

}
