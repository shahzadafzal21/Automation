package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchIframe {

    public static WebDriver driver;
    @Before
    public void setup() {

       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void iFrame()throws InterruptedException{
        Thread.sleep(7000);
        driver.switchTo().frame("courses-iframe");

        WebElement searchCourse = driver.findElement(By.id("search-courses"));
        searchCourse.sendKeys("java");

        driver.switchTo().defaultContent();
        WebElement bmwradio = driver.findElement(By.id("bmwradio"));
        bmwradio.click();
    }
}

//first
