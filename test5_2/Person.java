package test5_2;

public class Person {

	String name;
	float height;
	float weight;
	
	//생성자(메서드)
	///기본 생성자(default constructor)
	//멤버 변수에 각자료형이 가지고 있는 기본값으로 초기화시켜준다.!!!
	//***클래스내에 생성자(메서드)가 개발자가 지정하지 않은 경우에는
	//컴파일러가 자동으로 기본 생성자형식을 만들어서 추가해서 멤버변수를 초기화해준다!!!
	
	
	Person(){
		//name = "김하나";
		//height = 170.5f;
		//weight = 65.5f;
	}
	
	void show() {
		System.out.println("이름="+name);
		System.out.println("높이="+height);
		System.out.println("몸무게="+weight);
	}
}
