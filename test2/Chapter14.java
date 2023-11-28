package test2;

import java.util.Scanner;

public class Chapter14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		//do ~ while문 : 조건이 맞지 않아도 반드시 한번은 수행을하고 조건을 검사해서 반복수행 할지를 결정한다.
		
		/*
		//while문 : 1~ 10까지의 합계를 구하는 프로그램 작성
		//조건부터 먼저 검사해서 반복 수행을 결정한다.
		int i = 15;
		int sum = 0;
		
		//     15 <= 10 : 거짓 ->조건이 거짓이므로 while문 반복내용 수행하지 않고 빠져나간다.
		while (i <= 10) {			
			sum += i;			
			i++;
		}
		System.out.println("합계 = sum " + sum);
		System.out.println("----------------- ");
		*/
		
		/*
		//do ~ while문 : 조건을 한번 수행후 나중에 검사
		//조건이 맞지 않아도 반드시 한번은 수행을하고 조건을 검사해서 반복수행 할지를 결정한다.
		int i = 15;
		int sum = 0;
		
		//     15 <= 10 : 거짓 ->조건이 거짓이므로 while문 반복내용 수행하지 않고 빠져나간다.
		do {			
			sum += i;			
			i++;
		} while (i <= 10);
		//	    15 <= 10 : 거짓 ->조건이 거짓이므로 do문 반복내용 수행하지 않고 빠져나간다.
		
		System.out.println("합계 = sum " + sum);
		System.out.println("----------------- ");
		*/
		
		
		/*
		//1)메뉴 선택
		System.out.println("메뉴 선택 : 1.콜라  2.사이다  3.환타  4.포카리스웨트 >> ");
		int menu = sc.nextInt();
		
		if (menu == 1) System.out.println("콜라를 선택하셨습니다.!!!");		
		else if (menu == 2) System.out.println("사이다를 선택하셨습니다.!!!");		
		else if (menu == 3) System.out.println("환타를 선택하셨습니다.!!!");
		else if (menu == 4) System.out.println("포카리스웨트를 선택하셨습니다.!!!");
		System.out.println("메뉴 다시 선택 >> ");
		*/
		
		
		//1)while문으로  1 ~ 4까지의 반복횟수를 만들어서 메뉴 선택 가능하도록 만들기
		
		
		/*
		//while문은 조건부터 먼적 검사 -> 초기값이 없으므로 while문 접근 안됨
		int menu = 0;
		
		//          1             1
		while ( (menu >= 1) ||  (menu  <= 4)  ) {
		System.out.println("메뉴 선택 : 1.콜라  2.사이다  3.환타  4.포카리스웨트 >> ");
		menu = sc.nextInt();
		
		if (menu == 1) System.out.println("콜라를 선택하셨습니다.!!!");		
		else if (menu == 2) System.out.println("사이다를 선택하셨습니다.!!!");		
		else if (menu == 3) System.out.println("환타를 선택하셨습니다.!!!");
		else if (menu == 4) System.out.println("포카리스웨트를 선택하셨습니다.!!!");
		else System.out.println("메뉴 다시 선택 >> ");
		}		
		System.out.println("----------------- ");
		*/
		
		
		/*
		int menu; //초기값이 지정되지 않아도 무조건 한번 수행 
		do {
		System.out.println("메뉴 선택 : 1.콜라  2.사이다  3.환타  4.포카리스웨트 >> ");
		menu = sc.nextInt();
		
		if (menu == 1) System.out.println("콜라를 선택하셨습니다.!!!");		
		else if (menu == 2) System.out.println("사이다를 선택하셨습니다.!!!");		
		else if (menu == 3) System.out.println("환타를 선택하셨습니다.!!!");
		else if (menu  == 4) System.out.println("포카리스웨트를 선택하셨습니다.!!!");
		else System.out.println("메뉴 다시 선택 >> ");
		} while ( (menu >= 1) ||  (menu  <= 4)  );
		//          2                2 
		System.out.println("----------------- ");
		*/
		
		/*
		int num = 11;
		int sum = 0;
		
		//      11 <= 10
		while (num <= 10) {
			sum += num;
			num++;			
		} 			
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.!!!");
		System.out.println("-----------");
		
		
		
		int num1 = 11;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num1++;
			System.out.println("1부터 10까지의 합은 " + sum1 + "입니다.!!!");
			
		} while (num1 <= 10);			
		 //       11  <= 10
		System.out.println("1부터 10까지의 합은 " + sum1 + "입니다.!!!");
		System.out.println("-----------");
		*/
		
		/*
		//1 ~ 4까지 입력받으면 :  지정 메뉴 출력, 5를 입력받으면 프로그램 종료
		while (true) {
		System.out.println("메뉴 선택 : 1.콜라  2.사이다  3.환타  4.포카리스웨트 >> ");
		int menu = sc.nextInt();
		*/
		
		/*
		//무한 반복 종료 : break;
		if (menu == 5) {
			System.out.println("입력 종료");
			break;
		}
		*/
		
		/*
		if (menu == 1) System.out.println("콜라를 선택하셨습니다.!!!");		
		else if (menu == 2) System.out.println("사이다를 선택하셨습니다.!!!");		
		else if (menu == 3) System.out.println("환타를 선택하셨습니다.!!!");
		else if (menu == 4) System.out.println("포카리스웨트를 선택하셨습니다.!!!");
		else if (menu == 5) {
			System.out.println("입력 종료");
			break;
		}
		else System.out.println("메뉴 다시 선택 >> ");
		}
		System.out.println("-----------");
		*/
		
		//switch문 사용해서 선택된 메뉴 출력하기
		
		boolean stop = true;
		
		//     true
		while (stop) {
			System.out.println("메뉴 선택 : 1.콜라  2.사이다  3.환타  4.포카리스웨트 >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("콜라를 선택하셨습니다.!!!");
				break;				
			case 2:
				System.out.println("사이다를 선택하셨습니다.!!!");
				break;				
			case 3:
				System.out.println("환타를 선택하셨습니다.!!!");
				break;				
			case 4:
				System.out.println("포카리스웨트를 선택하셨습니다.!!!");
				break;				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				stop = false; //꼭 넣어주기
				break;				
		    default:
		    		System.out.println("메뉴 다시 선택 >>");
			}
		}
		System.out.println("-----------");
		
		//로그인 예제
				//id : abcde , password : 12345!
				
				String id, password;
				System.out.println("id 입력 >> ");
				id = sc.nextLine();
				
				//입력한 id와 기준 id가 일치할때만 if문 안으로 들어가서 수행한다.!!!
				if (id.equals("abcde")) {
					System.out.println("id가 일치합니다. !!! ");
					
					System.out.println("password 입력 >> ");
					password = sc.nextLine();
					
					//입력한 password와 기준 password가 일치할때만 if문 안으로 들어가서 수행한다.!!!
					if (password.equals("12345!")) {
						System.out.println("password가 일치합니다. !!! ");
						System.out.println("로그인 성공!!! ");				
					}			
					else {
						//password가 일치할 때까지 입력 받고 일치하면 로그인 성공! 메시지 띄우기
						//do ~ while문 사용
						do {
							System.out.println("비밀번호 재입력 >>");	
							password = sc.nextLine();					
						} while (!(password.equals("12345!")));//입력한 비밀번호가 기존의 비밀번호가 같지 않을 경우 do문 수행하러 간다.
						
						System.out.println("재입력한 password가 일치합니다. !!! ");
						System.out.println("로그인 성공!!! ");			
				
					}
					
				}else {			
					System.out.println("해당 id가 존재하지 않습니다. !!! ");
				}		
			
		
	}

}
