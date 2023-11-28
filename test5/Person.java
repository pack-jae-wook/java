package test5;

//고객관리를 위한 클래스 : 고객 관리를 위한 기능 만들기
public class Person {

	//멤버 변수(속성, 특징) 
	String name; //고객명
	int height; //키
	double weight; //체중
	char gender; //성별
	boolean married; //결혼여부
	
	//멤버 메서드
	void show() {
		System.out.println("고객명 : " +  name);
		System.out.println("키 : " +  height);
		System.out.println("체중 : " +  weight);
		System.out.println("성별 : " +  gender);
		System.out.println("결혼여부 : " +  married);
	}
		
	public static void main(String[] args) {
		
		//객체생성(인스턴스 생성) : 클래스내의 멤버 변수와 멤버 메서드를 Heap영역 비어 있는 메모리공간에 배치를 시켜서 사용할 수 있도록 한다.
		Person p = new Person();
		
		p.name = "이두나";
		p.height = 170;
		p.weight = 65.5;
		p.gender = '남';
		p.married = false;
		
		p.show();
		
		
	}
	
	
	

}
