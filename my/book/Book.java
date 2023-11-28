package my.book;

//설계만 해놓은 클래스이다.
//접근 제어자 public :  다른 패키지와 모든 클래스에서 접근이 가능하도록 허락한다.!!!
public class Book {
	
	//멤버 변수
	public String bookName = " 두근 두근 내인생";
	
	//멤버 메서드
	public void say() {
		
		System.out.println("my.book 패키지의 Book 클래스를 사용합니다..!!!");
	}
	
}
