package test5_2;

public class Person1 {

	String name;
	float height;
	float weight;
	
	//클래스내에 생성자가 1개라도 정의되어 있으면 기본 생성자는 컴파일러가
	//자동으로 추가해주지 않는다. -> 개발자가 직접 작성해주어야 한다.
	//정의된 생성자 형식에 맞추어서만 객체가 생성이 된다.
	// -> 클래스내에 생성자가 작성되어 있는지 확인을 하고 객체(인스턴스)를 생성해야 한다.
	
	//기본 생성자(default construct)
	//1.매개변수가 없는 생성자
	Person1(){}
	
	
	//일반 생성자 : 매개변수가 있는 생성자
	//반드시 인자값(데이터값)을 멤버변수에 넣어줘야만 객체가 생성되는 강제성이 있다.
	
	//1.멤버변수 중에서 name변수에 지정한 데이터값을 넣어주지 않으면
	//객체(인스턴스)를 생성해주지 않는다.!!!
	
	//        김하나
	Person1(String pname){
		//멤버변수 = "김하나"
		name= pname;
	}
	
	//2.멤버변수 중에서 name변수, height변수에 지정한 데이터값을 넣어주지 않으면
	//객체(인스턴스)를 생성해주지 않는다.!!!            
	Person1(String pname,float pheight){
		//멤버변수(name) = "이두나";
		//멤버변수 = 170.2f;
	   name = pname;
	   height = pheight;
	}
	
	//3.멤버변수 중에서 name변수, height변수, weight변수에 지정한 데이터값을 넣어주지 않으면
		//객체(인스턴스)를 생성해주지 않는다.!!!            
		Person1(String pname, float pheight, float pweight){
			//멤버변수(name) = "이두나";
			//멤버변수 = 170.2f;
			//멤버변수 = 52.5f;
		   name = pname;
		   height = pheight;
		   weight = pweight;
		}
	
	//일반 메서드 : 메서드 정의하고 필요시에 언제든지 호출해서 사용할 수 있는 형식
	void show() {
		System.out.println("name=" + name);
		System.out.println("height=" + height);
		System.out.println("weight=" + weight);
	}
}
