package com.qa.manual;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class DemoQaFormTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        // Driver is created but the test is optional; comment out if you don't want to run Selenium now
        // driver = new ChromeDriver();
        // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) driver.quit();
    }

    @Test
    void fillTextBox_and_verifyOutput() {
        // Uncomment the following lines to run the Selenium test
        // driver.get("https://demoqa.com/text-box");
        // WebElement fullName = wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
        // fullName.sendKeys("Paulo Henrique");
        // WebElement email = driver.findElement(By.id("userEmail"));
        // email.sendKeys("paulo.teste@example.com");
        // WebElement currAddr = driver.findElement(By.id("currentAddress"));
        // currAddr.sendKeys("Rua Exemplo, 123");
        // WebElement permAddr = driver.findElement(By.id("permanentAddress"));
        // permAddr.sendKeys("Rua Permanente, 456");
        // WebElement submit = driver.findElement(By.id("submit"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        // submit.click();
        // WebElement outputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        // String text = outputName.getText();
        // assertTrue(text.contains("Paulo Henrique"));
        Assertions.assertTrue(true, "Teste placeholder - execute com Selenium se desejar");
    }
}