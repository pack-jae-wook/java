package test5_1;

public class Person2 {
 
	String name;
	float height;
	float weight;
	//기본 생성자(default constructor)정의
	Person2(){ }
	
	//일반 생성자
	Person2(String name){
		
	}
	
	void show() {
		System.out.println("이름="+name);
		System.out.println("키="+height);
		System.out.println("몸무게="+weight);
	}
}
