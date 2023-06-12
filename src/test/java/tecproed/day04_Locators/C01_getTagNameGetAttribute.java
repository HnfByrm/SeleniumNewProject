package tecproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagNameGetAttribute {


    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");
        // aramakutusunu locate ediniz ve Nutella aratınız

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));


        // arama kutusunun tagName'inin "input" oldugunu test edin
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";

        if(actualTagName.equals(expectedTagName)){

            System.out.println("Test PASSED");
        }else{

            System.out.println("Test FAILED");
        }


        // arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin

       String actualAttribute= aramaKutusu.getAttribute("name");
        String expectedAttribute="field-keywords";

        if(actualAttribute.equals(expectedAttribute)){

            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }



        // sayfayı kapatın
        driver.close();



    }
}