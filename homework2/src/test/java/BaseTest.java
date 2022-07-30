import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();                             //chrome driver'ı tanımlatarak chrome wep tarayıcısına ulaşırız.
        driver = new ChromeDriver();
        driver.manage().window().maximize();                                 //açılan pencereyi tam ekran yapar.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));   //sayfanın açılması için maximum 15 saniye bekler.

    }
    @AfterClass
    public static void tearDown() {
        driver.quit();                                                        //driver'ı kapatır.
    }
}
