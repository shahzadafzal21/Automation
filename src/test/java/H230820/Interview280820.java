package H230820;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Interview280820 {

    public static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();

    }

    @Test

    public void argos() {

        List<WebElement> checkboxbuttons = driver.findElements(By.cssSelector(".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk"));

        for (WebElement checkboxbutton : checkboxbuttons) {

            System.out.println(checkboxbutton.getText());

            if (checkboxbutton.getText().contains("Smartwatch")) {

                checkboxbutton.click();

            }

        }
    }
}












