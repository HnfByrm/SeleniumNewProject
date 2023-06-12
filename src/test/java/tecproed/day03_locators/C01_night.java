package tecproed.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_night {

    /*
        Bir webelementin locate'ini birden fazla kullanacaksaniz bir Webelement'te değişken olarak atayabilirsiniz.
        Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz
        1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
        2-webelemente tıklayacaksak click() methodu kullanırız
        3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
        4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
         */




    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));


        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

         //Arama kutusunu locate edelim
        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusuna iphone yazdıralım ve aratalım
        arama.sendKeys("iphone");
        arama.submit();

        Thread.sleep(2000);

    //Sayfayı kapatalım

        driver.close();




    }
}
