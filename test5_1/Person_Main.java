package test5_1;

public class Person_Main {

	public static void main(String[] args) {
		/*
		//객체 생성
		Person p = new Person();
        p.show();
        System.out.println("--------------");
        
        //멤버 변수에 데이터값 넣기
        p.name="김하나";
        p.height=170.5f;
        p.weight=65.5f;
        
        p.show();
        System.out.println("--------------");
        */
		
		//생성자(메서드)라는 특별한 메서가 호출이 되어서 객체를 생성하고
		//멤버 변수에 데이터값을 초기화를 시킨다.!!!!
		
		//Person() 생성자(메서드)가 호출되고
		//{ String name = null;
		//  float height = 0.0f
		//  float weight = 0.0f
		//}
		
		//p1객체를 생성할 때 Heap영역에 배치된 멤버 변수들은 메모리 공간(변수)만 확보되어 있는 상태이다.
		//-> 컴파일이 안된다.-> 변수는 메모리 공간에 사용할 데이터값이 꼭 들어가 있어야 컴파일이 된다.
		//String name = null;-> String형은 데이터값을 넣지 않고 변수를 사용하도록 하려면 null로 지정한다.
		//float height = 0.0f; -> float형은 데이터 데이터값을 넣지 않고 변수를 사용하도록 하려면 0.0f로 지정한다.
		//float weight = 0.0f; -> float형은 데이터 데이터값을 넣지 않고 변수를 사용하도록 하려면 0.0f로 지정한다.
		//->3개의 멤버변수에 컴파일러가 정해놓은 기본 데이터값으로 초기화되어서 
		
        Person p1 = new Person();
        p1.show();
        
        p1.name = "이두나";
        p1.show();
        /*
        String namel;
        float height;
        float weight;
        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        */
        
        //변수에 데이터값이 초기화 되어서 변수에 새로운값을 대입해서 수정하고 사용가능하다.
        String name = null;
        float height = 0.0f;
        float weight = 0.0f;
        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        
	}

}
