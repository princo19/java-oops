package oops;

public class ExceptionClient {

	public static void main(String[] args) throws Exception {
		Student e1 = new Student();
		e1.setAge(-10);
		System.out.println(e1.getAge());
		

	}

}
