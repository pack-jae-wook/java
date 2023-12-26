package test5_2;

public class Person1_Main {

	public static void main(String[] args) {
		
		
		//name변수에 데이터값을 꼭 입력받아야 객체(인스턴스)를
		//생성해주는 Person1(String pname) 호출해서
		//멤버변수들의 데이터값을 초기화한다.
		Person1 p = new Person1("김하나");
		p.show();
		System.out.println("------------------");
		//name변수, height변수에 데이터값을 꼭 입력받아야 객체(인스턴스)를
		//생성해주는 Person1(String pname, float pheight) 호출해서
		//멤버변수들의 데이터값을 초기화한다.
		Person1 p1 = new Person1("이두나", 170.2f);
		p1.show();
		System.out.println("-----------------");
		
		//name변수, height변수, weight변수에 데이터값을 꼭 입력받아야 객체(인스턴스)를
		//생성해주는 Person1(String pname, float pheight, float pweight) 호출해서
		//멤버변수들의 데이터값을 초기화한다.
		Person1 p2 = new Person1("오세나", 170.2f, 52.5f);
		p2.show();
		System.out.println("-----------------");
		
		//기본 생성자료 객체(인스턴스) 생성
		//person(){ }호출해서 멤버변수들의 데이터값을 초기화한다.
		Person1 p3 = new Person1();
	    p3.show();
	}

}
