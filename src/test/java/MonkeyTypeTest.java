import org.example.MonkeyTypeAutomation.MonkeyType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MonkeyTypeTest {

    @Parameters({"webDriver"})
    @Test
    public void testMonkeyType(String webDriver) {
        MonkeyType mt = new MonkeyType();
        try {
            mt.run(webDriver);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
