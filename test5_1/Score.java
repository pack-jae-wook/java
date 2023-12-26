package test5_1;

//설계만 해놓은 클래스
//메서드 오버로드(Method Overload): 메소드 중복
//메서드의 이름은 같고 매개변수의 자료형이나 개수가
//다른 여러개의 함수를 작성해 놓고 사용할 수 있다
public class Score {

	String name;//이름
	int kor;//국어
	int math;//수학
	int eng;//영어
	
	//생성자 함수를 정의하지 않으면 자바 컴파일러가 기본생성자 형식으로
	//만들어서 추가해서 객체를 생성해주기 때문에 작성하지 않았다.
	//기본 생성자 함수 정의
    Score(){
    	//name = null;
    	//kor = 0;
    	//math = 0;
    	//eng = 0;
    }
	
	
	//국어 점수만 출력하는 메서드 만들기
	//         100
	void sum(int kor) {
		System.out.println("kor="+kor);
	}
	
	//국어 + 수학점수를 더한 점수를 출력하는 메서드 만들기
	//         100,      95
	void sum(int kor, int math) {
		System.out.println("kor + math="+(kor+math));
	}
	
	//국어 + 수학 + 영어점수를 더한 점수를 출력하는 메서드 만들기
//               100,      95 ,      90
	void sum(int kor, int math, int eng) {
		System.out.println("kor + math + eng="+(kor+math+eng));
	}
	
	//멤버 변수에 저장된 데이터값을 출력해주는 메서드 작성
	void show() {
		
		
		System.out.println("name="+name);
		System.out.println("kor="+kor);
		System.out.println("math="+math);
		System.out.println("eng="+eng);
	}
	
	
	
}
