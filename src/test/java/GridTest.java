import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridTest {

    @Test
    public void gridTest_Chrome() throws MalformedURLException {
        //capabilities objesi olusturmak
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome"); //hangi browseda calisacagi
        cap.setCapability("platformName", "Windows 11"); //hangi isletim sisteminde calisacagi

        //driver objemizi RemoteDriver olarak olusturmak

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);

        //URL, Selenium Grid Hub' in bulundugu adresi temsil eder
        //Bu adresten Hub' a baglanarak testleri dagitacak ve calistiracak bir RemoteWebDriver olusturulur

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/");
        String actualTitle = driver.getTitle();
        String expectedString ="bilgisayar";

        Assert.assertTrue(actualTitle.contains(expectedString));
        //driver.quit();
    }
    @Test
    public void gridTest_FireFox() throws MalformedURLException {
        //capabilities objesi olusturmak
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","firefox"); //hangi browseda calisacagi
        cap.setCapability("platformName","Windows 11"); //hangi isletim sisteminde calisacagi
        //driver objemizi RemoteDriver olarak olusturmak

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);

        //URL, Selenium Grid Hub' in bulundugu adresi temsil eder
        //Bu adresten Hub' a baglanarak testleri dagitacak ve calistiracak bir RemoteWebDriver olusturulur

        //ben sanal olarak olusturdugum driver i kullancagim,
        //o makinanin url ini girecegim,herkes kendininkini yapistirsin..herkesin ki farkli
        //localimde hangi driver i kullancaksam tanimli olanlardan onu belirtem gerek, EdgeOptions,FireFoxOptions..
        //yukadaki bu kod satiri ile ; driver olarak git, localde tanimli UrI icindeki chromeDriver kullan,
        //bu da zaten sanal olarak localde mevcut, yani local de olusturdugum browserları remote da kullaniyorum
        //bu asamadan sonra test mantigi ayni..sadece driver i tanimlarken farkli..

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/");
        String actualTitle = driver.getTitle();
        String expectedString ="bilgisayar";

        Assert.assertTrue(actualTitle.contains(expectedString));
        //driver.quit();
    }

    @Test
    public void gridTest_Edge() throws MalformedURLException {
        //capabilities objesi olusturmak
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","MicrosoftEdge"); //hangi browseda calisacagi
        cap.setCapability("platformName","Windows 11"); //hangi isletim sisteminde calisacagi


        //driver objemizi RemoteDriver olarak olusturmak
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);

        //URL, Selenium Grid Hub' in bulundugu adresi temsil eder
        //Bu adresten Hub' a baglanarak testleri dagitacak ve calistiracak bir RemoteWebDriver olusturulur

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com.tr/");
        String actualTitle = driver.getTitle();
        String expectedString ="bilgisayar";

        Assert.assertTrue(actualTitle.contains(expectedString));
        //driver.quit();
    }
}
