package test06;

class Person{
	
	public String name;
	public int age;
	
    //생성자에서 다른 생성자를 호출:this()
	//객체 생성시에 멤버 변수에 초기화시켜 놓은 데이터값과 상관 없이 this()생성자 호출시에
	//넣어주는 데이터값으로 멤버 변수를 억지로 초기화해버리는 기능과 같다.
	public Person(){
		
		//만들어 놓은 자신의 생성자 중에서 public Person(String name, int age) 호출해서 멤버 변수에 데이터값을 초기화시켜준다.
		//this의미 : 내가 만들어놓은 생성자 중에서 호출 : public Person(String name, int age)
		this("김하나",20);
		
		//this.name = "김하나";
		//this.age = 20;
	}
	
	
    
	
	//일반 생성자: 객체 생성시에 이름을 꼭 넣어주지 않으면 객체를 생성해주지 않는다.!!!
	public Person(String name) {
		
		//public Person(String name,int age)생성자 호출
		this("김자바",15);
		//멤버 변수 = 매개변수값
		//this.name = name;	
	}
	
	//일반 생성자: 객체 생성시에 이름, 나이를 꼭 넣어주지 않으면 객체를 생성해주지 않는다.!!!
     public Person(String name,int age) {
    	//멤버 변수 = 매개변수값
		this.name = name;
		this.age = age;
	}
	
	//멤버 변수내의 데이터값을 출력하는 메서드
	public void show() {
		System.out.println("이름=" +name);
		System.out.println("나이=" +age);
	}	
	
}



public class CallAnotherConst {

	public static void main(String[] args) {
		
		//기본 생성자 public Person() { } 호출해서 멤버 변수의 데이터값을 초기화해서 객체 생성
        Person ps = new Person();
        ps.show();
        System.out.println("------------------");
        
        //일반 생성자 public Person(String name) 호출해서 멤버 변수의 데이터값을 초기화해서 객체 생성
		//객체 생성시에 이름을 꼭 넣어주지 않으면 객체를 생성해주지 않는다.!!!
        Person p1 = new Person("이상엽");
        p1.show();
        System.out.println("-------------");
        
       //일반 생성자 public Person(String name, int age) 호출해서 멤버 변수의 데이터값을 초기화해서 객체 생성
       //객체 생성시에 이름을 꼭 넣어주지 않으면 객체를 생성해주지 않는다.!!!
        Person p2 = new Person("이상엽",20);
        p2.show();
        System.out.println("-------------");
              
	}

}
