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
    public void checkFizzBuzzShouldReturn1whenInputIs1() {
        assertEquals("1", fizzBuzz.checkFizzBuzz(1));
    }

    @Test
    public void checkFizzBuzzShouldReturn2whenInputIs2() {
        assertEquals("2", fizzBuzz.checkFizzBuzz(2));
    }
}