package tecproed.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_night {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");


        //Arama kutusunu locate edip iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);


        //Sayfayı kapatalım
        driver.close();







    }



}
