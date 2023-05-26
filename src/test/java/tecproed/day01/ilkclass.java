package tecproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkclass {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.techproeducation.com/");
    }
}
