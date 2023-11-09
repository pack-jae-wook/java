package test2;

import java.util.Scanner;

public class Chapter10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//4) 중첩 if문 : if문 (바깥쪽)내의 if문(안쪽)으로 구성되어 있다.
        //바깥쪽 if문의 조건이 맞지 않으면 안쪽 if문을 수행할 수 없다.
		//-> 바깥쪽 if문이 참(true) 이어야만 수행이 가능하다.!!!!
		
		int math = 70;
		int eng  = 70;
		
		//수학 점수(math)가 70점 이상 이어야만!!
		//  70 >= 70
		if (math >= 70) {
			
			// 70>= 60 : 참
			// 55>= 60 : 거짓
			if (eng >= 60) {
				
			
			System.out.println("pass!!");
			}
			
			else {
				System.out.println("fail!!");
			}
		}
		
		//로그인 예제
		//id : abcde, password : 12345!
		String id, password;
		System.out.println("id 입력>>");
		id = sc.nextLine();
		
		//입력한 id와 기준 id가 일치할때만 if문 안으로 들어가서 수행한다.!!!
		if (id.equals("abcde")) {
			
			System.out.println("id가 일치합니다. !!!");
			
			System.out.println("password 입력 >>");
			password = sc.nextLine();
			if (password.equals("12345!")) {
			
				System.out.println("password가 일치합니다.");
				System.out.println("로그인 성공!!!.");
												
				
			}
			else {
				System.out.println("password가 일치하지 않습니다.!!!");
			}
			
			
		} else {
			System.out.println("해당 id가 존재하지 않습니다. !!!");
		}
		
	}

}
