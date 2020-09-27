package H160820;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Argos {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
         searchbox.sendKeys("Nike");

        WebElement searchbutton = driver.findElement(By.xpath("//span[@class='_1gqeQ']"));
        searchbutton.click();

        WebElement Pricebutton = driver.findElement(By.xpath("//span[@class='Checkboxstyles__LabelValue-e3lxpy-6 fOQrQk'][contains(text(),'£5 - £10')]"));
        Pricebutton.click();

        WebElement AddtoTrolley = driver.findElement(By.xpath("//body/main[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='search']/div[@class='styles__SearchContent-sc-1h5mbdb-2 CfHZq xs-row xs-auto--negative lg-auto--none']/div[@class='styles__Container-sc-1h5mbdb-0 gCgRbH xs-12--none lg-9--none xs-stack']/div[@class='styles__ProductList-sc-1rzb1sn-0 kChnTV']/div[1]/div[2]/button[1]/span[1]/span[1]"));
        AddtoTrolley.click();

        WebElement GotoTrolley = driver.findElement(By.xpath("//a[@class='Buttonstyles__Button-q93iwm-2 dUQXJf']"));
        GotoTrolley.click();
    }
}