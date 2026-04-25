public class TestFizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FizzBuzz tester = new FizzBuzz();
        
        System.out.println("=== FizzBuzz Program ===");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        String resultFromFizzBuzz = tester.fizzBuzz(number);
        String resultFromOverloadedFizzBuzz = tester.fizzBuzz(number, "Fizz", "Buzz", "FizzBuzz");
        
        System.out.println("Result From the basic method : " + resultFromFizzBuzz);
        System.out.println("Result From the Overloaded method : " + resultFromOverloadedFizzBuzz);

        
      
        
    }
}

