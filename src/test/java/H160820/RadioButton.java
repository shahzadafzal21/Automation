package H160820;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class RadioButton {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://letskodeit.teachable.com/p/practice");
        driver.manage().window().maximize();

        WebElement radiobutton = driver.findElement(By.xpath("//div[contains(@class,'left-align')]//label[1]//input[1]"));
        radiobutton.click();
        System.out.println(radiobutton.isSelected());

        WebElement radiobuttonbenz = driver.findElement(By.id("benzradio"));
        radiobuttonbenz.click();
        System.out.println(radiobuttonbenz.isSelected());

        WebElement radiobuttonhonda = driver.findElement(By.id("hondaradio"));
        radiobuttonhonda.click();
        System.out.println(radiobuttonhonda.isSelected());

    }
}// end of class