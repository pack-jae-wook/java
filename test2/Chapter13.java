package test2;

import java.util.Scanner;

public class Chapter13 {

	public static void main(String[] args) {
		
		//반복문 : 프로그램 내에서 동일한 명령을 지정 횟수만큼 반복하여 수행하도록 제어하는 명령문
        
	    //System.out.println("안녕하세요.");
	       
	    //반복문을 작성할 때 꼭 지켜야 하는 규칙
	    //1.초기화변수 : 반복을 시작하는 값을 저장해 놓은 변수 = 초기값
	    //2.조건식 : 반복횟수를 정한다. (조건이 만족할때까지 반복수행한다. -> 조건이 만족하면 계속해서 반복을 수행한다.)
	    //3.증감연산자 :반복회수가 순차적으로 늘어나거나 줄어들어야 하기 때문에 
	       
	    //중감 연산자: 하나씩 순차적으로 증가, 감소시키는 연산자
	    //1.단항으로 이루어진 증감 연산자 : a++, ++a, a--, --a
	    //2.대입연산자 : a = a + 1 -> a += 1
	       
	    //1.while문 : 반복횟수를 모르거나 무한반복을 시켜야 하는 경우 주로 사용
	    //형식) while (조건식) { 반복할 내용; 증감연산자}
		
		Scanner sc= new Scanner(System.in);
		/*
		int i = 1; //초기화변수에 반복시킬 횟수의 초기값을 저장해둠
		
		//    11 <= 10 : 거짓 -> 조건식이 거짓이면 반복할 내용을 수행하지 않고 while문을 빠져나간다.
		//    10 <= 10 : 참
		//     2 <= 10 : 참
		//     1 <= 10 : 참
		while (i <= 10) { //반복횟수 지정 : 조건이 만족할때까지 반복수행한다.
			System.out.println("i변수값 = " + i);
			System.out.println("안녕하세요");
		    i++; //	
		}
		
        System.out.println("i변수값 =" + i);
        */
		
        //초기화 변수내의 반복숫자값을 이용해서 1~10까지의  구하시오.
		
		/*
        int i = 1;
        int sum = 0;
        
        while (i<=10) {
        	System.out.println("i변수값="+ i);
        	
        	
        	//1= 1+2   3 = 1+2
        	//0= 0+1   1 = 0+1
        	
        	sum = sum + i;
        	
        	System.out.println("sum변수값="+ sum);
        	i++; //증감 연산자 -> 반복횟수를 지정하기 위해서는 빼먹지 말자!!!
        }
        System.out.println("sum변수값="+ sum);
        System.out.println("-------------------------");
        */
        
        //무한 반복 : 초기화 변수(초기값), 조건식(반복횟수), 증감연산자 가 없음
		//무한 정수값을 입력받아서 합계를 구하는 프로그램 작성
		/*
		int sum = 0;
		
		while (true) {
			System.out.println("정수값 입력(종료하려면 0을 입력)>>");
			int i = sc.nextInt();
			
			if (i==0) {
				System.out.println("입력 종료");
				break;
			}
			System.out.println("i변수값 =" + i);
			
			
			sum = sum + i;
			System.out.println("sum변수값 =" +sum);
		}
		
		System.out.println("sum변수값 =" + sum);
        System.out.println("-----------------------------");
        */
        //이중(중첩) while문
        //이중(중첩) 반복문을 사용하는 이유: 바깥 반복문이 1번 수행되는 동안 안쪽 반복문은 모든 반복횟수를 수행해야 한다.
        //단수(2 ~ 9단) * 곱해주는 값(1 ~ 9) = 곱한값
        //구구단 출력 : 2 * 1 = 2, 2 * 2 = 4
        
        int i =2; //단수 (2~9단)
        
        //    3 <= 9 : 참
        //    2 <= 9 : 참
        while(i <= 9) { //바깥쪽 while : 바깥 반복문이 1번 수행되는 동안
        	int j = 1; //곱해주는 값 (1~9)
        	//     10 <=9: 거짓 -> 안쪽 while문 수행하지 안하고 빠져 나가기
        	//     2 <= 9 : 참
        	//     1 <= 9 : 참
        	while (j <= 9) { //안쪽 반복문은 모든 반복횟수를 수행해야 한다.
        		
        		//                 2    *    1    =    1 * 2
        		System.out.println(i + "*" + j + "=" +(i * j));
        		j++; //증감연산자
        	}
        	System.out.println(); //빈 공간
        	i++;
        	
        }
        
        
        
	}

}
