package ro.emanuel.crafty.pojo;

public class Sellers {
	private int id;
	private String name;
	private int age;
	private String email;
	private String grade;

	public Sellers(int id, String name, int age, String email, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return "Sellers [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", grade=" + grade + "]";
	}



	public Sellers() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}
