package test5;

import java.util.Scanner;

public class FunctionTest_6 {

	//라면 끓이기 함수 작성
	//1유형 : 반환값이 없고, 매개변수가 없는 경우
	public static void ramen() {
		String name = "신";
		int water = 550;
		String time = "4분 30초";
		System.out.println(name + "라면은 " + water + " ml의 물을 붓고 " + time + "분 동안 끓이면 맛있어요..!!");
		return;
	}
	
	//2유형 : 반환값이 없고, 매개변수가 있는 경우
	//                                                   "신",          550,      "4분 30초"
	public static void ramen1(String name, int water, String time ) {
		
		System.out.println(name + "라면은 " + water + " ml의 물을 붓고 " + time + "분 동안 끓이면 맛있어요..!!");
		return;
	}
	
	
	//3유형 : 반환값이 있고, 매개변수가 있는 경우
	public static String ramen2(String name, int water, String time ) {
		
		//return name;
		//return water;
		//return time;
		
		//호출한 곳으로 반환값(결과값)을 돌려준다.
		return (name + "라면은 " + water + " ml의 물을 붓고 " + time + "분 동안 끓이면 맛있어요..!!");
	}
	
	
	//4유형 : 반환값이 있고, 매개변수가 없는 경우
	public static String ramen3( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("라면 종류 입력 >>");
		String name = sc.nextLine();
		
		System.out.println("물의 양 입력 >>");
		int water= sc.nextInt();
		
		sc.nextLine();
		System.out.println("조리 시간 입력 >>");
		String time = sc.nextLine();
		
		//호출한 곳으로 반환값(결과값)을 돌려준다.
		return (name + "라면은 " + water + " ml의 물을 붓고 " + time + " 동안 끓이면 맛있어요..!!");
		
	}
	
	   // 4유형 예제 ) P135
	   //매개변수 입력없이 1 ~ 10까지 더한값을 반환하는 함수를 정의하고 main함수에서  호출하는 프로그램을 작성
		public static int getTenTotal() {	
			
			int i;
			int total = 0;
			for ( i = 1 ; i <= 10 ; i++ ) {
				total += i;
			}
			
			return total;
		}
		
	
	public static void main(String[] args) {
		
		/*
		//1유형 함수 호출
		//public static void ramen()
		ramen();
		System.out.println("----------------");
		
		//2유형 함수 호출
		//public static void ramen1(String name, int water, String time ) 
		ramen1("신", 550, "4분 30초");
		ramen1("진", 400, "3분");
		System.out.println("----------------");
		
		//3유형 함수 호출
		//public static String ramen2(String name, int water, String time )
		//ramen2("신", 550, "4분30초");
		String cooking = ramen2("신", 550, "4분30초"); //함수 호출도 하고 함수내에서 돌려받은 반환값(결과값)을 변수에 저장
		System.out.println("cooking = " + cooking);
		System.out.println("함수내에서 돌려받은 값 출력 " +  ramen2("신", 550, "4분30초"));
		System.out.println("----------------");
		*/
		
		
		/*
		//4유형 함수 호출
		
		//public static String ramen3( )
		//ramen3();
		String Cooking1 = ramen3(); //함수 호출도 하고 함수내에서 돌려받은 반환값(결과값)을 변수에 저장
		System.out.println("Cooking1 = " + Cooking1);
		System.out.println("함수내에서 돌려받은 값 출력 " +  ramen3());
		System.out.println("----------------");
		*/
				
		
		//public static int getTenTotal() 
		int result = getTenTotal();
		System.out.println("result  = " + result );
		System.out.println("함수내에서 돌려받은 값 출력 " +  getTenTotal());

	}

}
