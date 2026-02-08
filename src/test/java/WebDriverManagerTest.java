import jdk.jshell.spi.ExecutionControlProvider;
import org.example.SPwithSelenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class WebDriverManagerTest {

    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        driver = WebDriverManager.getInstance(browser).getDriver();
    }

    @Test
    public void testGoogle() {
        driver.get("https://www.ubisoft.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.titleIs("Ubisoft | Welcome to the official Ubisoft website"));
        System.out.println(Thread.currentThread() + ": " + driver.getTitle());

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("onetrust-accept-btn-handler")
                )
        );

        button.click();

        Assert.assertEquals(driver.getTitle(), "Ubisoft | Welcome to the official Ubisoft website");
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
