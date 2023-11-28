package test5;

import my.book.Book;

//my.book 패키지내의 설계만 해놓은 클래스:  Book 을 수행하는 클래스
//접근 제어자 public :  다른 패키지와 모든 클래스에서 접근이 가능하도록 허락한다.!!!
public class Book_Main {

	public static void main(String[] args) {
		
		//설계해놓은 클래스가 현재 수행하는 클래스와 다른 곳에 위치해 있다.
		//방법1) 패키지명과 클래스명을 모두다 적어주기
		//객체 생성 : 패키지명.클래스명 변수명 = new 패키지명.클래스명();
		my.book.Book pac = new my.book.Book();
		pac.say();
		System.out.println(pac.bookName);
		System.out.println("-------------");
		
		
		//방법2)패키지명을 적어주지 않음 : import 해서 객체 생성
		//소스 제일 상단에 패키지명과 import my.book.Book; 확인하기
		//Ctrl + Shift + O : 자동으로 패키지 경로 찾기
		Book pac1 = new Book();
		pac1.say();
		System.out.println(pac1.bookName);
		pac1.bookName = "내 인생";
		System.out.println(pac1.bookName);
		System.out.println("-------------");
		
		

	}

}
