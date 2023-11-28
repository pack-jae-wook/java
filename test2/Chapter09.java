package test2;

import java.util.Scanner;

public class Chapter09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//나눗셈을 몫을 사용하는 경우, 나머지를 사용하는 경우
		// 몫 : / , 나머지 : %
		
		//탐욕 알고리즘(Greedy algorithm)
		//여러 경우중에서 하나를 결정해야 할때마다 그 순간에 최적이라고 생각되는 것을 
		//선택해 나가는 방식으로 진행하여 최종적인 해답에 도달하는 기법을 사용하는 방식
	
		
		//금액을 입력받아 화폐단위 대로 분리해서 표시하기
		//5만원권 : 3장, 1만원권 : 3장, 5천원권 : 1장, 1천원권 : 2장
		//예)187000원 입력
		
		/*
		System.out.println("분리할 금액 입력 >> ");
		int price = sc.nextInt();
		
		System.out.println("입력받은 금액 : " + price);
		
		int oman = price / 50000; //3장
		//int oman1 = price % 50000; //단위 계산은 나머지를 구해서 사용한다.
		int ilman = (price % 50000)/10000; //3장
		//int ilman1 = (price % 50000)%10000;
		int ochun = ((price % 50000)%10000)/5000; //1장
		//int ochun1 = ((price % 50000)%10000)%5000;
		int ilchun = (((price % 50000)%10000)%5000)/1000;//2장
		//int ilchun1 = (((price % 50000)%10000)%5000)%1000;
		
		System.out.println("5만원권 : " + oman + " 장");
		//System.out.println("5만원권 나머지 : " + oman1  );
		System.out.println("1만원권 : " + ilman + " 장");
		//System.out.println("1만원권 나머지 : " + ilman1  );
		System.out.println("5천원권 : " + ochun + " 장");
		//System.out.println("5천원 나머지 : " + ochun1  );
		System.out.println("1천원권 : " + ilchun + " 장");
		//System.out.println("1천원권 나머지 : " + ilchun1 );
		*/
		
		
		/*
		//나이가 8세 이상 : "학교에 다닙니다", 아니면 "학교에 다니지 않습니다"
		//조건 : (8세 이상)              조건 : (8세 미만)
		
		int age = 10;
		//   10 >= 8 : 참(true)
		if (age >= 8) {
			System.out.println("학교에 다닙니다.!!!");
		} else {
			System.out.println("학교에 다니지 않습니다.!!!");
		}
		System.out.println("----------------");
		*/
		
		//3)if ~ else if ~ else문 : 조건이 여러개인 경우 맞는 조건을 수행하고 끝내는 구문이다.
		//형식)if(조건식){조건이 참일때 수행할 내용} 
		//else if(조건식) {조건이 참일때 수행할 내용}
		//else { 물어보지 않은 모든 조건 수행 내용}
		
		//나이에 따라 입장료 지불
		//취학전 아동(8세 미만 : 7세 아래) : 1000원
		//초등학생(8세 ~ 13세) : 2000원
		//중고등학생(14세 ~ 19세) : 2500원
		//일반(20세 이상) : 3000원
		
		// 5 > 3 : 보다 크다 (초과)
		// 5 < 3 : 보다 작다 (미만)
		// 5 >= 3 : 보다 크거나 같다 (이상)
		// 5 <= 3 : 보다 작거나 같다 (이하)
		// 5 == 3 : 같다
		// 5 != 3 : 같지 않다
		
		
		/*
		//int age = 30;	
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		int charge = 0;
		
		if (age < 8) { // 8세 미만 : 7세 아래
			charge = 1000;
			System.out.println("취학전 아동입니다.!!!");
		}
		else if (age < 14) { //8세 ~ 13세
			charge = 2000;
			System.out.println("초등학생 입니다.!!!");
		}
		else if (age < 20) { //14세 ~ 19세
			charge = 2500;
			System.out.println("중고등학생 입니다.!!!");
		} else { //
			charge = 3000; //20세 이상
			System.out.println("일반인 입니다.!!!");
		}
		
		System.out.println("입장료는 " + charge + "입니다.!!!");
		System.out.println("----------------");
		*/
		
		/*
		//수정 : 나이가 0살 미만(마이너스) 과 120살 이상일 경우 "나이를 잘못입력하셨습니다.!!!"를 출력
		//  0 <= age <= 7 : (age >= 0) && (age <= 7)
		
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		int charge = 0;
		
		if ((age >= 0) && (age <= 7)) { // 0세 ~ 7세 
			charge = 1000;
			System.out.println("취학전 아동입니다.!!!");
		}
		else if ((age >= 8) && (age <= 13)) { //8세 ~ 13세
			charge = 2000;
			System.out.println("초등학생 입니다.!!!");
		}
		else if ((age >= 14) && (age <= 19)) { //14세 ~ 19세
			charge = 2500;
			System.out.println("중고등학생 입니다.!!!");
		} 
		else if ((age >= 20) && (age <= 120)) { //20세 이상 ~ 120세
			charge = 3000; 
			System.out.println("일반인 입니다.!!!");
		}
		else { 			
			System.out.println("나이를 잘못 입력하셨습니다.!!!");
		}
		
		System.out.println("입장료는 " + charge + "입니다.!!!");
		System.out.println("----------------");
		*/
		
		/*
		//점수를 입력해서 학점 구하기
		//95점 이상 (95 ~ 100): "A+"
		//90점 이상 (90 ~ 94): "A"
		//85점 이상 (85 ~ 89): "B+"
		//80점 이상 (80 ~ 84): "B"
		//70점 이상 (70 ~ 79): "C"
		//60점 이상 (60 ~ 69): "D"
		//나머지 점수 (0 ~ 59) :  "재시험!!"
		//이외의 점수(마이너스, 100점 이상): 점수가 잘못 입력되었습니다.
		
		System.out.println("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		String grade = "";
		
		System.out.println("학점 부여 시작!!!");

		// 50 >= 95
		if ((score <= 100) && (score >= 95)) { // 95 점 이상
			grade = "A+";
		} else if ((score <= 94) && (score >= 90)) { // 90 ~ 94점
			grade = "A";
		} else if ((score <= 89) && (score >= 85)) { // 85 ~ 89점
			grade = "B+";
		} else if ((score <= 84) && (score >= 80)) {
			grade = "B";
		} else if ((score <= 79) && (score >= 70)) {
			grade = "C";
		} else if ((score <= 69) && (score >= 60)) {
			grade = "D";
		} else {
			 grade = "재시험(계절학기)";
			//grade = "잘못된 점수";
		}

		System.out.println("당신의 학점은 : " + grade + " 입니다.!!!");
		System.out.println("학점 부여 끝!!!");
		 */
		
		// 혈액형 예제
		//혈액형을 입력받아 메시지로 출력하기 (char형)
		//A -> 혈액형은 A형 입니다.!!!
		//B ->  혈액형은 B형 입니다.!!!
		//O ->  혈액형은 O형 입니다.!!!
		//AB ->  혈액형은 AB형 입니다.!!!
		
		/*
		//char형으로 입력받아서 출력하기		
		//char blood = 'A';
		System.out.println("혈액형 입력 >> ");
		char blood = sc.next().charAt(0);
		
		if (blood == 'A') {
			System.out.println("혈액형은 A형 입니다.!!!");
		} 
		else if (blood == 'B') {
			System.out.println("혈액형은 B형 입니다.!!!");
		}
		else if (blood == 'O') {
			System.out.println("혈액형은 O형 입니다.!!!");
		} 		
		else {
			System.out.println("혈액형은 AB형 입니다.!!!");
		}
		
		System.out.println("-----------------");
		*/
		
		System.out.println("혈액형 입력 >> ");
		String blood = sc.nextLine();
		int aa= 10;
		
		//논리합(||) : "A" or "a"
		if ((blood.equals("A")) || (blood.equals("a"))) {
			System.out.println("혈액형은 A형 입니다.!!!");
		} 
		else if ((blood.equals("B"))|| (blood.equals("b"))) {
			System.out.println("혈액형은 B형 입니다.!!!");
		}
		else if ((blood.equals("O")) || (blood.equals("o"))){
			System.out.println("혈액형은 O형 입니다.!!!");
		} 		
		else if ((blood.equals("AB")) || (blood.equals("ab"))) {
			System.out.println("혈액형은 AB형 입니다.!!!");
		} 	
		else {
			System.out.println("혈액형을 잘못 입력하셨습니다.!!!");
		}
		
		System.out.println("-----------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
