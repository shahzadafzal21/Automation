package H230820;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework1 {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void letskodeit() {
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));


        for (WebElement radiobutton : radiobuttons) {

            System.out.println(radiobutton.getAttribute("id"));

            if (radiobutton.getAttribute("id").contains("benzradio")) {
                radiobutton.click();
            }
        }
    }

   // @Test
    public void letscodeit() {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));


        for (WebElement checkbox : checkboxes) {

            System.out.println(checkbox.getAttribute("id"));

            if (checkbox.getAttribute("id").contains("benzcheck")) {
                checkbox.click();

            }
        }
    }
}//


