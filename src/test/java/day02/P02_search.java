package day02;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_search {
    static WebDriver driver;
    WebElement searchbox;
    WebElement tools;
    String result;
    String film;



    /*
        BeforeAll ile driver'i oluşturun ve class icinde static yapin
        Maximize edin ve 10 sn bekletin
        her biri için https://www.babayigit.net/test adresine gidin
        1-arama kutusuna "12 Angry Men” yazip, cikan sonuc sayisini yazdirin
        2-arama kutusuna "Vizontele” yazip, cikan sonuc sayisini yazdirin
        3-arama kutusuna "Saving Private Ryan” yazip, cikan sonuc sayisini yazdirin
        AfterAll ile kapatin.
     */

    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterAll
    public static void tearDown(){ driver.quit(); }


    @BeforeEach
    public void searchSite(){
        driver.get("https://www.babayigit.net/test");
        searchbox= driver.findElement(By.id("search"));
    }

    @AfterEach
    public void searchResult(){
       tools= driver.findElement(By.id("hdtb-tls"));
       tools.click();
       result= driver.findElement(By.id("result-stats")).getText();
        System.out.println("Aradığınız "+film+" ile ilgili yapılan aramada "+result+" sonuç bulundu");
    }

    @Test
    public void search01(){
        film="12 Angry Men";
        searchbox.sendKeys(film+ Keys.ENTER);
    }
    @Test
    public void search02(){
        film="Vizontele";
        searchbox.sendKeys(film+ Keys.ENTER);
    }
    @Test
    public void search03(){
        film="Saving Private Ryan";
        searchbox.sendKeys(film+ Keys.ENTER);
    }
    @Test
    public void search04(){
        film="Esaretin Bedeli";
        searchbox.sendKeys(film+ Keys.ENTER);
    }
    }


