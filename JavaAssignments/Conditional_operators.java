package JavaAssignments;
import java.util.Scanner;

public class Conditional_operators {

	public static void main(String[] args) {
	
		int a,b,big;
		
		Scanner sr= new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sr.nextInt();
		b=sr.nextInt();
		
		big=(b>a?b:a);
		
		System.out.println("Largest number is "+big);
	}

}

// expression1?expression2:expression3;