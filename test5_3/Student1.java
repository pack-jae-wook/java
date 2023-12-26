package test5_3;

public class Student1 {
   public int studentID;
   private String studentName;
   public int grade;
   public String address;
	
   //기본 생성자(default const
   
   
   public void show() {
	   System.out.println("studentID=" + studentID);
		 System.out.println("studentName=" + studentName);
		 System.out.println("grade" + grade);
		 System.out.println("address=" + address);
   }
   
   
   
   //getter/setter 자동으로 작성해주는 기능
   //마우스 오른쪽 - Source - Generaters Getters and Setters
   //단축기 : AIt + Shift + s
   
   public String getStudentName() {
	   return studentName;
   }
   
   public void setStudentName(String studentName) {
	   this.studentName = studentName;
   }



public int getGrade() {
	return grade;
}



public void setGrade(int grade) {
	this.grade = grade;
 }
}
