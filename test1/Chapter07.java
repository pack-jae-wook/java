package test1;

import java.util.Scanner;

public class Chapter07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 삼항 연산자
		// 7.조건 연산자
		// 형식) 조건 ? 조건을 판단해서 참인 경우 수행내용 : 조건을 판단해서 거짓인 경우 수행내용;
		// 조건 작성 형식) 비교할대상 관계(비교)연산자 비교할기준값
		
		/*
		//         참(true)
		int num = (5 > 3) ? 10 : 20;
		System.out.println(num);
		System.out.println("------------");
		
		//나이가 20세 이상이면 "성인"으로 저장하고, 아니면 "미성년"으로 저장
				
		//int age = 25;
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		//               25  >= 20
		String result = (age >= 20) ? "성인" : "미성년";
		System.out.println(result);
		System.out.println("------------");
				
			
		//성별 구분 : 남자(1,3) / 여자(2,4)
		System.out.println("성별 구분 입력 남자(1,3) / 여자(2,4)>> ");
		int gender = sc.nextInt();
		
		//관계연산자 : 같다 (==) !! -> 논리연산자 : 논리합(OR연산)
		String result1 = ((gender == 1) || (gender == 3)) ? "남자" : "여자";
		System.out.println(result1);
		System.out.println("------------");
		
				
		//조건 연산자를 사용하여 부모님의 나이 비교하기(p81)
		int fatherAge = 45;
		int motherAge = 47;

		char ch1;
		ch1 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch1);
		
		boolean ch2;
		ch2 = (fatherAge > motherAge) ? true : false;
		System.out.println(ch2);
		System.out.println("-------------");
		
		
		//1엔터김하나엔터
		
		//본인의 이름 인증 : "ok", "nop"
		System.out.println("이름 입력 >> ");
		sc.nextLine();
		
		String name = sc.nextLine();
		
		
		//String name = "김하나";
		String name1;
		
		//name1 = (name == "김하나") ? "ok" : "nop";
		
		//문자열 조건에서 같다 비교연산자 역할 :변수명.equals("김하나")
		//문자열에서 데이터값이 같기만 하면 일치한다로 수행!!!
		name1 = (name.equals("김하나")) ? "ok" : "nop";
		System.out.println(name1);
		System.out.println("-------------");
		*/
		
		//입력 받은 정수값을 홀수, 짝수로 구분하기
		//나머지 연산자 : %
		
		/*
		int num1 = 12;
		boolean isEven;
		
		//         11 % 2 나눈 나머지 == 1 : 거짓 -> 홀수 
		//         10 % 2 나눈 나머지 == 0 : 참  -> 짝수
		isEven = ((num1 % 2) == 0) ? true : false;
		System.out.println(isEven);
		System.out.println("-------------");
		*/
		
		
		while (true) {
		System.out.println("홀수, 짝수를 구분할 정수값 입력 >>");
		int num1 = sc.nextInt();
		String isEven;
		
		//         11 % 2 나눈 나머지 == 1 : 거짓 -> 홀수 
		//         10 % 2 나눈 나머지 == 0 : 참  -> 짝수
		
		//          100 / 2 ->몫 : 50 -> 나머지 : 0 -> 짝수
		//          101 / 2 ->몫 : 50 -> 나머지 : 1 -> 홀수
		//			150 / 2 ->몫 : 75 -> 나머지 : 0 -> 짝수
		//           0       == 0 -> 짝수
		//           1       == 0 -> 홀수
		isEven = ((num1 % 2) == 0) ? "짝수" : "홀수";
		System.out.println(isEven);
		System.out.println("-------------");
		
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
