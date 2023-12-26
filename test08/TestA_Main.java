package test08;

public class TestA_Main {

	public static void main(String[] args) {
		TestA t = new TestA();
        t.show();
        System.out.println("-------------");
        t.aaa();
        
        System.out.println("===============");
        TestA t1 = new TestA();
        t1.show();
        System.out.println("--------------------");
        t1.aaa();
        System.out.println("===================");
        TestA_1 t2 =new TestA_1();
        t2.aaa();
        t2.show();
	}

}
