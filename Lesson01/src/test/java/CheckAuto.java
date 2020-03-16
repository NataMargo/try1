import org.testng.annotations.Test;

public class CheckAuto {

    @Test()
    public void firstTest() {
int first=5;
int second=1;
if (first<second){
    throw new NullPointerException();
}
    }
    @Test(dependsOnMethods="thirdTest", invocationCount = 10)

    public void secondTest() {
        int first = 5;
        int second = 1;
        if (first > second) {
            throw new NullPointerException();

        }
    }
    @Test(invocationCount = 10)
    public void thirdTest() {

    }
    public void fouthTest() {

    }
}
