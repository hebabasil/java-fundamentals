package package4;

public class Sum {

	public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {88,1,2,},
            {23,34,5}
        };
        int sum = 0;
        for (int[] row : numbers) {
            for (int value : row) {
                System.out.println("Value is: " + value);
                sum += value;
          }
        }
        System.out.println("Sum = " + sum);
	}

}
