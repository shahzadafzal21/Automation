package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyboardPress {

    public static WebDriver driver;
    @Before
    public void setup() {

        // System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/text-box");
        //driver.get("https://letskodeit.teachable.com/p/practice");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void keyPress(){

        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("shahzadafzal21@hotmail.com");
        username.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("123456");
        password.sendKeys(Keys.ENTER);
    }

    //@Test
    public void combineKeyPress(){

        WebElement currAddr = driver.findElement(By.id("currentAddress"));
        WebElement perAddr = driver.findElement(By.id("permanentAddress"));

        Actions actions = new Actions(driver);
        actions.click(currAddr).sendKeys("107-109 PitshangerLane W5 1RH").perform();

        actions.keyDown(currAddr,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(perAddr,Keys.CONTROL).perform();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }
}
