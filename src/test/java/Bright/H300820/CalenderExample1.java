package Bright.H300820;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderExample1 {

    public static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.opodo.co.uk/");
        //driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        driver.manage().window().maximize();
    }

    // @Test
    public void expedia() {

        WebElement flightbutton = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
        flightbutton.click();

        WebElement departingbox = driver.findElement(By.id("d1-btn"));
        departingbox.click();

        WebElement Octcalendermonth = driver.findElement(By.xpath("//div[@class='uitk-new-date-picker-desktop-months-container']//div[2]"));
        List<WebElement> alldates = Octcalendermonth.findElements(By.cssSelector(".uitk-new-date-picker-day"));

        System.out.println(Octcalendermonth.isDisplayed());

        for (WebElement alldate : alldates) {
            System.out.println("alldate.getAttribute(data-day)");
            if (alldate.getAttribute("data-day").contains("17")) {
                alldate.click();
            }
        }
    }

    @Test// didn't click on 18, redo for each loop and if block tomrrow

    public void opodo() {

        WebElement flightbutton = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
        flightbutton.click();

        WebElement departingbox = driver.findElement(By.xpath("//div[@class='od-flightsManager-cell']//div[2]//div[1]//div[1]//div[1]//div[3]//span[1]"));
        departingbox.click();

        WebElement Sepcalendermonth = driver.findElement(By.xpath("//body[@id='viewport']/div[@id='flights-root']/div[@id='page']/div[contains(@class,'od-home-main-layout home_main_layout')]/div[contains(@class,'od-body-content body_content')]/section[@id='home']/div[contains(@class,'od-home-wrapper')]/div[contains(@class,'od-home-full-width-content odf-flex-item odf-flex-item-first')]/div[contains(@class,'od-home-content od-home-content-with-warning-top-message')]/div[contains(@class,'od-home-content-search')]/div[@id='flights-manager']/div[contains(@class,'')]/div[@class='od-flightsManager-content']/div[@class='od-flightsManager-main']/div[@class='od-flightsManager-row citysearch_group']/div[@class='od-flightsManager-cell']/div[@class='calendar_container active']/div[@class='od-ui-datepicker-container datepicker hasButton active']/div[@class='od-ui-datepicker-wrapper']/div[@class='od-ui-calendar-wrapper open']/div[@class='od-ui-calendar-body']/div[@class='od-ui-calendar-container']/div[1]/div[2]"));
        List<WebElement> alldates = Sepcalendermonth.findElements(By.cssSelector(".od-ui-calendar-day"));
        System.out.println(Sepcalendermonth.isDisplayed());

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());
            if (alldate.getText().contains("18")) {
                alldate.click();
            }
        }
    }
}