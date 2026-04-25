package package5;
import java.util.Scanner;
public class ArrayTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int row, column;
        do {
            System.out.println("Enter row for the array (max 10): ");
            row = input.nextInt();
            if (row <= 0 || row > 10) {
                System.out.println("Row should be between 1 and 10, please try again.");
            }
        } while (row <= 0 || row > 10);
        do {
            System.out.println("Enter column for the array (max 10): ");
            column = input.nextInt();
            if (column <= 0 || column > 10) {
                System.out.println("Column should be between 1 and 10, please try again.");
            }
        } while (column <= 0 || column > 10);
        int[][] array = new int[row][column];
        System.out.println("Enter " + (row * column) + " Array Elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element for position [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }}
        System.out.println("Array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " "); }
            System.out.println();
	}
	
	}
	}
