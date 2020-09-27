package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionDemo {

    public static WebDriver driver;
    @Before
    public void setup() {

        // System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        //driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();
    }

    //@Test
    public void argos() {

        String actual = driver.getCurrentUrl();

        //Assert.assertThat(actual,Matchers.endsWith("https://www.argos.co.uk/"));
       // Assert.assertThat(actual,Matchers.equalToIgnoringCase("https://www.argos.co.uk/"));
        Assert.assertThat(actual, Matchers.containsString("https://www.amazon.co.uk/"));
    }

    @Test
    public void argos1(){

        WebElement header = driver.findElement(By.xpath("//div[@class='styles__SearchTitle-sc-1haccah-0 kAkKBD']"));
        String actual = header.getText();
        Assert.assertThat(actual, Matchers.containsString("puma"));
    }
}
