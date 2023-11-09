package test2;

import java.util.Scanner;

public class chapter11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("나이 입력>>"); int age = sc.nextInt(); int charge = 0; // 30
		 * < 8 : 거짓 if(age < 8){ charge = 1000; System.out.println("취학 전 아동 입니다."); } //
		 * 10 < 14 : 참 // 30 < 14 : 거짓 if(age < 14){ charge = 2000;
		 * System.out.println("초등학생 입니다."); } // 10 < 14 : 참 // 15 < 20 // 30 < 20 : 거짓
		 * if(age < 20){ charge = 2500; System.out.println("중고등학생 입니다."); } else{ charge
		 * = 3000; System.out.println("일반인 입니다."); } System.out.println("입장료는"
		 * +charge+"입니다.!!!");
		 */
		/*
		 * //조건문과 조건 연산자 int a = 15; int b = 10; int max; //a,b 변수 중 큰 값을 담아놓는 변수
		 * 
		 * // 15 > 10 : 참 // 10 > 15 : 거짓 if(a>b) { //a변수값의 값이 클경우 max = a; } else {
		 * //(a < b) //b변수의 값이 클경우 max = b; } System.out.println("최대값 max ="+max);
		 * System.out.println("-------------------");
		 * 
		 * //if문에서 수행할 내용이 한 줄일 경우에는 블록(중괄호) {}을 생략할 수 있다. if (a > b) max = a; else max
		 * = b; System.out.println("최대값 max ="+max);
		 * System.out.println("-------------------");
		 * 
		 * 
		 * 
		 * //2개의 변수중 최대값 구하기(조건 연산자로 작성) max = (a>b)? a:b;
		 * System.out.println("최대값 max ="+max);
		 */
		// switch문 : 하나의 변수나 수식에 대한 다양한 조건을 검사할 때 사용한다.
		// switch(변수하나, 수식하나),case 비교할기준값:, break, default 키워드 사용

		// 1위 : 금메달(Gold), 2위 : 은메달(Silver), 3위 : 동메달(Bronze)
		/*
		 * System.out.println("순위입력>> "); int rank = sc.nextInt(); char medalColor;
		 * if(rank == 1) { medalColor = 'G'; } else if(rank == 2) { medalColor = 'S'; }
		 * else if(rank == 3) { medalColor = 'B'; } else { medalColor = 'A'; }
		 * System.out.println("순위:"+ rank); System.out.println("medalColor:" +
		 * medalColor); System.out.println("---------------------");
		 */
		/*
		 * System.out.println("순위입력>> "); int rank = sc.nextInt(); char medalColor;
		 */
		// 비교대상 관계(비교)연산자 비교할기준값
		// rank case (==)
		// 3
		/*
		 * switch(rank) { case 1 : medalColor = 'G'; System.out.println("금메달");
		 * 
		 * break; case 2 : medalColor = 'S'; System.out.println("은메달"); break; case 3 :
		 * medalColor = 'B'; System.out.println("동메달"); break;
		 * 
		 * default : medalColor ='A'; System.out.println("노메달"); }
		 * System.out.println("순위:"+ rank); System.out.println("medalColor:" +
		 * medalColor); System.out.println("---------------------");
		 */
		// 2개의 정수와 연산자를 입력받아서 연산을 수행하는 switch문 작성
		// 산술 연산 수행 (+, -, *, / , %)
		// 10 + 10 = 20
		/*
		 * System.out.println("num1 입력 >>"); int num1 = sc.nextInt();
		 * System.out.println("num2 입력 >>"); int num2 = sc.nextInt();
		 * System.out.println("연산자 입력 >>"); char oper = sc.next().charAt(0);
		 */
		// +
		/*
		 * switch (oper) { case '+': System.out.println("num1 + num2 =" + (num1+num2));
		 * break; case '-': System.out.println("num1 - num2 =" + (num1-num2)); break;
		 * case '*': System.out.println("num1 * num2 =" + (num1*num2)); break; case '/':
		 * System.out.println("num1 / num2 =" + (num1/num2)); break; case '%':
		 * System.out.println("num1 % num2 =" + (num1%num2)); break;
		 * 
		 * default : System.out.println("연산자를 잘못 입력하셨습니다.!!!"); }
		 */
		// case를 동시에 사용하기
		// 예제) 월을 입력 받아서 계절 구분하기
		// (12월 ~ 2월 : 겨울, 3월 ~ 5월 : 봄, 6월 ~ 8월 : 여름, 9월~11월 : 겨울)
		/*
		 * System.out.println("월을 정수로 입력>>"); int month = sc.nextInt(); // switch
		 * (month) { case 12: case 1: case 2: System.out.println("겨울입니다.!!!"); break;
		 * 
		 * case 3 : case 4 : case 5: System.out.println("봄입니다.!!!"); break;
		 * 
		 * case 6: case 7: case 8:System.out.println("여름입니다.!!!"); break;
		 * 
		 * case 9: case 10: case 11:System.out.println("가을입니다.!!!"); break;
		 * 
		 * 
		 * default : System.out.println("존재하지 않는 월입니다."); }
		 */
		// 31일까지 있는 월, 30일 까지 있는 월, 28일까지 있는 월 구분해서 출력하기
		/*
		 * System.out.println("월을 정수로 입력>>"); int month = sc.nextInt(); int day; switch
		 * (month) { case 1: case 5: case 7: case 8: case 10 : case 12 : day = 31;
		 * System.out.println("달의 일수는 31일 입니다.!!! >>"); break; case 4: case 6: case 9:
		 * case 11: day = 30; System.out.println("달의 일수는 30일 입니다.!!! >>"); break; case 2
		 * : day = 28; System.out.println("달의 일수는 28일 입니다.!!! >>"); break;
		 * 
		 * default : System.out.println("존재하지 않는 월 입니다."); }
		 */
		//
		/*
		System.out.println("메달명을 영문 문자열을 입력>>");
		String medal = sc.nextLine();
		switch (medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default : 
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("--------------------------------------");
		System.out.println("혈액형 입력>>");
		String blood = sc.nextLine();
		switch (blood) {
		case "A": case "a":
			System.out.println("A형입니다.");
			break;
		case "B": case "b":
			System.out.println("B형입니다.");
			break;
		case "O": case "o":
			System.out.println("O형입니다.");
			break;
		case "AB" : case "ab" :
			System.out.println("AB형입니다.");
			break;
		default : 
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		*/
		
		//switch문 : 범위 지정
		//0권 : "책을 읽지 않는 분이시네요.!!!"
		//1권 : "책읽는 것을 즐기시는 분이시네요.!!!"
		//2권 : "책을 사랑하는 분이시네요.!!!"
		//3권 : "다독왕 짱.!!!"
		
		//1/10 = 0.1
		//2/10 = 0.2
		System.out.println("책읽은 권수를 입력 >>");
		int book = sc.nextInt();
		
		//입력 받은 읽은 책의 권수를 범위 (논리법, 논리곱)을 만들어서 저장하기 위한 수식을 먼저 작성한다.
		book=book/10;
		switch (book) {
		case 0 : // (0~9) 일단위 숫자 : 10개 ( book >=0 && book <=9)
			
		System.out.println("책을 읽지 않는 분이시네요.!!!");
		break;  // (10~19) 일십단위 숫자 : 10개
		case 1 :
			
		System.out.println("책읽는 것을 즐기시는 분이시네요.!!!");
		break; // (20~29)
		case 2 :
			
		    System.out.println("책을 사랑하는 분이시네요.!!!");
		    break;  // (30~39)
		        
		case 3 :
			
		System.out.println( "다독왕 짱.!!!");
		    break;
		default : 
			System.out.println("다시 입력하세요");
			
		}
		System.out.println("--------------------------");
		
		
	}
	  		
}

	
		
		
		
		
		
		
		
		
		
		
		
		