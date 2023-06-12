package tecproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Techproeducation sayfasına gidelim

        driver.get("https://techproeducation.com");
        //Sonra Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Amazon sayfasının başlığını yazdıralım
        System.out.println(driver.getTitle());
        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        //Sayfa başlığını yazdıralım
        System.out.println(driver.getTitle());
        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
/*
        //Techproeducation sayfasına gidelim

        driver.navigate().to("https://techproeducation.com");// get() Methodu ile aynı mantıkta çalısır.
    Thread.sleep(3000);
        //Sonra Amazon sayfasına gidelim

        driver.navigate().to("https://amazon.com");

        //Amazon sayfasının başlığını yazdıralım

        System.out.println("Amazon Sayfa Baslıgı :" + driver.getTitle());

        //Techproeducation sayfasına geri dönelim

        driver.navigate().back();

        //Sayfa başlığını yazdıralım

        System.out.println("Tecproeducation Sayfa Basligi : " + driver.getTitle());

        //Amazon sayfasına tekrar gidip url'i yazdıralım

        driver.navigate().forward();

        System.out.println("Amazon Sayfasi Url : " + driver.getCurrentUrl());

        //Amazon sayfasındayken sayfayı yenileyelim

        driver.navigate().refresh();

 */





    }
}
