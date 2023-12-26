package test5_1;

public class Person1 {

	String name;
	float height;
	float weight;
	/*
	//기본 생성자(default constructor)메서드 정의
	Person1(){
		//name = null;
		//height = 0.0f;
		//weight = 0.0f;
	}
	*/
	
	//개발자가 적어주지 않으면 컴파일러가 자동으로 기본 생성자를 
	//만들어서 멤버변수에 데이터값을 초기화시키고 객체를 생성해준다.
	Person1(){ }
	
	
	//일반 함수 형식
	void show() {
		System.out.println("이름 = " + name);
		System.out.println("키 = " + height);
		System.out.println("몸무게 = " + weight);
	}
}
