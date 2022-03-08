package fibonacci;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Casos de prueba
    fibonacci -1 -> IllegalArgumentException
    fibonacci 0 -> 0
    fibonacci 1 -> 1
    fibonacci 2 -> 1
    fibonacci 3 -> 2
    fibonacci 4 -> 3

    Caso general
    fibonacci n -> fibonacci n - 1 + fibonacci n - 2

 */

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
    public void shouldReturnOneForFibonacciOfOne(){
        assertEquals(1,fibonacci.compute(1));
    }

    @Test
    public void shouldReturnOneForFibonacciOfTwo(){
        assertEquals(1,fibonacci.compute(2));
    }

    @Test
    public void shouldReturnTwoForFibonacciOfThree(){
        assertEquals(2,fibonacci.compute(3));
    }

    @Test
    public void shouldReturnThreeForFibonacciOfFour(){
        assertEquals(3,fibonacci.compute(4));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionForFibonacciOfNegative(){
        assertThrows(IllegalArgumentException.class,()->{
            fibonacci.compute(-1);
        });
    }

}