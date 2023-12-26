package test5_3;

public class Student_Main {

	public static void main(String[] args) {
		Student st = new Student();
        st.show();
        System.out.println("--------------------");
        
        st.studentID = 231204;
        //private 접근 제어자로 멤버 변수에 새로운 데이터값을 대입하지 못한다.!!!
        //st.studentName = "이상엽";
        //st.grade= 3;
        st.address="부산광역시";
        
        st.show();
        System.out.println("----------------");
        
        //System.out.println(st.studentName);//접근 안됨!! 오류발생!!
        //접근자 메서드: 게터(getter)로 데이터값 확인!!
        //public String getStudentName() 호출
        System.out.println(st.getStudentName());// 호출도 반환값(결과값)도 가지고 있다.
        
      //설정자 메서드 : 세터(setter)로 멤버 변수에 데이터값 넣기
      //public void setStudentName(String studentName) 호출
      st.setStudentName("이상엽");  
      System.out.println("st.getStudentName()="+st.getStudentName());
      
      System.out.println(st.getGrade());
      
      //public void setGrade(int grade)호출
      st.setGrage(3);
      System.out.println("st.getGrade()="+st.getGrade());
	}
    

}
