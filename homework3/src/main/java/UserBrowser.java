import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UserBrowser {

    public static void main(String[] args) {

        Utility.setDriverProps(DriverType.CHROME);
        ChromeOptions options = new ChromeOptions();

        options.addArguments("user-data-dir=C:/Users/Monster/AppData/Local/Google/Chrome/User Data");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.enuygun.com/");
        System.out.println(driver.getTitle());

    }
}
