package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTestCase {

    @Test
    public void testFizzBuzzForMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzBuzz.getResult());
    }
    @Test
    public void testFizzBuzzForMultipleOf5(){
        FizzBuzz fizzBuzz=new FizzBuzz(99);
        assertEquals("Buzz",fizzBuzz.getResult());
    }


}
