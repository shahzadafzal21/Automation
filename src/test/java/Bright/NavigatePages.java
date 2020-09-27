package Bright;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatePages {

    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        driver.navigate().to("https://www.argos.co.uk/account/login?clickOrigin=header:home:account");
        driver.navigate().back();
         driver.navigate().forward();
    }
    @After
    public void tearDown(){
        //driver.quit();
    }
}
