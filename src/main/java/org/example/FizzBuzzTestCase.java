package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTestCase {

    @Test
    public void testFizzBuzzForMultipleOf3and5() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzBuzz.getResult());
    }

    @Test
    public void testFizzBuzzForMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzBuzz.getResult());
    }
    @Test
    public void testFizzBuzzForMultipleOf5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzBuzz.getResult());
    }



}
