package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {

    public static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void Implicit() {

        WebElement loginbutton = driver.findElement(By.linkText("Login"));
        loginbutton.click();

        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("test");
    }

    @Test
    public void expicit(){

        WebElement loginbutton = driver.findElement(By.linkText("Login"));
        loginbutton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        username.sendKeys("test");


    }
}