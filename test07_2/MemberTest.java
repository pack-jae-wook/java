package test07_2;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberTest {

	public static void main(String[] args) {
		
		
		Member m1 = new Member("j1","123","정은주");
		Member m2 = new Member("s2","456","손예률");
		Member m3 = new Member("c3","789","천세훈");
		
		Member[] member = new Member[] {m1,m2,m3};
		
	    for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].getId());
			System.out.println(member[i].getPassword());
			System.out.println(member[i].getName());
			System.out.println("----------------------");
		}
	    
	    System.out.println("------------------");
	    
	    ArrayList<Member> mem= new ArrayList<Member>();   
	    mem.add(m1);
	    mem.add(m2);
	    mem.add(m3);
	    System.out.println("====================");
	    
	    for (int i = 0; i < mem.size(); i++) {
			System.out.println("출력");
			Member m = mem.get(i);
			
			System.out.println(m.getId());
			System.out.println(m.getPassword());
			System.out.println(m.getName());
			System.out.println("====================");	
		}
	    System.out.println("for문 사용");
	    for (Member m :mem) {
	    	System.out.println(m.getId());
			System.out.println(m.getPassword());
			System.out.println(m.getName());
			//m.show();
	    }
	    System.out.println("====================");
	    
	    MemberDAO memberDAO1 = new MemberDAO();
	    
	    //m1 객체를 매개변수로 넘기기
        //public void insertMember(Member member)메서드 호출
	    
	    memberDAO1.insertMember(m1);
	    System.out.println("-------------------");
	    
	    memberDAO1.insertMember1(member);
	    System.out.println("-------------------");
	    
	    memberDAO1.insertMember2(mem);
	    
	    
	}

}
