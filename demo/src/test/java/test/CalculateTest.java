package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.example.demo.controller.*;

public class CalculateTest {
    Calculate calculation = new Calculate();
    int sum = calculation.sum(2, 5);

    int testSum = 7;

    @Test
    public void testSum() {
        System.out.println("@Test sum():" + sum + " = " + testSum);
        assertEquals(testSum, sum);
    }
}
