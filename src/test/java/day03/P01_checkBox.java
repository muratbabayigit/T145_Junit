package day03;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class P01_checkBox {

    // https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb adresine gidin
    // Prime Programs kısmındaki ilk 3 checkbox locate edin
    // İki checkbox'ı işaretleyin
    // her checkbox'ında işaretli olduğunu doğrulayın

    static WebDriver driver;
    JavascriptExecutor jse= (JavascriptExecutor)driver;

    @BeforeAll
    public static void setUp2(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public static void tearDown2() throws InterruptedException {
        Thread.sleep(2500);
        //driver.quit();
    }

    @BeforeEach
    public void before1(){
        driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
    }

    @AfterEach
    public void after1(){
        System.out.println("Test Tamamlandı. Kontrol ediniz");
    }

    @Test
    public void test() throws InterruptedException {
        WebElement checkBox1=driver.findElement(By.xpath("//*[@data-testid='filter-accessType-1']"));
        WebElement checkBox2=driver.findElement(By.xpath("//*[@data-testid='filter-accessType-2']"));

        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox2.isSelected()){
            checkBox2.click();

        }
        Thread.sleep(3000);


        //jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", checkBox2);

        assertTrue(checkBox1.isSelected() && checkBox2.isSelected());

    }
}
