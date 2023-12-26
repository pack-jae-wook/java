package test5_3;

public class Student1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st = new Student1();
		st.show();
		System.out.println("----------------------");
		
		//grade멤버 변수 getter/setter 메서드 호출
		//학년:2, 멤버 변수값 출력
		
		//설정자(setter)->멤버 변수에 데이터값 넣기 
		//public void setGrade();
        st.setGrade(2);
		
		System.out.println("st.setGrade()="+st.getGrade());
		
		
		st.setStudentName("이상원");
		
		System.out.println("st.setStudentName()="+st.getStudentName());
	}

}
