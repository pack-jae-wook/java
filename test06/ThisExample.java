package test06;

public class ThisExample {

	
	public int day;
	public int month;
	private int year;
	
	//기본 생성자
	public ThisExample() { }
	
	
	//멤버 생성자
	public void show() {
	  System.out.println("일 =" + day);
	  System.out.println("월 =" + month);
	  System.out.println("년 =" + year);
	}
	public static void main(String[] args) {
		ThisExample t = new ThisExample();
		t.show();
	}

}
