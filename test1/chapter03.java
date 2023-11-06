package test1;

import java.util.Scanner;

public class chapter03 {

	public static void main(String[] args) {
		
        //자료형 변환(Type Cast) : 변수내의 저장된 데이터의 자료형을 변경시킨다.
		//1)자동 형변환 : 작은 크기의 자료형을 큰 크기의 자료형으로 저장할 경우 
		//2)명시적 형변환 : 변경할 자료형을 변수앞에 정확하게 표시해서 저장할 경우
		// 형식) (변경할 자료형)변수명; ->(int)b
		//3)접미사 형식 : 리트럴 상수일 경우 접미사 형태로 변환 가능 (데이터값 형태로)
		// 형식)자료형 변수명 = 데이터값접미사; ->10.25f
		// 접미사 : 자료형의 첫번째 문자를 대문자/소문자로 표기
		
		byte a = 127;
		int b = a;
		float c = b;
		double d = c;
		float e1 = 10.5f; //리트럴 상수일 경우 접미사 형태로 변환 가능 (데이터값 형태로)
		float e = (float)d; //명시적 자료형 변환 가능
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e);
		System.out.println("-----------------");
		
		//문자(Character)와 문자열(String)
		//1)문자 : 글자 하나, 자료형 : char(2byte), 데이터값은 작은 따음표로 묶어서 저장(ex. 'A','김')
		
		//인코딩(endcoding): 문자를 정해진 코드값으로 변
		//디코딩(decoding) : 정해진 코드값을 문자로 변환
		
		//유니코드(Unicode): 전세계의 모든 문자를 처리할 수 있도록 만든 표준 문자 처리방식이다.
		//유니코드값은 16진수로 나타낸다. 2byte로 저장된다.
		//UTF-8 형식 : 영문은 1byte로 저장가능하기 때문에 가변적으로 처리할 수 있는 인코딩 방법을 사용한다.
		
		
		char ch1 = 'A';
		char ch2 = '한';
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((int)ch2);
		System.out.println("-----------------");
		
		int ch3 = 54620;
		char ch4 = 54620; //char형에는 코드값으로 정해진 정수 숫자를 넣어도 된다.
		char ch5 = '\u0041';
		char ch6 = '\uD55c';
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println((char)ch3); //코드값으로 문자형으로 디코딩해서 보여준다.
		System.out.println((int)ch4);
		System.out.println((char)ch5);
		System.out.println(ch6);
		System.out.println((int)ch6);
		System.out.println("-----------------");
		
		//2)문자열 : 여려개의 글자가 하나의 묶음으로 사용된다.(단어)
		//자료형 : String,데이터값은 큰 따음표로 묶어서 저장 (ex/ "happy", "오늘")
		
		String s1 = "happy";
		System.out.println(s1);
		
		char ch7 = 'h';
		char ch8 = 'a';
		char ch9 = 'p';
		char ch10 = 'p';
		char ch11 = 'y';
		
		System.out.println(ch7 + ch8 + ch9 + ch10 + ch11);
		System.out.println((char)ch7 + (char)ch8 + (char)ch9 + (char)ch10 + (char)ch11);
		System.out.println((char)(ch7 +ch8 +ch9 + ch10 + ch11));
		System.out.println(ch7 + "," + ch8 +","+ ch9 +","+ ch10 +","+ ch11);
		System.out.println(ch7 + "\t " + ch8 +"\t"+ ch9 +"\t "+ ch10 +"\t "+ ch11);
		System.out.println(ch7 + "" + ch8 +""+ ch9 +""+ ch10 +""+ ch11);
		
		
		System.out.println(ch7);
		System.out.println(ch8);
		System.out.println(ch9);
		System.out.println(ch10);
		System.out.println(ch11);
		
		System.out.print(ch7); // 줄바꿈 하지 않고 변수값 출력
		System.out.print(ch8);
		System.out.print(ch9);
		System.out.print(ch10);
		System.out.print(ch11 + "\n");
		
		//이스케이프 시퀀스(Escape Sequence) = 제어 문자: 특수한 동작을 하는 문자
		//출력시에만 사용 : System.out.println()내부에 적용한다.
		//줄바꿈 : "\n", 일정한 간격 띄우기(TYB) :"\t"
		//출력 문자열내에 인용부를 넣고 싶을때 : \넣고싶은 기호"
		
		System.out.println("자바 \n프로\t그래밍 \t코딩은 즐거워요 !!!");
		System.out.println("'자바 프로그래밍' \t코딩은 즐거워요 !!!");
		System.out.println("\"자바 프로그래밍\"코딩은 \\즐거워요 !!!");
		
		char ch12 = '\uD55C';
		System.out.println(ch12);
		System.out.println("한의 \"유니코드\" 출력 \\uD55C="+ ch12);
		
		//입력 : 키보드로 입력받은 값을 변수에 저장
		//Scanner can = new Scanner(System.in);
		//형식) 클래스명 변수명 = new 클래스명 (입력방법);
		//사용 클래스 import : Ctrl + Shift + O
		
		Scanner sc = new Scanner(System.in);
		
		//정수 : nextInt();
		System.out.println("정수 입력>>");
		int v1 = sc.nextInt();
		
		System.out.println("v1:"+v1);
		
		//실수 : nextDouble();
		System.out.println("실수 입력>>");
		double v2 = sc.nextDouble();
		System.out.println("v2:" + v2);
		
	}

}
