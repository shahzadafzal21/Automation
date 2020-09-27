package H230820;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework2 {

    public static WebDriver driver;

    @Before

    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike");
        driver.manage().window().maximize();

    }

    @Test
    public void argos() {
        List<WebElement> textbox = driver.findElements(By.xpath("//div[@class='styles__ResultsCount-sc-1hkcas-5 daCyrX md-4 lg-6 xs-hidden md-block']"));


        for (WebElement textboxbutton : textbox) {

            System.out.println(textboxbutton.getText());

            if (textboxbutton.getText().contains("Showing 1 - 30 of 62 products")) {
                textboxbutton.click();
            }
        }

    }
}