import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class CalculatorTest {
  @Test
  public void testADD() {
    Calculator calculator = new Calculator();
    int sum = calculator.add(1,5);
    assertEquals(6, sum);
  }
  public void testSub() {
    Calculator calculator = new Calculator();
    int sum = calculator.subtract(13213,99);
    assertEquals(13114, sum);
  }
  public void testMult() {
    Calculator calculator = new Calculator();
    int sum = calculator.multiplicat(456,99);
    assertEquals(45144, sum);
  }
  public void testSub() {
    Calculator calculator = new Calculator();
    int sum = calculator.division(12345,15);
    assertEquals(823, sum);
  }
}
