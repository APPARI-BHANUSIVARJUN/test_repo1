package calculator;
import java.util.Scanner;

public class calculator {

	int c;

	public int sum(int a, int b) {
		c=a+b;
		return c;
	}

	public int subt(int a, int b) {
		c=a-b;
		return c;
	}

	public int mult(int a, int b) {
		c=a*b;
		return c;
	}

	public int devd(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException ("Number can't devided by Zero");
		}
		else
			c=a/b;
		return c;
	}
	
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a= sc.nextInt();
		System.out.println("Enter The Second Number");
		int b= sc.nextInt();
		calculator ca= new calculator();
		System.out.println("Addition of Given Numbers is " +ca.sum(a, b));
		System.out.println("Subtraction of Given Numbers is " +ca.subt(a, b));
		System.out.println("Multification of Given Numbers is " +ca.mult(a, b));
		System.out.println("Division of Given Numbers is " +ca.devd(a, b));
		sc.close();
	}
	

}
