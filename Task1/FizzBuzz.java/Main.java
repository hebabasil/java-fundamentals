package com.mycompany.task3;
public class FizzBuzz {
    public String fizzBuzz(int number) {
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        } else if (divisibleBy3) {
            return "Fizz";
        } else if (divisibleBy5) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        if (divisibleBy3 && divisibleBy5) {
            return multOf15Word;
        } else if (divisibleBy3) {
            return multOf3Word;
        } else if (divisibleBy5) {
            return multOf5Word;
        } else {
            return String.valueOf(number);
        }

    }

}
