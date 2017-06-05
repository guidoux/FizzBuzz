package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void checkFizzBuzzShouldReturn1whenInputIs1() {
        assertEquals("1", fizzBuzz.checkFizzBuzz(1));
    }
}