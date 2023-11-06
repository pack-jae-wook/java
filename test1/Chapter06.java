package test1;

import java.util.Scanner;

public class Chapter06 {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("num1 변수값 입력 (정수로 입력하세요)>>");
		int num = sc.nextInt();
	   
		/*
		int sum, sub, mul, div, mod;
		
		sum= num1 + num2;
		sub= num1 - num2;
		mul= num1 * num2;
		div= num1 / num2;
		mod= num1 % num2;
		
		System.out.println("num3= "+ num1);
		System.out.println("num4= "+ num2);
		System.out.println("sum= "+ sum);
		System.out.println("sub= "+ sub);
		System.out.println("mul= "+ mul);
		System.out.println("div= "+ div);
		System.out.println("mod="+ mod);
		System.out.println("----------------");
		
		
		System.out.println("num1 + num2=" + (num1 + num2));
		System.out.println("num1 - num2=" + (num1 - num2));
		System.out.println("num1 * num2=" + (num1 * num2));
		System.out.println("num1 / num2=" + (num1 / num2));
		System.out.println("num1 % num2=" + (num1 % num2));
		*/
		
		//2.부호 연산자 : +(양수값), -(음수값)
		//int num1 = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		//변수영내의 데이터값 자책가 마이너스 값으로 변경이 된다.
		num = -num;
		System.out.println(num);
		System.out.println("--------------");
		
		//2개의 점수로 합계, 평균 구하기
		int mathScore = 90;
		int engScore = 70;
		//합계
		int totalScore = mathScore + engScore;
		System.out.println("합계 : "+ totalScore);
		//평균
		//double avgScore = totalScore / 2.0; //2.0 : 실수형 계산을 위해!!!
		double avgScore = totalScore / (double)2;
		System.out.println("평균 : "+ avgScore);
		System.out.println("----------------------");
		
		//**단항 연산자
		//3.증감 연산자 : 1씩 증가/ 감소 (++a, a++, --a, a--)
		//a = a + 1; ->자신의 변수값에 1을 더해서 다시 저장한다.
		//a = a + 1; ->자신의 변수값에 1을 빼서 다시 저장한다.
		//전치 변수명 : 앞에 ++, --가 오게되면 먼저 1을 증가/감소해서 사용한다.
		//후치 변수명 : 앞에 ++, --가 오게되면 변수내의 값을 먼저 사용하고 나중에 1을 증가/감소해서 사용한다.
		
		int gameSource = 150;
		System.out.println(gameSource);
		System.out.println(++gameSource);
		System.out.println(gameSource++);
		System.out.println(gameSource);
		System.out.println("---------------");
		
		int gameSource1 = 150;
		System.out.println(gameSource1);
		System.out.println(--gameSource1);
		System.out.println(gameSource1--);
		System.out.println(gameSource1);
		System.out.println("---------------");
		
		//관계 연산자(비교 연산자): 조건 작성시에 꼭 사용하는 연산자이다.
		//논리값 : 결과는 참(true)/ 거짓(false)로 반환한다.
		//조건 작성 형식 : 비교대상 관계 연산자(비교 연산자) 비교할기준값 =>결과는 논리값 참(true)/거짓(false)
		
		int myAge = 27;
		//              27 > 25 ->조건이 참이다.!!! (true)
		boolean value = myAge > 25;
		System.out.println(value);
		//       27  <= 25
		value = myAge <= 25;
		System.out.println(value);
		//같다(==)!!!!
		//           27 == 27
		value = myAge == 27;
		System.out.println(value);
		//같지 않다(!=)!!!!
		value = myAge != 27;
		System.out.println(value);
		
		//연산자가 2개이상이면 반드시 괄호로 구분해 주어야 한다.!!!
		System.out.println("myAge==27:" + (myAge ==27));
		
		//논리 연산자 : 관계 연산자(비교 연산자)로 처리된 결과를 가져와서 다시 논리적으로 연산한다.!!!
		//판단해 놓은 조건으로 다시 참(true)/거짓(false)를 판단한다.
		//조건이 여러개이다.!!!! -> 결과는 참(true) /거짓(false)
		
		//1)논리급(&&) : 두 항이 모두 참(true)일때만 수행한다. (2개의 조건이 모두 참, 만족)
		//2)논리합(||) : 하나의 항(조건)이 참(true)이면 수행된다. (2개의 조건중에 하나라도 참, 만족)
		//3)부정(!):결과가 참(true)인 것은 거짓(false)으로, 거짓(false)인 것은 참(true)으로 바꾸어 준다.
		
		int num1 = 10;
		int num2 = 20;
		
		//조건 작성 형식 : 비교대상 관계 연산자(비교 연산자) 비교할기준값
		//조건은 참이 되어야만 수행된다.!!!
		
		//1)논리급(&&) : 두 항(조건)이 모두 참(true)일때만 수행한다. (2개의 조건이 모두
		//                   참           거짓 		
		//                   10 > 0 && 20 < 0
		
		boolean flag= (num1 > 0) && (num2 < 0);
		System.out.println(flag);
		
		//2)논리합(||) : 하나의 항(조건)이 참이면 수행된다.(2개의 조건중에 하나라도 참, 만족)
		
		flag = (num1 > 0) || (num2 < 0);
		System.out.println(flag);
		
		//3)부정(!):결과가 참(true)인 것은 거짓(false)으로, 거짓(false)인 것은 참
		flag = !((num1 > 0) && !(num2 < 0));
		System.out.println(flag);
		
		flag = (num1 > 0) && !(num2 < 0);
		System.out.println(flag);
		
		//** 단락 회로 평가(SCE:Short Circuit Evaluation)
		//논리급과 논리합 연산을 할 때 두 항을 모두 실행하지 않더라도 결과값을 알 수 있는 경우에,
		//나머지 항은 실행되지 않는다는 것이다.
		
		int num3 = 10;
		int i = 2;
		
		//                        거짓            &&       참
		//                (      20         <10)&& (      4   <10) 
		//                (20 = 10 + 10)           (4 = 2 + 2)
		boolean value1 = ((num3 = num3 + 10)<10)&&((i = i + 2)<10);
		System.out.println(value1);
		System.out.println(num3);
		System.out.println(i);
		System.out.println("---------------------------------------------");

		//                 참            ||
		//                30       >10)|| (
		//         ( 30 =  20  + 10)      (4 = 2 + 2)
		value1 = ((num3 = num3 + 10)>10)||((i = i + 2)<10);
		System.out.println(value1);
		System.out.println(num3);
		System.out.println(i);
		System.out.println("---------------------------------------------");
		
		
		//6.복합 대입 연산자 : 변수값을 초기화한 후에 다시 대입한다.!!!
		//int num4 = num4 + 1;
		
		//변수에 초기값을 정확하게 넣어주고 연산을 해서 다시 대입해주어야 한다.!!!
		int num4 = 0;
		//0  =0 + 1
		num4 = num4 + 1; //결과 :
		num4 += 1; //num4 = num4 + 1 -> 결과 : 2
		num4 *= 5; //num4 = num4 * 5 -> 결과 : 10
		System.out.println(num4);
		
		++num4;
		System.out.println(num4);
		
		//삼항 연산자
		//7.조건 연산자
		 //형식)조건 ? 조건을 판단해서 참인 경우 수행내용 : 조건을 판단해서 거짓인 경우 수행내용;
		//조건 작성 형식) 비교할대상 관계(비교)연산자 비교할기준값
		//(조건이 거짓)? 거짓일때 수행할 내용(2)이 표시된다. 
		int num5 = (5 < 3) ? 10 : 20;
		System.out.println(num5);
		
		
	}

}
