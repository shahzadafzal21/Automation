package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptScroll {
    public static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();

    }

    @Test
    public void scrollPageUpDown() throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(3000);

        //js.executeScript("window.scrollBy(0,1900);");
        //Thread.sleep(3000);

       // js.executeScript("window.scrollBy(0,-1900);");
        //Thread.sleep(3000);

        WebElement mousehover = driver.findElement(By.id("mousehover"));
        js.executeScript("arguments[0].scrollIntoView(true);", mousehover);
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-190);");




    }

}
