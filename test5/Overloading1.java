package test5;


//메서드 오버로딩(Overloading) : 메서드 중복
//메서드의 이름은 같고 매개변수의 자료형이나 개수가 다른 여러개의 함수를 작성해 놓고 사용할 수 있다.
public class Overloading1 {
	
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	//오버로드 1유형 : 매개변수가 정수형, 반환값도 정수형
	//                                  10,     5
	public static int  sum(int a, int b) {
		System.out.println("인자가 2개 일 경우");
		return  a + b; //호출한 곳으로 반환값을 돌려준다.
	}
	
	//오버로드 2유형 : 오버로드 1유형과 차이점 ->  매개변수의 개수는 다르고, 자료형은 정수형으로 동일하다.
	//메서드 이름은 같은데 매개변수의 개수가 다르다.
	//                                 10,    5 ,     1
	public static int  sum(int a, int b, int c) {
		System.out.println("인자가 3개 일 경우");
		return  a + b + c; //호출한 곳으로 반환값을 돌려준다.
	}
	
	
	//오버로드 3유형 : 오버로드 2유형과 차이점 -> 매개변수의 개수는 같고, 자료형은 실수형으로 다르다.
	//메서드 이름은 같은데 매개변수의 자료형이 다르다.
	public static double  sum(double a, double b, double c) {
		System.out.println("인자가 3개 일 경우");
		return  a + b + c; //호출한 곳으로 반환값을 돌려준다.
	}
	
	
	public static void main(String[] args) {
		
		//public static int  sum(int a, int b) 
		//sum(10, 5); //호출도 하고 결과값도 가지고 있다.
		System.out.println("sum(10,5) = " + sum(10, 5) );
		
		//public static int  sum(int a, int b, int c)
		//sum(10,5,1);
		System.out.println("sum(10,5, 1) = " + sum(10, 5, 1) );
		
		//public static double  sum(double a, double b, double c)
		//sum(10.5, 5.5, 1.1);
		System.out.println("sum(10.5, 5.5, 1.1) = " + sum(10.5, 5.5, 1.1) );
		
		System.out.println("----------------------");
		System.out.println(10);
		System.out.println("오버로딩 : 메서드 중복");
		System.out.println('a');
		
	}

}
