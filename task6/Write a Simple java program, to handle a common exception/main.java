package pakage9;

import java.util.Scanner;

public class ExeptionTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            double result = a / b;

            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
	}

}
