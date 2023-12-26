package test5_2;

public class Person2_Main {

	public static void main(String[] args) {
		
		//기본 생성자 호출해서 객체(인스턴스)를 생성하고
		//초기화된 멤버 변수내의 데이터값들을 출력해주기
		Person2 p = new Person2();
		p.show();
        System.out.println("------------------"); 
        
        //이름을 꼭 입력받아야만 객체(인스턴스)를 생성하는
        //일반 생성자로 생성하고 초기화된 멤버 변수내의 데이터값들을 출력해주기
        Person2 p1 = new Person2("김하나");
		p1.show();
        System.out.println("------------------");
        
        //이름,키, 체중을 꼭 입력받아야만 객체(인스턴스)를 생성하는
        //일반 생성자로 생성하고 초기화된 멤버 변수내의 데이터값들을 출력해주기
        Person2 p2 = new Person2("김하나",175.5f,70.5f);
		p2.show();
        System.out.println("------------------");
	}

}
