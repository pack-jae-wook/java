package test06_4;

public class CheckMain {

	public static void main(String[] args) {
		
		
		//클래스 멤버에 접근
		System.out.println(Check.cv);
		Check.cm();
		
		Check ch = new Check();
		ch.im();
		
		
		System.out.println("---인스턴스 멤버는 클래스 멤버에 접근가능----");
		System.out.println(ch.cv);
		ch.cm();

	}

}
