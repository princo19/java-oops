package oops;

public class ConstructorClient {

	public static void main(String[] args) {
		Constructor p1 = new Constructor ();
		Constructor p2 = new Constructor(25,"Prince");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		

	}

}
