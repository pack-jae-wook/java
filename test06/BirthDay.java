package test06;

public class BirthDay {

	public int day;
	public int month;
	private int year;
	
	
	//기본 생성자
		public BirthDay() { }
		
		
		//멤버 생성자
		public void show() {
		  System.out.println("일 =" + day);
		  System.out.println("월 =" + month);
		  System.out.println("년 =" + year);
		}
}
