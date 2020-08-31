package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayedOrnek {
    /*
titleTest => Sayfa başlığının "Best" içerdiğini(contains) doğrulayın

mexicoLinkTest => Linkin görüntülenip görüntülenmediğini doğrulayın
 */

    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
    }
    @Before
     public void beforeMethod() {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http:/www.bestbuy.com");
     }
     @After
     public void afterMethod() {
         driver.quit();

         // titleTest => Sayfa başlığının "Best" içerdiğini(contains) doğrulayın
     }
     @Test
    public void titleTest() {
        String sayfaBasligi = driver.getTitle();
        boolean bestKelimesiniIceriyorMu = sayfaBasligi.contains("Best");//true ya da false

         Assert.assertTrue(bestKelimesiniIceriyorMu);

         // logoTest => BestBuy logosunun görüntülenip görüntülenmediğini doğrulayın
     }
     @Test
    public void logoTest() {
         WebElement logo = driver.findElement(By.className("logo"));
                                            //By.xpath("img[@class='logo']);
         boolean logoGorunuyorMu = logo.isDisplayed();//true false
         Assert.assertTrue(logoGorunuyorMu);

         // mexicoLinkTest => Linkin görüntülenip görüntülenmediğini doğrulayın
     }
     @Test
    public void mexicoLinkTest() {
        WebElement mexicoLinki = driver.findElement(By.partialLinkText("Mexico"));
         boolean linkGorunuyorMu = mexicoLinki.isDisplayed();
         Assert.assertTrue(linkGorunuyorMu);
     }


    }

