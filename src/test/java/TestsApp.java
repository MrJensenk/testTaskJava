
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestsApp {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // Тесты для метода sum
    @Test
    void testSumPositiveNumbers() {
        assertEquals(5.0, calculator.sumExpression(2.0, 3.0), 0.001);
    }

    @Test
    void testSumNegativeNumbers() {
        assertEquals(-5.0, calculator.sumExpression(-2.0, -3.0), 0.001);
    }

    @Test
    void testSumWithZero() {
        assertEquals(2.0, calculator.sumExpression(2.0, 0.0), 0.001);
    }

    // Тесты для метода sub
    @Test
    void testSubPositiveNumbers() {
        assertEquals(1.0, calculator.subExpression(3.0, 2.0), 0.001);
    }

    @Test
    void testSubNegativeNumbers() {
        assertEquals(1.0, calculator.subExpression(-2.0, -3.0), 0.001);
    }

    @Test
    void testSubWithZero() {
        assertEquals(2.0, calculator.subExpression(2.0, 0.0), 0.001);
    }

    // Тесты для метода mul
    @Test
    void testMulPositiveNumbers() {
        assertEquals(6.0, calculator.mulExpression(2.0, 3.0), 0.001);
    }

    @Test
    void testMulNegativeNumbers() {
        assertEquals(-6.0, calculator.mulExpression(-2.0, 3.0), 0.001);
    }

    @Test
    void testMulWithZero() {
        assertEquals(0.0, calculator.mulExpression(2.0, 0.0), 0.001);
    }

    // Тесты для метода div
    @Test
    void testDivPositiveNumbers() {
        assertEquals(2.0, calculator.delExpression(6.0, 3.0), 0.001);
    }

    @Test
    void testDivNegativeNumbers() {
        assertEquals(-2.0, calculator.delExpression(-6.0, 3.0), 0.001);
    }

    @Test
    void testDivByZeroThrowsException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.delExpression(6.0, 0.0));
        Assertions.assertTrue(exception.getCause() instanceof ArithmeticException);
    }

    @Test
    void testDivWithZeroNumerator() {
        assertEquals(0.0, calculator.delExpression(0.0, 2.0), 0.001);
    }
}

