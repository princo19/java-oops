package oops;

public class PerClient {

	public static void main(String[] args) {
		Per p3 = new Per();
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		p3.setName("Prince");
		p3.setAge(20);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
	}

}
