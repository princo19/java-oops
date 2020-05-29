package oops;

public class PersonClient {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name="Pikachu";
		p1.age=19;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p2.name="Prince";
		p2.age = 10;
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
