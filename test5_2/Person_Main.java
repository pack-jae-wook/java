package test5_2;

public class Person_Main {

	public static void main(String[] args) {
		
		//객체(인스턴스)생성:
		//기본 생성자:Person()호출해서 각 멤버변수에
		//자료형이 가지고 있는 기본 데이터값으로 초기화시킨다.!!!
		Person p = new Person();
		p.show();
		System.out.println("---------------");
		/*
		//초기화된 멤버 변수에 데이터값 넣기
		p.name="김하나";
		p.height=170.5f;
		p.weight=65.5f;
		
		p.show();
		*/
	}

}
