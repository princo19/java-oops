package oops;

public class Overload {

	public static void main(String[] args) {
		System.out.println(Sum(2, 3));
		System.out.println(Sum(2,5,6));
		System.out.println(Sum(2.3,5));
		System.out.println(Sum("Hello",5,4,5,5,9));
		
		
		
	}

	public static int Sum(int a, int b) {
		return a + b;
	}

	public static int Sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double Sum(double a , double b) {
		return a+b;
	}
	
	public static int[] Sum(String s , int... args) {
		return args;
	}
}
