package oops;

public class Constructor {
	private String name;
	private int age;
	
	public Constructor() {
		System.out.println("I am a default Constructor");
	}
	
	public Constructor(int age, String name) {
		System.out.println("I am Parametrized constructor");
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
}
