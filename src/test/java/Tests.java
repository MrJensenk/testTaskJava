import org.example.Main;
import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tests {
    @Test
    public void testSum() {
        int sumTest = Main.sumExpression(2,2);
        int number1 = 2;
        int number2 = 2;
        int sumTest2 = number1 + number2;
        Assert.assertEquals(sumTest, sumTest2);
    }
    @Test(expected = ArithmeticException.class)
    public void testDelException(){
        Main.delExpression(10,0);
    }
    @Test
    public void testDel(){
        Assert.assertEquals(Main.delExpression(90,4), 22);
    }
}
