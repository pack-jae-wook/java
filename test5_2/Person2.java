package test5_2;

public class Person2 {
	String name;
	float height;
	float weight;
	
	//기본 생성자 정의:매개변수가 없는 생성자
	Person2(){ }
	
	//일반 생성자:매개변수가 있는 생성자
	//이름을 꼭 입력받아야만 객체를 생성해주는 일반 생성자 정의
	//         "김하나"
	Person2(String pname){
		name = pname;
	}
	
	//이름,키, 체중을 꼭 입력받아야만 객체를 생성해주는 일반 생성자 정의
	//          "이두나",      175.5f,     70.0f
	Person2(String pname,float pheight, float pweight){
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	void show() {
		System.out.println("이름=" + name);
		System.out.println("키=" + height);
		System.out.println("몸무게=" + weight);
	}
    
}
