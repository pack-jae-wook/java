package test08;

public class TestA_1 extends TestA {
 
	public TestA_1() {
	
		super();
	}

	@Override
	void aaa() {
		
		System.out.println("자식(TestA_1) 클래스의 aaa() 매소드 호출!!");
		System.out.println("자식(TestA_1)의 메서드로만 사용하게 하기 위해서이다.");
	}

	@Override
	void show() {

		System.out.println("자식(TestA_1) 클래스의 aaa() 매소드 호출!!");
	}
	
	
}
