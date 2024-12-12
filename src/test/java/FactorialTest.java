import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialForZero(){
        Assert.assertEquals(1, Factorial.getFactorial(0));
    }

    @Test
    public void testFactorialForPositiveNumber() {
        Assert.assertEquals(24, Factorial.getFactorial(4));
    }

    @DataProvider(name = "positiveFactorials")
    public Object[][] positiveFactorials() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
    }

    @Test(dataProvider = "positiveFactorials")
    public void testFactorialForParameterized(int f, int expected) {
        Assert.assertEquals(expected, Factorial.getFactorial(f));
    }
}