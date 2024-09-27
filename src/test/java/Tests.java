
import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

public class Tests {
    public Calculator calc;
    @BeforeEach
    public void setUp(){
         calc = new Calculator();
    }
    @Test
    public void testSum() {
        double sumTest = calc.sumExpression(2.0, 2.0);
        double number1 = 2;
        double number2 = 2;
        double sumTest2 = number1 + number2;
        Assert.assertEquals(sumTest, sumTest2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDelException() {
        calc.delExpression(10.0, 0.0);
    }

    @Test
    public void testDel() {
        Assert.assertEquals(calc.delExpression(90.0, 4.0), Optional.of(22.0));
    }
}
