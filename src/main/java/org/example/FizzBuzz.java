package org.example;

public class FizzBuzz {

    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String getResult() {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } return Integer.toString(number);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            FizzBuzz fizzBuzz = new FizzBuzz(i);
            System.out.println(fizzBuzz.getResult());
        }
    }
}
