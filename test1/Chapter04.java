package test1;

import java.util.Scanner;

public class Chapter04 {

	public static void main(String[] args) {

		//입력 : 키보드로 입력받은 값을 변수에 저장
		
		//Scanner 참조변수형 = new Scanner(System.in);
		//형식) 클래스명 변수명 = new 클래스명 (입력방법);
		//사용 클래스 import : Ctrl + Shift + O
	
		Scanner sc= new Scanner(System.in);
        /*
		//정수 입력 : nextInt()
		System.out.println("정수 입력>>");
		int v1 = sc.nextInt();
		System.out.println("v1:" + v1+"\n");
	    System.out.println();
		
		//실수 입력: nextDouble()
		System.out.println("실수 입력>> ");
		double v2 = sc.nextDouble();
		System.out.println("v2:"+v2 + "\n");
	
		
		// 문자 입력(단어별) : next();
		System.out.println("문자 입력>> ");
		String v3 = sc.next();
		System.out.println("v3:"+v3 + "\n");

		//100엔터100.5엔터오늘은엔터오늘은 짜파게티 먹는날엔터
		
		sc.nextLine();
		
		//문장 입력 (공백을 포함해서 문자열 입력받기): nextline()
		//Enter키 만나기 전까지의 공백을 포함한 모든 문장(문자열)을 읽어온다. 
		System.out.println("문장 입력 (공백을 포함)>> ");
		String v4 = sc.nextLine();
		System.out.println("v4:"+ v4 + "\n");
		
	    
		//문자 하나만 가져오기
		System.out.println("문자 입력(단어에서 글자 하나만 가져오기)>>");
		//sc.next().charAt(0) -> 가져올 위치는 0번부터 시작!!!
		//0=>첫번째 글자를 가져온다.
		char v5 = sc.next().charAt(1);
		System.out.println("v5:" +v5 + "\n");
		*/
		
		/*
		//이름, 나이, 키, 혈역형, 코딩여부를 입력받고 출력하기
		
		//nextLine() : 공백을 포함해서 Enter key 누르기 전까지 문자열들을 모두 가져와서 저장햐준다.
		System.out.println("본인의 이름 입력 : >>");
		String name = sc.nextLine();

		//nextInt() : 정수형으로 변환해서 저장
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();
	
		//nextDouble() : 실수형으로 변환해서 저장
		System.out.println("키 입력 >>");
		double height = sc.nextDouble();
	
		//sc.next() :  문자열의 단어 단위로 변환해서 저장
		System.out.println("혈액형 입력 >>");
		String blood = sc.next();
		
		//next().charAt(0): 단어 단위에서 가져오고 싶은 글자 위치를 지정해서 가져오기
		//자료형은 char 형으로 지정해야 한다. 
		//char blood = sc.next().charAt(0); //하나의 문자만 가져오기
		
		//nextBoolean() : 참(true) /거짓(false) 으로 변환해서 저장
		//데이터값 입력 : 참이면 true -> 거짓이면 false 로 입력해준다.
		
	    System.out.println("코딩여부 입력 (true/false)>>");
	    boolean coding = sc.nextBoolean(); 
		
	    
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+height);
		System.out.println("혈액형:"+blood);
		System.out.println("코딩여부:"+coding);
		*/
		
		int num = 10000;
		
		
		System.out.println("페이지 번호 입력 : >>");
		int page = sc.nextInt();
		
		System.out.println("바깥 온도 입력 : >>");
		float temp = sc.nextFloat();
		System.out.println("가지고 있는 현금 입력 : >>");
		int cash = sc.nextInt();
		System.out.println("성별 입력 (남 or 여로만 입력 : >>");
		char gender = sc.next().charAt(0);
		
		System.out.println("코딩 여부 입력 (true/false): >>");
		boolean coding = sc.nextBoolean();
		
		System.out.println("페이지 번호: "+page+"페이지 입니다.");
		System.out.println("바깥 온도: "+temp+"도 입니다.");
		System.out.println("가지고 있는 현금 "+cash+"원입니다.");
		System.out.println("성별 "+gender+"입니다.");
		System.out.println("코딩 여부: "+coding+"입니다.");
	}

}
