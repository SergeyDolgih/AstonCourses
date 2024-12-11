import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {
    @Test
    void testFactorialForZero() {
        Assertions.assertEquals(1, Factorial.getFactorial(0));
    }
    @Test
    void testFactorialForPositiveNumber() {
        Assertions.assertEquals(120, Factorial.getFactorial(5));
        Assertions.assertEquals(24, Factorial.getFactorial(4));
    }
    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 6", "4, 24", "5, 120"})
    void testFactorialForParameterized (int f, int expected) {
        Assertions.assertEquals(expected,Factorial.getFactorial(f));
    }
}
