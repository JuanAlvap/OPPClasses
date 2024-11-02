package core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculator() throws Throwable {
        // Given
        int[] memorySizes = {-9, 52, 14, 0, -861, 7493};

        // When
        Calculator[] calculators = new Calculator[memorySizes.length];
        for (int i = 0; i < memorySizes.length; i++) {
            calculators[i] = new Calculator(memorySizes[i]);
        }

        // Then 
        for (int i = 0; i < calculators.length; i++) {
            assertEquals(Math.abs(memorySizes[i]), calculators[i].getMemorySize());
        }
    }

    @Test
    public void testAdd() throws Throwable {
        // Given
        Calculator calculator = new Calculator(6);
        double[] adder1 = {0, Double.MIN_VALUE, Double.MAX_VALUE, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN};
        double[] adder2 = {0, Double.MIN_VALUE, Double.MAX_VALUE, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN};

        //When 
        double[] result = new double[adder1.length * adder2.length];
        for (int i = 0; i < adder1.length; i++) {
            for (int j = 0; j < adder2.length; j++) {
                result[adder2.length * i + j] = calculator.add(adder1[i], adder2[j]);
            }
        }

        //Then
        assertEquals(0, result[0], 0);
        assertEquals(Double.MIN_VALUE, result[1], 0);
        assertEquals(Double.MAX_VALUE, result[2], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[3], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[4], 0);
        assertEquals(Double.NaN, result[5], 0);
        assertEquals(Double.MIN_VALUE, result[6], 0);
        assertEquals(2 * Double.MIN_VALUE, result[7], 0);
        assertEquals(Double.MAX_VALUE, result[8], 0.01);
        assertEquals(Double.NEGATIVE_INFINITY, result[9], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[10], 0);
        assertEquals(Double.NaN, result[11], 0);
        assertEquals(Double.MAX_VALUE, result[12], 0);
        assertEquals(Double.MAX_VALUE, result[13], 0.01);
        assertEquals(2 * Double.MAX_VALUE, result[14], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[15], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[16], 0);
        assertEquals(Double.NaN, result[17], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[18], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[19], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[20], 0);
        assertEquals(Double.NEGATIVE_INFINITY, result[21], 0);
        assertEquals(Double.NaN, result[22], 0);
        assertEquals(Double.NaN, result[23], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[24], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[25], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[26], 0);
        assertEquals(Double.NaN, result[27], 0);
        assertEquals(Double.POSITIVE_INFINITY, result[28], 0);
        assertEquals(Double.NaN, result[29], 0);
        assertEquals(Double.NaN, result[30], 0);
        assertEquals(Double.NaN, result[31], 0);
        assertEquals(Double.NaN, result[32], 0);
        assertEquals(Double.NaN, result[33], 0);
        assertEquals(Double.NaN, result[34], 0);
        assertEquals(Double.NaN, result[35], 0);

    }
    
    @Test
    public void testDivide() throws Throwable{
        //Given
        Calculator calculator = new Calculator(6);
        
        //When
        double a = 1589.53, b = 0.0;
        double result = calculator.divide(a, b);
        
        // Then
        assertEquals(Double.POSITIVE_INFINITY, result, 0);
    }
    
    @Test
    public void testSaveValue() throws Throwable{
        //Given
        Calculator calculator = new Calculator(6);
        
        //When
        double value = 6684.6841;
        calculator.saveValue(value, 10);
        
        //Then
        assertEquals(value, calculator.loadValue(10), 0);
        
    }

}
