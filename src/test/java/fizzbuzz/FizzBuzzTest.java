package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void doFizzBuzzShouldReturn1whenInputIs1() {
        assertEquals("1", fizzBuzz.doFizzBuzz(1));
    }

    @Test
    public void doFizzBuzzShouldReturn2whenInputIs2() {
        assertEquals("2", fizzBuzz.doFizzBuzz(2));
    }

    @Test
    public void doFizzBuzzShouldReturnFizzWhenInputIs3() {
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(3));
    }

    @Test
    public void doFizzBuzzShouldReturn4whenInputIs4() {
        assertEquals("4", fizzBuzz.doFizzBuzz(4));
    }

    @Test
    public void doFizzBuzzShouldReturnBuzzWhenInputIs5() {
        assertEquals("Buzz", fizzBuzz.doFizzBuzz(5));
    }

    @Test
    public void doFizzBuzzShouldReturnFizzWhenInputIs6() {
        assertEquals("Fizz", fizzBuzz.doFizzBuzz(6));
    }

    @Test
    public void doFizzBuzzShouldReturn7WhenInputIs7() {
        assertEquals("7", fizzBuzz.doFizzBuzz(7));
    }

    @Test
    public void doFizzBuzzShouldReturnFizzBuzzWhenInputIs15() {
        assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(15));
    }
}