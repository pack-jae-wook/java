package test07_2;

import java.util.ArrayList;

public class MemberDAO {
   
	public void insertMember(Member member) {
		System.out.println("MemberDAO:insertMember(Member member)메서드 호출");
		System.out.println("아이디" + member.getId());
		System.out.println("비밀번호" + member.getPassword());
		System.out.println("이름" + member.getName());
	}
	
	public void insertMember1(Member[] m) {
		
		for(int i = 0; i<m.length; i++) {
		System.out.println("MemberDAO:insertMember(Member[]m)메서드 호출");
		System.out.println(m[i]);
		System.out.println("아이디" + m[i].getId());
		System.out.println("비밀번호" + m[i].getPassword());
		System.out.println("이름" + m[i].getName());
		}
	}
	
	
public void insertMember2(ArrayList<Member> mem) {
		
		for(int i = 0; i<mem.size(); i++) {
		System.out.println("MemberDAO:insertMember(Member[]m)메서드 호출");
		Member m = mem.get(i);
		System.out.println("아이디" + m.getId());
		System.out.println("비밀번호" + m.getPassword());
		System.out.println("이름" + m.getName());
		System.out.println("-----------------------------");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
