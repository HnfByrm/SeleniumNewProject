package tecproed.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class C03ManageMethods {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
    webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
    maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
    browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
    ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
     */




        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu = "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları = "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));

        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(3000);
        driver.close();

    }
}