package Bright.H060920;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionDemo1 {

    public static WebDriver driver;

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        //driver.get("https://www.argos.co.uk/");
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();

    }
    @Test
    public void action() throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement mousehover = driver.findElement(By.id("mousehover"));

        Actions action = new Actions(driver);
        action.moveToElement(mousehover).perform();

        Thread.sleep(6000);

        WebElement subelement = driver.findElement(By.linkText("Top"));
        action.moveToElement(subelement).click().perform();


    }
}
