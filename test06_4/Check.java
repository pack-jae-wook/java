package test06_4;


//클래스 멤버와 인스턴스 멤버간의 클래스내에서 창조와 호출

//(1)인스턴스 멤버의 클래스 멤버 사용->가능(인스턴스 메서드 내에는 클래스 변수도 참조 가능)
//(2)인스턴스 멤버의 인스턴스 멤버 사용->가능(인스턴스 메서드 내에는 인스턴스 변수도 참조 가능)
//(3)클래스 멤버의 인스턴스 멤버 사용-> 애러(static 메서드 내에는 인스턴스 변수 참조 불가능)
//(4)클래스 멤버의 클래스 멤버 사용-> 가능(static메서드 내에는 static변수만 참조 가능)
//(5)static 멤버끼리는 this키워드를 사용할수 없음








//클래스 멤버(클래스 변수, 클래스 메서드)는 존재하는 시점은 처음 클래스가 메모리에 올라갈때이다.
//클래스 멤버는((클래스 변수,클래스 메서드)는 현재 존재하고 있다.
//인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)는 객체를 생성해야만 존재하고 사용할 수 있다.
//인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)는 객체를 생성하기 전까지는 존재하고 있지 않는다.
public class Check {
  
	static int cv =5; //클래스 변수, 객체 생성하지 않아도 현재 존재하고 있어서 사용이 가능
	int iv = 4;//인스턴스 변수, 객체를 생성하고 객체에서 호출해서 사용-> 현재 존재하고 있지 않아서 사용이 불가능
	
	//클래스 메서드 : 객체를 생성하지 않아도 현재 존재하고 있는 메서드라서 바로 호출해서 사용가능 
	static void cm() {
		System.out.println("나는 클래스 메서드 입니다!!");
		System.out.println("객체를 생성하지 않아도 호출이 가능한 메서드입니다!!");
		System.out.println(cv);
		//인스턴스 변수는 객체를 생성해야만 객체내에서 사용할 수 있기 때문에 변수의 값이 존재하지 않는다고
		//취급하기 때문에 접근 할 수 없다.
		//System.out.println(iv); //변수 생성 이전 오류!!
	}
	
	
	//인스턴스 메서드 : 객체를 생성하고 객체내에서 호출해야만 사용가능-> 현재 존재하고 있지 않아서 사용이 불가능 
	void im() {
	  System.out.println("나는 인스턴스 메서드 입니다!!");
	  System.out.println("객체를 생성해야만 객체내에서 호출이 가능한 메서드입니다!!");
	  
	  //인스턴스 변수는 객체를 생성하고 나서 객체내에서 사용할 수 있는 변수이다. (객체 생성후에는 cv, iv둘다 접근(사용) 가능하다.
	  System.out.println("this.cv" + this.cv);
	  System.out.println("this.iv=" + this.iv);
	  
	}
	
	
}