package test06;

class Person1{
	
     public String name;	
     public int age;	
	
	
     //기본 생성자
     public Person1() {
    	 this("김지원", 15);
    	 /*
           public Person1(String name, int age){ 
    	    this.name = name;
    	    this.age = age;
    	 
    	 */
    	 
        }
     
     //기본생성자내에서 호출되어야 하는 매개변수형식에 맞는 생성자가 만들어져 있지 않으면 호출해서 사용할 수 없다.!!!
     //이름과 나이를 꼭 넣어주어야만 객체를 생성시켜준다.
     Person1(String name, int age){ 
    	 
    	 this.name = name;
    	 this.age = age;
     }
     
     //반환형은 Person1 : 객체형식의 반환값과 메서드의 매개변수가 넘겨진다.
	public Person1 returnItSelf() {
	   return this; //this반환(현재 객쳬를 반환),
	}

  //멤버 변수내에 저장된 데이터값을 출력해주는 일반 형식 메서드
  public void show() {
	System.out.println("이름=" + name);
	System.out.println("나이=" + age);
  }

}

public class CallAnotherConst1 {

	public static void main(String[] args) {
       
		Person1 p = new Person1();
		p.show();
		System.out.println("------------");
		
		
		
		
		Person1 p1 = new Person1("김자바",20);
		p1.show();
		System.out.println("------------");
		
		//public Person1 returnItSelf() 메서드 호출
		p.returnItSelf();//호출도 하고 결과값도 가지고 있다.
	    System.out.println("p.returnITSelf"+p.returnItSelf());
	    
	    //메서드내에서 반환받은 값을 저장하는 객체이기 때문에 자료형은 클래스형이어야 한다.!!!
	    Person1 pobject = p.returnItSelf();
	    System.out.println("project=" + pobject);
	    
	    System.out.println("p=" +p);
	}

}
