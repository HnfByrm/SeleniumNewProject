package tecproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasına gidelim
        //Sayfa başlığının Amazon içerdiğini test edelim
        //Url'in https://www.amazon.com olduğunu test edelim
        //Sayfayı kapatalım

        driver.get("https://amazon.com/");

        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon";

        if(actualTitle.contains(expectedTitle)){

            System.out.println("Test PASSED");
        }else {

            System.out.println("Test FAILED");

        }

          String actualUrl=  driver.getCurrentUrl();

          String expectedUrl="https://amazon.com/";
          if(actualUrl.equals(expectedUrl)){

              System.out.println("Test PASSED");
          }else{

              System.out.println("Test FAILED");
          }

          driver.close();
        }
    }

