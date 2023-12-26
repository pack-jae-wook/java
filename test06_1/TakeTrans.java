package test06_1;

class Bus {
	
	public int busNumber; //버스 번호
	public int passengerCount;//승객수
	public int money; //버스 요금
	
	//객체 생성시에 버스 번호를 꼭 넣어주지 않으면 객체가 생성되지 않는다.!!
	//버스 번호를 매개변수로 받는 생성자
	public Bus( int busNumber ) {
		this.busNumber = busNumber;
	}
	
	//승객이 버스를 탄 경우에 버스 요금을 지불하는 메서드 -> 버스 요금(수입) 증가
	//                                1000
	public void take(int busMoney) {
		//지불 받은 요금을 가지고 있는 busMoney매개변수의 값을 멤버변수 this.money 에 계속 누적시키기
		//this.money = this.money + busMoney;
		
		// 1000    = 0 + 1000
		this.money += busMoney; 
	}
	
	public void show() {
		System.out.println("버스 " + busNumber + " 번의 승객이 지불한 요금은 " + money + "입니다.!!!");
	}
	
} //Bus 클래스 종료 부분

class Subway {
	
	public String lineNumber;  //지하철 노선
	public int passengerCount; // 승객수
	public int money; //지하철 요금
	
	//객체 생성시에 지하철 호선을 꼭 넣어주지 않으면 객체가 생성되지 않는다.!!
	//지하철 호선을 매개변수로 받는 생성자
	public Subway(String lineNumber) {
		this.lineNumber =  lineNumber;
	}
	
	//승객이 지하철에 탄 경우 지하철 요금 지불 메서드 -> 지하철 요금(수입) 증가
	//                      1500
	public void take(int subwayMoney) {
		//멤버 변수 subwayMoney에 매개변수로 받아온 데이터값을 더해서 누적시킨다.
		// 1500 = 0 + 1500
		this.money += subwayMoney; //지하철 요금 증가
		//this.money = this.money + subwayMoney;
		
	}
	
	public void show() {
		System.out.println(lineNumber + "의 승객이 지불한 요금은 "
				+ money + "입니다.!!!");
	}
	
} //Subway 클래스 종료부분


class Student {
	
	public String studentName; //학생이름
	public int grade; //학년
	public int money; //학생이 가지고 있는 돈
	
	//이름과 가진돈을 매개변수로 받는 생성자
	//객체 생성시에 이름과 가진돈을 꼭 넣어주지 않으면 객체가 생성되지 않는다.!!
	public Student(String studentName,  int money) {
		this.studentName  = studentName;
		this.money = money;
	}
	
	//학생이 가지고 있는 돈(this.money)에서는 1000원이 차감, 버스 객체에서는  수입(this.money)이 증가해야 한다.
	//학생이  버스를 타면 1000원을 지불하는 기능을 구현하는 메서드
	//                                     bus100
	public void takeBus(Bus bus) {
		//Bus 클래스 객체 
		
		/*
		public int busNumber = 100; //버스 번호
		public int passengerCount = 0;//승객수
		public int money = 0; //버스 요금
		public void take(int busMoney)
		public void show();
		*/
		bus.take(1000);
		bus.show();
		
		
		//Student 클래스의 멤버 변수 money : 학생이 가지고 있는 돈에서 1000원 감소
		//this.money = this.money - 1000;
		this.money -= 1000;
	}
	
	//학생이 가지고 있는 돈(this.money)에서는 1500원이 차감, 지하철 객체에서는  수입(this.money)이 증가해야 한다.
	//학생이  지하철을 타면 1500원을 지불하는 기능을 구현하는 메서드
	
	//                                          subwayGreen
	public void takeSubway(Subway subway) {
		//Subway 클래스 객체 
		
		/*
		public String lineNumber = "2호선";  //지하철 노선
		public int passengerCount = 0; // 승객수
		public int money = 0; //지하철 요금
		public void take(int subwayMoney);
		public void show();
		*/
		
		subway.take(1500);
		subway.show();
		
		//Student 클래스의 멤버 변수 money : 학생이 가지고 있는 돈에서 1000원 감소
		//this.money = this.money - 1000;
		this.money -= 1500;
	}
	
	public void show() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.!!!");
	}
}//Student 클래스 종료부분


public class TakeTrans {

	public static void main(String[] args) {
		
		/*
		//버스 객체 생성 : public Bus( int busNumber ) 생성자 호출
		Bus bus100 = new Bus(100);
		bus100.show();
		
		//버스 요금 지불하면 수입(money증가)하는 메서드 
		//public void take(int busMoney) 호출
		bus100.take(1000);
		bus100.show();
		
		bus100.take(1000);
		bus100.show();
		System.out.println("-------------------");
		
		//지하철 객체 생성 : 	public Subway(String lineNumber) 생성자 호출
		Subway subwayGreen = new Subway("2호선");
		subwayGreen.show();
		
		subwayGreen.take(1500);
		subwayGreen.show();
		
		subwayGreen.take(1500);
		subwayGreen.show();
		System.out.println("-------------------");
		
		
		//학생 객체 생성 : public Student(String studentName,  int money) 생성자 호출
		Student james = new Student("james", 100000);
		james.show();
		
		bus100.take(1000);
		bus100.show();
		
		subwayGreen.take(1500);
		subwayGreen.show();
		
		//takeBus메서드의 매개변수는 객체형이다.
		//takeBus메서드의 매개변수값은 객체이이여 한다.!!!
		//public void takeBus(Bus bus) -> Bus 클래스로 생성한 객체만 매개변수로 넘겨 줄수 있다.
		james.takeBus(bus100);
		james.show();
		
		james.takeBus(bus100);
		james.show();
		
		
		//public void takeSubway(Subway subway) -> Subway 클래스로 생성한 객체만 매개변수로 넘겨 줄수 있다.
		james.takeSubway(subwayGreen);
		james.show();
		
		james.takeSubway(subwayGreen);
		james.show();
		*/
		
		//버스 객체 생성 : public Bus( int busNumber ) 생성자 호출
		Bus bus100 = new Bus(100);
		
		//지하철 객체 생성 : 	public Subway(String lineNumber) 생성자 호출
		Subway subwayGreen = new Subway("2호선");
		
		//학생 객체 생성 : public Student(String studentName,  int money) 생성자 호출
		Student james = new Student("james", 100000);
		
		
		
		james.show();
		
		
		//public void takeBus(Bus bus)
		//함수를 호출해서 수행할때마다 this.money(학생이 가지고 있는돈) - 1000
		james.takeBus(bus100);
		james.show();
		
		//public void takeBus(Bus bus)
		//함수를 호출해서 수행할때마다 this.money(학생이 가지고 있는돈) - 1000
		james.takeBus(bus100);
		james.show();
		
		//public void takeSubway(Subway subway)
		//함수를 호출해서 수행할때마다 this.money(학생이 가지고 있는돈) - 1500
		james.takeSubway(subwayGreen);
		james.show();	
		
		//public void takeSubway(Subway subway)
		//함수를 호출해서 수행할때마다 this.money(학생이 가지고 있는돈) - 1500
		james.takeSubway(subwayGreen);
		james.show();
		
		james.takeSubway(subwayGreen);
		james.show();
		

		System .out .println("-------------------------");
	}

}
