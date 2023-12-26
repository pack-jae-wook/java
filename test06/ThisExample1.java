package test06;


//설계만 해놓은 클래스 : 따로 * java 형식으로 존재하지 않는다.
//컴파일해서 사용하는 경우로만 존재한다. (bin폴더내에 *.class 로만 존재한다.)
class Birthday1{
	public int day;
	public int month;
	private int year;
	
	
	//기본 생성자
		public Birthday1() { }
		
		
		
		
		
		
		//접근자:getter
		public int getYear() {
			return year;
		}






        //설정자:setter
		public void setYear(int year) {
			this.year = year;
		}




        //쿨래스내에서 자신을 출력해보는 메서드 : this 출력 메서드
        public void printThis() {
        	System.out.println(this);//실제로 객체(인스턴스)를 생성하면 객체명이 된다.
        }

		//멤버 변수내의 데이터값을 출력하는 메서드
		public void show() {
		  System.out.println("일 = " + day);
		  System.out.println("월 = " + month);
		  System.out.println("년 = " + year);
		}
}

public class ThisExample1 {

	public static void main(String[] args) {
		Birthday1 b = new Birthday1();
		b.show();
		System.out.println("----------------");
		//public void setYear(int year)
		b.setYear(2000);//태어난 연도를 2000으로넣기
		
		//public int getYear():year멤버 변수값 가져오기
		System.out.println("b.getYear()"+b.getYear());//호출도 하고 결과값도 가지고 있다.
		System.out.println("----------------");
		b.show();
		System.out.println("----------------");
		
		//public void printThis()
		b.printThis();
		System.out.println("b객체명="+b);
		
	}

}
