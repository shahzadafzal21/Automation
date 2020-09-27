package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListofElements {

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
    public void ArgosRadioButton() {
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-4132xt-5.gywEET"));


        for (WebElement radiobutton : radiobuttons) {

            System.out.println(radiobutton.getAttribute("id"));

            if (radiobutton.getAttribute("id").contains("4 or more-label")) {
                radiobutton.click();
            }
        }
    }


@Test
        public void ArgosCheckBoxList() throws InterruptedException {
            List<WebElement> checkboxes =driver.findElements(By.cssSelector(".Checkboxstyles__Label-e3lxpy-4.hWEwsp.font-standard"));

            for (WebElement checkbox : checkboxes){
                System.out.println(checkbox.getAttribute("id"));


                if(checkbox.getAttribute("id").contains("filter-price-£15 - £20-label")){
                    Thread.sleep(5000);
                    checkbox.click();
                }
            }

        }
}


