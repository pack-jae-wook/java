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
		//5만원권 : 3장, 1만원권 : 3장, 5천원권 : 1장, 천원권 : 2장
		//예)187000원 입력
		/*
		System.out.println("분리할 금액 입력 >>");
        int price = sc.nextInt();
        System.out.println("입력받은 금액 :" + price);
        
        int oman = price / 50000; 
        int ilman = (price % 50000)/10000;
        int ochun = ((price % 50000)%10000)/5000;
        int ilchun = (((price % 50000)%10000)%5000)/1000;
        
        
        System.out.println("5만원권 :" +oman + "장");
        System.out.println("1만원권 :" +ilman + "장");
        System.out.println("5천원권 :" +ochun + "장");
        System.out.println("천원권  :" +ilchun + "장");
        
        int age = 10;
         
        	if(age>=8) {
        		System.out.println("학교에 다닙니다.!!!");
        		
        		
        		
        	} else {
        		
        		System.out.println("학교에 다니지 않습니다.!!!");
        	}
        	
        	System.out.println("----------------------");*/
            //3)if ~ else if~
        	
        	//나이에 따라 입장료 지불
        	//취학전 아동(8세 미만 : 7세) : 1000원
        	//초등학생(8세 ~ 13세) : 2000원
        	//중고등학생(14세 ~ 19세) : 2500원
        	//일반(20세 이상) : 3000원
        	
        	//5 > 3 : 보다 크다 (초과)
        	//5 < 3 : 보다 작다 (미만)
        	//5 >= 3 : 보다 크거나 같다 (이상)
        	//5 <= 3 : 보다 작거나 같다 (이하)
        	//5 == 3 : 같다
        	//5 != 3 : 같지 않다
        	
        	//int age = 30;
		
		    //수정 : 0살 미만(마이너스) 과 120살 이상일 경우 "나이를 잘못입력하셨습니다.!!!"를 출력 		
		    // 0 <= age <= 7 : (age >=0) && (age <= 7)
		    /*
		    System.out.println("나이 입력>>");
		    int age = sc.nextInt();
        	int charge = 0;
        	
        	if ((age >=0) && (age <= 7)) { // 0세 ~ 7세
        		charge = 1000;
        		System.out.println("취학전 아동입니다.!!!");
        		
        	}
        	else if ((age >=8) && (age <= 13)) { //8세 ~ 13세
        		charge = 2000;
        		System.out.println("초등학생 입니다.!!!");
        	}
        	else if ((age >=14) && (age <= 19)) { //14세 ~ 19세
        		charge = 2500;
        		System.out.println("중고등학생 입니다.!!!");
        	} else if ((age >=20) && (age <= 120)) { //14세 ~ 19세
        		charge = 2500;
        		System.out.println("일반인 입니다.!!!");
        		
        	} 
        	
        	else {
        		System.out.println("나이를 잘못 입력하였습니다.!!!");
        	}
        	System.out.println("입장료는" + charge + "입니다.!!!");
        	System.out.println("-----------------------------");
        	
        */ 
		
		
		
		//95점이상 : "A+"
		//90점이상 : "A"
		//85점이상 : "B+"
		//80점이상 : "B"
		//75점이상 : "C+"
		//70점이상 : "C"
		//65점이상 : "D+"
		//60점이상 : "c"
		//나머지점수 (59이하 : "F"
		/*
		 System.out.println("점수를 입력하시오.>>");
		 int score = sc.nextInt();
		 String grade ="";
		 if ((score < 100) && (score >=95)) {
			 grade = "A+";
		 }
		 else if((score <95) && (score >=90)) {
			 grade = "A";
		 }
		 else if((score <90) && (score >=85)) {
			 grade = "B+";
		 }
		 else if((score <85) && (score >=80)) {
			 grade = "B";
		 }
		 else if((score <80) && (score >=70)) {
			 grade = "c";
		 }
		
		 else if((score <70) && (score >=60)) {
			 grade = "D";
		 }
		
		 else {
			 grade = "F";
		 }
		 System.out.println("학점은"+grade+"학점입니다.");
	
		*/
		// 혈액형 예제
		// 혈액형을 입력받아 메시지로 출력하기 (String형)
		// A -> 혈액형은 A형 입니다.!!!
		// B -> 혈액형은 B형 입니다.!!!
		// O -> 혈액형은 O형 입니다.!!!
		// AB -> 혈액형은 AB형 입니다.!!!
		
		//char 형으로 입력받아서 출력하기
		
		System.out.println("혈액형 입력 >>");
		String blood = sc.nextLine();
		int aa= 10;
		
		if ((blood.equals("A"))||(blood.equals("a"))) {
			System.out.println("혈액형은 A형 입니다.!!!");
		}
		else if ((blood.equals("B"))||(blood.equals("a"))) {
			System.out.println("혈액형은 B형 입니다.!!!");
		}
		else if ((blood.equals("O"))||(blood.equals("b"))) {
			System.out.println("혈액형은 O형 입니다.!!!");
		}
		else if ((blood.equals("AB"))|| (blood.equals("ab"))) {
			System.out.println("혈액형은 AB형 입니다.!!!");
		}
		
		else {
			System.out.println("잘못입력하셨습니다.");
			
		}
		
		System.out.println("--------------------------");
				
	}
}
