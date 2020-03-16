import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

public class Lesson9TestWithParameters {

    @RunWith(Parameterized.class)
    public static class testParamFtoC {
        public double value;
        public double expected;

        public testParamFtoC(double value, double expected) {
            this.expected = expected;
            this.value = value;
        }
        @Parameterized.Parameters
        public static Collection <Object []> getTestData () {
            return Arrays.asList(new Object[][]{
                    {125, 51.7},
                    {0, -17.8},
                    {-1,-18.3}
            });
        }

        @Test
        public void testConvertFtoC() {
          // TemperatureConverter temperatureConverter =new TemperatureConverter();
            double result = TemperatureConverter.convertFtoC(value);
            Assert.assertEquals("Result" + result + " is not equals to :" + expected, expected, result, 0.1);
        }
    }
    @RunWith(Parameterized.class)
    public static class testParamCtoF {
        public double value;
        public double expected;

        public testParamCtoF(double value, double expected) {
            this.expected = expected;
            this.value = value;
        }
        @Parameterized.Parameters
        public static Collection <Object []> getTestData () {
            return Arrays.asList(new Object[][]{
                    {125, 257},
                    {0, 32},
                    {-1, 30.2}
            });
        }

        @Test
        public void testConvertCtoF() {
            //TemperatureConverter temperatureConverter =new TemperatureConverter();
            double result1 = TemperatureConverter.convertCtoF(value);
            Assert.assertEquals("Result " + result1 + " is not equals to :" + expected, expected, result1, 0.1);
        }
    }
}