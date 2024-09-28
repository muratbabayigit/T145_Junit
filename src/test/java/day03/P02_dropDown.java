package day03;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class P02_dropDown {
    // https://the-internet.herokuapp.com/dropdown adresine gidin.
    // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 4.Tüm dropdown değerleri(value) yazdırın
    // 5.Dropdown'un boyutunun 3 olduğunu test edin
    static WebDriver driver;


    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
    @BeforeEach
    public void beforeTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

    }

    @AfterEach
    public void afterTest(){
        System.out.println("Test Tamamlandı");
    }

    @Test
    public void test01(){
        WebElement dropDownMenu= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDownMenu);

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());


        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

    }
}
