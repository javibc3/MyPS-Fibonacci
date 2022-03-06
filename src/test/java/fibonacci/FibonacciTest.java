package fibonacci;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @AfterEach
    public void clear(){
        fibonacci = null;
    }

    @Test
    public void shouldReturnZeroForFibonacciOfZero(){
        assertEquals(0,fibonacci.compute(0));
    }

    @Test
    public void shouldReturnZeroForFibonacciOfOne(){
        assertEquals(0,fibonacci.compute(1));
    }

}