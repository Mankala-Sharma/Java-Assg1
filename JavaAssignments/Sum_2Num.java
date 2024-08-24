package JavaAssignments;
import java.util.Scanner;

public class Sum_2Num {

	public static void main(String[] args) {
		System.out.println("Enter two Numbers");
		Scanner sr= new Scanner(System.in);
		int num1= sr.nextInt();
		int num2= sr.nextInt();
		int sum;
		sum=num1+num2;
		System.out.println("Sum of "+num1 +" and "+ num2 +" is "+ sum);
		
	}

}
