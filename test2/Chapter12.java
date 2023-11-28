package test2;

import java.util.Scanner;

public class Chapter12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//switch문 : 하나의 변수나 수식에 대한 다양한 조건을 검사할 때 사용한다.
		//switch(변수하나, 수식하나),case 비교할기준값:, break, default 키워드 사용
		
		/*
		//1.정수를 입력받아서 홀수인지 짝수인지 구분해서 출력하기
		// 양수와 음수값을 모두 입력받아서 홀수인지 짝수인지 구분해서 출력하기
		while (true) {
			
		System.out.println("정수를 입력하세요 >>");
		int score = sc.nextInt();
		
		//((양수 % 2) == 1) -> “홀수"
		//((양수 % 2) == 0) -> “짝수"
		//((음수 % 2) == -1) -> “홀수”
		//((음수 % 2) == 0) -> “짝수”
		
		score = score % 2;
		switch (score) {
		
		case 0: System.out.println("짝수 입니다.!!!");
			break;
			
		case 1: System.out.println("홀수 입니다.!!!");
			break;
		
		case -1: System.out.println("홀수 입니다.!!!"); //음수값 홀수 구분
			break;	
		
		default : System.out.println(" 다시 입력.!!!");
			break;
		}
		
		}
		*/
		
		/*
		//점수를 입력받아 학점 계산하기
		//90점 이상이면 "A" (90 ~ 100점)
		//80점 이상이면 "B" (80 ~ 89점)
		//70점 이상이면 "C" (70 ~ 79점)
		//60점 이상이면 "D" (60 ~ 69점)
		//60점 미만은 "F"로 표시 ( 0 ~ 59점)
		
		while (true) {
		System.out.println("점수를 입력하세요 ( 0 ~ 100 사이 정수값만 입력 )>>");
		int score = sc.nextInt(); //키보드에서 입력받은 정수형 점수를 저장
		String grade = "";
		
		if ( (score < 0) || (score > 100)) {
			System.out.println("점수가 잘못 입력되었습니다.!!!");
		} 
		else {
			
		switch (score / 10) {
		case 10: grade = "A"; //100,101,102,103,104,105,106,107,108,109
			break;
		case 9: grade = "A"; //90,91,92,93,94,95,96,97,98,99
			break;		
		case 8: grade = "B";
			break;
		case 7: grade = "C";
			break;
		case 6: grade = "D";
			break;		
		default:  grade = "F";		
			break;		
		}		
		System.out.println("학점 : " + grade);
		System.out.println("------------");
		}
		}
		*/
		
		//반복문 : 프로그램 내에서 동일한 명령을 지정 횟수만큼 반복하여 수행하도록 제어하는 명령문

		//System.out.println("안녕하세요!!!");
		
		//반복문을 작성할 때 꼭 지켜야하는 규칙
		//1.초기화변수 : 반복을 시작하는 값을 저장해 놓은 변수
		//2.조건식 : 반복횟수를 정한다. (조건이 만족할때까지 반복수행한다. -> 조건이 만족하면 계속해서 반복을 수행한다.)
		//3.증감연산자 :반복횟수가 순차적으로 늘어나거나 줄어들어야 하기 때문에
		
		//증감 연산자 : 하나씩 순차적으로 증가, 감소시키는 연산자
		//1.단항으로 이루어진 증감연산자 : a++, ++a, a--, --a
		//2.대입연산자 : a = a + 1 -> a += 1
		
		//1.while문 : 반복횟수를 모르거나 무한반복을 시켜야하는 경우 주로 사용
		//형식) while (조건식) { 반복할 내용; 증감연산자 }
		
		/*
		int i = 1; //초기화 변수

		//     6 <= 5 : 거짓 -> while문 수행하지 않고 빠져나간다.
		//     5 <= 5 : 참
		//     4 <= 5 : 참		
		//     3 <= 5 : 참		
		//     2 <= 5 : 참
		//     1 <= 5 : 참
		while (i <= 5) { //조건이 만족할때까지 반복 (반복횟수)
			
			System.out.println("i변수 = " + i); //반복할 내용
			System.out.println("안녕하세요!!!"); //반복할 내용
			i++; //증감연산자
			//i += 1; //i = i + 1; 증감연산자
		}
		
		System.out.println("---------------");
		*/
		
		/*
		// 1 ~ 10 까지의 합계를 구하는 프로그램 작성 (반복횟수 : 10번 ->초기화 변수값 이용해서 연산하기)
		int num = 1; //초기화 변수
		int sum = 0; //num 초기화 변수내의 값을 한곳에 더해서 저장해놓는 변수(변수값의 초기값을 0으로 꼭 지정하기)
		
		//      11 <= 10 : 거짓 -> while문을 수행하지 않고 빠져나간다.		
		//      10 <= 10 : 참
		//      2  <= 10 : 참
		//      1  <= 10 : 참
		while (num <= 10) { //조건식 : 반복횟수(조건이 만족할때까지)
			
			
			System.out.println("num변수 = " + num);
			
			// 1 = 1 + 2    3 = 1 + 2
			// 0 = 0 + 1    1 = 0 + 1
			sum += num; //sum = sum + num;
			System.out.println("sum변수 = " + sum);
			num++; //증감연산자
			
		}
		System.out.println("num변수 = " + num);
		System.out.println("1 부터 10까지의 합은 " + sum + "입니다.!!!");
		System.out.println("---------------");
		*/
		
		/*
		// 1 ~ 50 까지의 합계를 구하는 프로그램 작성 (반복횟수 : 50번 ->초기화 변수값 이용해서 연산하기)
		
		int num = 1; //초기화 변수
		int sum = 0; //num 초기화 변수내의 값을 한곳에 더해서 저장해놓는 변수(변수값의 초기값을 0으로 꼭 지정하기)
		
		//      51 <= 50 : 거짓 -> while문을 수행하지 않고 빠져나간다.		
		//      10 <= 10 : 참
		//      2  <= 10 : 참
		//      1  <= 10 : 참
		while (num <= 50) { //조건식 : 반복횟수(조건이 만족할때까지)
			
			
			System.out.println("num변수 = " + num);
			
			// 1 = 1 + 2    3 = 1 + 2
			// 0 = 0 + 1    1 = 0 + 1
			sum += num; //sum = sum + num;
			System.out.println("sum변수 = " + sum);
			num++; //증감연산자
			
		}
		System.out.println("num변수 = " + num);
		System.out.println("1 부터 50까지의 합은 " + sum + "입니다.!!!");
		System.out.println("---------------");
		*/
		
		/*
		//무한반복 : 항상 조건이 참이다.
		//무한으로 정수값 입력받기 : 초기화변수와 증감연산자가 없다.!!
		int i;
		
		while (true) {
			System.out.println("정수 입력 >>");
			
			i = sc.nextInt();
			System.out.println("입력받은 변수 i값 출력 = " + i);
			
		}
		*/
		
		/*
		//입력받은 변수 i값 합계 출력 , 0을 입력하면 반복 입력을 멈추는 프로그램 작성
		//반복 입력을 멈추는 경우 : if문과 break 키워드로 제어하기
		int i;
		int sum = 0;
		
		while (true) {
			System.out.println("더할 정수 입력 (종료하려면 0 입력>>");
			
			//1
			//0
			i = sc.nextInt();
			System.out.println("입력받은 변수 i값 출력 = " + i);
			
			//  0 == 0
			//  1 == 0
			if (i == 0) {
				System.out.println("숫자 입력을 멈춥니다.!!!");
				break; //반복을 멈출때 사용하는 키워드
			}			
			
			sum += i;
			System.out.println("입력받은 변수 i값 합계 출력 = " + sum);
		}
		*/
		
		/*
		//구구단 출력
		//while문을 이용해서 2단만 출력하는 프로그램 작성
		//단수(고정) 연산자  곱해주는 주(1 ~ 9까지) = 곱한값
		// 2      *            1          =  2,        2 * 2 = 4, ......
		
		int i = 1; //1 ~ 9까지 변경시키는 초기화변수
		//int dan = 2; //구구단 단수(2단)
		
		System.out.println("단수 입력 >> ");
		int dan = sc.nextInt();
		
		//     10<= 9 : 거짓 -> while문을 수행하지 않고 빠져나간다.
		//     9 <= 9 : 참
		//     2 <= 9 : 참  
		//     1 <= 9 : 참
		while (i <= 9) {
			
			//                  2      *     9     =       2 * 9
			
			//                  2      *     2     =       2 * 2
			//                  2      *     1     =       2 * 1
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		*/
		
		//중첩 while문 : 바깥 반복문이 1번 수행될동안 안쪽 반복문은 반복횟수를 모두 수행해야 한다.!!!!
	while (true) {
		int i = 1; //1 ~ 9까지 변경시키는 초기화변수 (안쪽 while문 초기화 변수)
		
		
		System.out.println("단수 입력 >> ");
		//  2
		int dan = sc.nextInt(); //바깥 while이 1번 수행될 동안 
		
		if (dan == 0) {
			System.out.println("숫자 입력을 멈춥니다.!!!");
			break; //반복을 멈출때 사용하는 키워드
		}			
		
		
		while (i <= 9) { //안쪽 while : 반복 횟수를 모두 수행해야 한다.!!!
			
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
	}
	
	
	}

}
