import org.junit.*;

public class CalcTest {

    private Calc calculator;

    @Before
    public void setUp() {
        calculator = new CalcImpl();
    }

    @Test
    public void canGetASum() {
        int digit1 = 2;
        int digit2 = 24;
        int expectedResult = 26;
        int actualResult = calculator.add(digit1, digit2);
        Assert.assertEquals("If fail then method add is broken.", actualResult,expectedResult);
    }

    @Test
    public void canSubsctructDigits(){
        Assert.assertEquals(2,calculator.subtract(4,2));
    }

    @Test(expected = ArithmeticException.class)
    public void canGetAnArithmeticalException(){
        Assert.assertEquals(10,calculator.divide(2,0));
    }

}
