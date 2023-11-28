package test2;

import java.util.Scanner;

public class Chapter14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//do ~ while문 : 조건이 맞지 않아도 반드시 한번은 수행을하고 조건을  검사해서 반복 수행 할지를 결정한다.
		// 1~10까지의 합계를 구하는 프로그램 작성
        /*
		int i= 15;
		int sum = 0;
		 do {
			 sum += i;
			 
			 i++;
			 
		 }while ( i<=10 );
		 
		 System.out.println("합계 = sum" + sum);
		 */
		/*
		
		// 1)메뉴 선택
		System.out.println("메뉴 선택 >>");
		int menu = sc.nextInt();
		
		if (menu== 1) System.out.println("콜라");
		else if (menu== 2) System.out.println("사이다");
		else if (menu== 3) System.out.println("환타");
		else if (menu== 4) System.out.println("포카리스웨트");
		else System.out.println("메뉴 다시 선택>>");
		*/
		
		
		// 1)while문으로 1 ~ 4까지의 반복횟수를 만들어서 메뉴 선택 가능하도록 만들기
	    /*
		int menu = 1;
		while ( (menu >=1) || (menu <= 4)) {
		System.out.println("메뉴 선택 >>");
		 menu = sc.nextInt();
				
		if (menu== 1) System.out.println("콜라");
		else if (menu== 2) System.out.println("사이다");
		else if (menu== 3) System.out.println("환타");
		else if (menu== 4) System.out.println("포카리스웨트");
		else System.out.println("메뉴 다시 선택>>");
	  }
	  */
/*
		int menu = 1;
		do {
		System.out.println("메뉴 선택 >>");
		 menu = sc.nextInt();
				
		if (menu== 1) System.out.println("콜라");
		else if (menu== 2) System.out.println("사이다");
		else if (menu== 3) System.out.println("환타");
		else if (menu== 4) System.out.println("포카리스웨트");
		else System.out.println("메뉴 다시 선택>>");
	 
		} while ( (menu >=1) || (menu <= 4));
	*/	
		/*
		
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while(num <= 10);
		System.out.println("1부터 10까지의 합은" + sum +"입니다.");
		
		*/
	
		//5를 입력받으면 프로그램 종료
		/*
		while (true) {
		System.out.println("메뉴 선택 >>");
		int menu = sc.nextInt();
		  if (menu == 5) { 
			System.out.println("입력 종료");
			break;
		}
		if (menu== 1) System.out.println("콜라");
		else if (menu== 2) System.out.println("사이다");
		else if (menu== 3) System.out.println("환타");
		else if (menu== 4) System.out.println("포카리스웨트");
		else System.out.println("메뉴 다시 선택>>");
		}
	    */
		
		//5를 입력받으면 프로그램 종료
				
		        boolean stop = true;
		        
		        //     true
				while (stop) {
				System.out.println("메뉴 선택 >>");
				int menu = sc.nextInt();
				switch(menu) {
				case 1: 
				    System.out.println("콜라");
				    break;
				case 2: 
				    System.out.println("사이다");
				    break;
				case 3: 
				    System.out.println("환타");
				    break;
				case 4: 
				    System.out.println("포카리스웨트");
				    break;
				case 5: 
				    System.out.println("종료");
				    stop = false;
				    break;
				 default :
					System.out.println("다시 입력");
			
				}				
		}
			  
		
		
		
       }	
	}
