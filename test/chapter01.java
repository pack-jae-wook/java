package test;

public class chapter01 {

	public static void main(String[] args) {
		
	  /*
	   System.out.println("공부하고 있는 페이지는 30 페이지 입니다.");	   
	   System.out.println("바깥 온도는 25.5 도 입니다.");
	   System.out.println("현금은 100000원을 가지고 있습니다.");
	   System.out.println("성별은 남 입니다.");
	   System.out.println("코딩은 할 수 있습니다.");
	   System.out.println("--------------");
	   */
	   //1.한줄 주석 : //가 붙은 한줄 명령만 주석처리 : -> Ctrl + Shift + c
	   //2.묶음 주석 : /*   ~~~~ 여러 줄 주석처리    */
	   /*
	   //변수(variable): 데이터를 담아두는 메모리 공간
	   //변수 선언 형식 : 데이터타암 (자료형) 변수명(찾아갈 메모리 주소) = 값;
	   //형식)데이터타입 (자료형) 변수명 = 값;
		byte page = 30;
		float temp = 25.5f;
	    int cash = 100000;
	    char gender = '남'; //문자 데이터를 입력 : 작은따음표로 묵어준다.
	    boolean coding = true; //참과 거짓(참:true/거짓:false)
	    System.out.println("공부하고 있는 페이지는 "+page +"페이지 입니다.");
	    System.out.println("바깥 온도는 "+temp+"도 입니다.");
	    System.out.println("현금은 "+cash+"원을 가지고 있습니다.");
	    System.out.println("성별은"+gender+" 입니다.");
	    System.out.println("코딩은" +coding+"입니다.");
	    System.out.println("--------------");
	    */
		/*
	    //변수내에 저장된 데이터값 수정
	    page = 50;
	    temp = 15.3f;
	    cash = 80000;
	    gender = '남';
	    coding = false;
	    
	    System.out.println("공부하고 있는 페이지는 " +page + "페이지 입니다.");
	    System.out.println("바깥 온도는 "+temp+"도 입니다.");
	    System.out.println("현금은 "+cash+"원을 가지고 있습니다.");
	    System.out.println("성별은"+gender+" 입니다.");
	    System.out.println("코딩은" +coding+"입니다.");
	    System.out.println("--------------");
	    
	    //이름, 나이, 키, 혈액형, 코딩여부 출력
	    System.out.println("이름은 박재욱 입니다.");
	       System.out.println("나이는 23세 입니다.");
	       System.out.println("키는 169cm 입니다.");
	       System.out.println("혈액형은 A형 입니다.");
	       System.out.println("자바 프로그램 코딩은 할 수 있습니다.");
	       System.out.println("--------------");
	    //문자열(String) :문자여러개가 동시에 하나로 묶여있다.
	    //문자열 데이터를 입력 : 큰따음표로 묶어준다.
	       
	       String name ="박재욱";
	       byte age = 23;
	       float height = 169f;
	       char blood = 'A';
	       boolean coding1= true;
	       
	       System.out.println("이름은" +name + "입니다.");
	       System.out.println("나이는 "+age+"입니다.");
		   System.out.println("키는 "+height+"입니다.");
		   System.out.println("혈액형은 "+blood+"입니다.");
		   System.out.println("자바 프로그램 코딩은"+coding1+"입니다.");
		   System.out.println("--------------");
		   */
		
		   //상수(constant): 변하지 않는값 (변수에 새로운 값을 넣지 못한다.)
		   //1)리터럴 상수(Literal Constant): 변수에 입력되는 데이터값 자체이다(ex: 100, 'A')
		   //2)기호 상수(Symbolic Constant): 변수에 새로운 데이터값을 대입하지 못하게해서 변수내의 값을 고정시켜서 사용한다.
		   //기호 상수는 변수명을 대문자만으로 표시하기 !!! -> 자료형 앞에 final 붙여주기!!!
		
		   int num = 100; //변수의 초기화 : 변수에 데이터값을 넣어놓았다.
		   System.out.println("num 변수값 :"+num);
		   
		   //num 변수값을 50으로 수정
	       num = 50;
	       System.out.println("num 변수값 :"+num);
	       System.out.println("--------------");
	       
	     //메모리 공간만 확보되어 있고 데이터값은 넣어 놓지 않았다.
	     //변수의 초기화가 되어 있지 않다.(컴파일러 해석하지(동작하지) 않는다.)
	     //나중이라도 변수에 값을 넣어주어야 한다.!!!!
	       int num1;
	       num1 = 30;
	       System.out.println("num1 변수값 :"+ num1);
	       System.out.println("--------------");
	       	       
	      //자료형 앞에 final 키워드를 붙여주면 변수에 새로운 값을 대입하지 못한다.
	       //변수의 값을 수정하지 못한다.!!!
	       final double PI = 3.14;
	       System.out.println("PI 변수값 :"+ PI);
	       System.out.println("--------------");
	       
	       //final이 붙여져 있는 변수는 새로운 값 대입하면 에러 발생
	       //PI = 3.15;
	       //System.out.println("PI 변수값 :"+ PI);
	       
	       //환율을 이용한 환산금액 구하기 ( 더하기+ , 빼기- , 곱하기* , 나누기/)
	       //달러 * 환율(한국 금액)
	       final int RATE = 1400;
	       //RATE = 1500;
	       
	       int won = 1 * RATE;
	       int won1 = 2 * RATE;
	       int won2 = 3 * RATE;
	       int won3 = 4 * RATE;
	       int won4 = 5 * RATE;
	      
	       System.out.println(won);
	       System.out.println(won1);
	       System.out.println(won2);
	       System.out.println(won3);
	       System.out.println(won4);
	       System.out.println("--------------");
	       
	     //inch 단위를 cm 단위로 환산해서 구하기
	     //1 inch -> 2.54cm
	     float cm1 = 1 * 2.54f;
	     float cm2 = 2 * 2.54f;
	     float cm3 = 3 * 2.54f;
	     float cm4 = 4 * 2.54f;
	     float cm5 = 5 * 2.54f;
	     System.out.println(cm1 +","+cm2 +"," +cm3 +"," +cm4 +","+ cm5);
	     System.out.println("--------------");
	     
	     final float INCH = 2.54f;
	     
	     float cm6 = 1 * INCH;
	     float cm7 = 2 * INCH;
	     float cm8 = 3 * INCH;
	     float cm9 = 4 * INCH;
	     float cm10 = 5 * INCH;
	     System.out.println(cm6 +","+cm7 +"," +cm8 +"," +cm9 +","+ cm10);
	     
	     System.out.println("--------------");
	     
	     //문자(character)와 문자열 (String)
	     //1)문자 (character): 글자 하나 단위, 자료형(char), 데이터값을 작은 따음표로 묶어준다.('A','김')
	     char ch1 = 'A';
	     char ch2 = '김';
	     System.out.println("ch1 : " + ch1); 
	     System.out.println("ch2 : " + ch2); 
	     
	     System.out.println("ch1변수값 :" + (int)ch1);
	     System.out.println("ch2변수값 :" + (int)ch2);
	    }

}
