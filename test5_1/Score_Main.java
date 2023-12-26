package test5_1;

public class Score_Main {

	public static void main(String[] args) {
		
     //객체 생성(인스턴스) 생성: 클래스내의 멤버들을 실제로 Heap영역에 배치시키는 것
	 //자료형 변수명 = 값;
	 //int a =10;
		Score s = new Score();
		System.out.println("s="+s);

	    System.out.println("kor" +s.kor);
	    System.out.println("math" +s.math);
	    System.out.println("eng" +s.eng);
	    System.out.println("---------------");
	    
	    //멤버 변수의 데이터값 넣기
	    s.name ="김하나";
	    s.kor =100;
	    s.math =95;
	    s.eng = 90;
	    
	    
	    s.show();
	    System.out.println("---------------");
	    
	    s.sum(100);
	    s.sum(100, 95);
	    s.sum(100, 95, 90);
	    System.out.println("---------------");
	    
	    //매개변수 1개 입력한 합계를 구하는 sum메서드
	    s.sum(100);
	    
	    //매개변수 2개 입력한 합계를 구하는 sum메서드
	    s.sum(100, 95);
	    
	    //매개변수 3개 입력한 합계를 구하는 sum메서드
	    s.sum(100, 95, 90);
	}

}
