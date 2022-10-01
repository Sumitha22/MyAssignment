package week1.day1;

public class factorial {
	public static void main(String[]args) {
		//Factorial of the given number
		int i,fact=1;
		int n =5;
		for(i=1; i<=n; i--) {
			fact = fact*i;
		}
	System.out.println("Factorial is" +fact);
		
	}

}
