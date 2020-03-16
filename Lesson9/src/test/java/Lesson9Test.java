import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

public class Lesson9Test {
    TemperatureConverter testObject;

    @Before
    public void initialize() {
        testObject = new TemperatureConverter();
    }

    @Test
    public void convertFtoC() {
        Assert.assertEquals(51.7, testObject.convertFtoC(125), 0.1);

    }

    @Test
    public void convertCtoF() {
        Assert.assertEquals(257, testObject.convertCtoF(125), 0.1);

    }

    @Test
    public void convertCtoK() {
        Assert.assertEquals(398.15, testObject.convertCtoK(125), 0.1);
    }

    @Test
    public void convertKtoC() {
        Assert.assertEquals(-148.15, testObject.convertKtoC(125), 0.1);
    }

    @Test
    public void convertFtoK() {
        Assert.assertEquals(324.82, testObject.convertFtoK(125), 0.1);
    }

    @Test
    public void convertKtoF() {
        Assert.assertEquals(-234.67, testObject.convertKtoF(125), 0.1);
    }

}
