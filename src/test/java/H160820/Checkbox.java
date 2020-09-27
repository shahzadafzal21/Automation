package H160820;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();

        WebElement BMWcheckbox = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
        BMWcheckbox.click();

        Thread.sleep(2000);

        WebElement Benzcheckbox = driver.findElement(By.xpath("//input[@id='benzcheck']"));
        Benzcheckbox.click();

        Thread.sleep(2000);

        WebElement Hondacheckbox = driver.findElement(By.xpath("//input[@id='hondacheck']"));
        Hondacheckbox.click();

    }
}// end of class

