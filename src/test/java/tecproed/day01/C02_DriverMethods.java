package tecproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://amazon.com/");
        System.out.println("Amazon Sayfa Basliği:" +driver.getTitle());
        System.out.println("Amazon Actual Url:" +driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println(amazonWindowHanle);

        driver.get("https://techproeducation.com/");

        System.out.println("Techproeducation Sayfa Basliği:" +driver.getTitle());

        System.out.println("Techproed Actual Url:" +driver.getCurrentUrl());


       // System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());
    }
}
