package test07_1;

public class StudentArray {

	public static void main(String[] args) {
		
		Student st[]= new Student[3];
		
		st[0] = new Student(1001,"James");
		st[1] = new Student(1002,"Tomas");
		st[2] = new Student(1003,"Edward");
		
		for (int i = 0; i < st.length; i++) {
			System.out.print("st["+i+"]=");
			System.out.println(st[i]);
			st[i].showStudentInfo();
		
		}
		System.out.println("----------------------");
       //객체 배열내의 요소값을 찾아가서 멤버 변수값 수정
		st[0].name = "박제현";
		st[1].name = "박재환";
		st[2].name = "박재욱";
			
		for (int i = 0; i < st.length; i++) {
			System.out.print("st["+i+"]=");
			System.out.println(st[i]);
			st[i].showStudentInfo();
		
		}
		System.out.println("----------------------");
		//기본 생성자로 객체 배열 생성
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
			System.out.print("st["+i+"]=");
			System.out.println(st[i]);
			st[i].showStudentInfo();
		
		}
		System.out.println("----------------------");
	}

}
