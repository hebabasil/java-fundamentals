package package6;

import java.util.Scanner;

public class EqualTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        Integer num1 = input.nextInt();

        System.out.print("Enter second number: ");
        Integer num2 = input.nextInt();
        boolean result = num1.equals(num2);
        System.out.println(result);
	}

}
