package test07_2;

public class Member {

	private String id;
	private String password;
	private String name;
	
	//기본 생성자
	public Member() {}
	
	public Member(String id,String password,String name) {
		this.id = id;
		this.password = password;
		this.name = name;
		
	}
	public void show() {
		 System.out.println("id = " + id);
		 System.out.println("password = " + password);
		 System.out.println("name" + name);
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
