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
}