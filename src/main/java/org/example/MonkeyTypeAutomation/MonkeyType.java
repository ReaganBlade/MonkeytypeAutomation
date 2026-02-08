package org.example.MonkeyTypeAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Other Browser Drivers
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MonkeyType {

    public void run(String webDriver) throws InterruptedException {

        WebDriver driver;
        switch (webDriver) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://www.monkeytype.com/");

        wait.until(ExpectedConditions.titleIs(
                "Monkeytype | A minimalistic, customizable typing test"
        ));

        try {
            WebElement acceptCookies = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".active.acceptAll")));
            acceptCookies.click();
        } catch (TimeoutException ignored) {
        }

        WebElement inputBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wordsInput")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".word.active")));

        while (true) {
            try {
                WebElement activeWord = driver.findElement(By.cssSelector(".word.active"));

                String currentIndex = activeWord.getAttribute("data-wordindex");

                String wordText = activeWord.getText();

                inputBox.sendKeys(wordText + " ");

                wait.until(d -> !d.findElement(
                        By.cssSelector(".word.active")
                ).getAttribute("data-wordindex").equals(currentIndex));

            } catch (TimeoutException e) {
                break;
            }
        }

        driver.quit();
    }
}
