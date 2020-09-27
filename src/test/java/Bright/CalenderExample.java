package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderExample {
    public static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        //driver.get("https://www.esky.co.uk/");
        driver.manage().window().maximize();
    }

    //@Test
    public void southallTravel() {

        WebElement departingdatebox = driver.findElement(By.id("depdateit"));
        departingdatebox.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText());

            if (date.getText().contains("17")) {
                date.click();
            }
        }
    }

    //@Test
    public void esky() {

        WebElement departingfield = driver.findElement(By.id("departureDateRoundtrip0"));
        departingfield.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText());

            if (date.getText().contains("24")) {
                date.click();

            }
        }
    }

    @Test
    public void expedia(){

        WebElement flightbutton = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
        flightbutton.click();

        WebElement departingbox = driver.findElement(By.id("d1-btn"));
        departingbox.click();

        WebElement Sepcalendermonth = driver.findElement(By.xpath("//div[contains(@class,'uitk-calendar')]//div[1]//table[1]"));

        List<WebElement> alldates = Sepcalendermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        System.out.println(Sepcalendermonth.isDisplayed());

        for (WebElement alldate : alldates){
            System.out.println(alldate.getAttribute("data-day"));
            if (alldate.getAttribute("data-day").contains("17")){
                alldate.click();
        }
    }

}
}