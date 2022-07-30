import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPage extends DriverSetup {

    public LoginPage(List<WebDriver> driverList) {
        super(driverList);
    }

    public void openLoginPage() {
        this.chromeDriver.findElement(By.id("ctx-LoginBtn")).click();
        this.firefoxDriver.findElement(By.id("ctx-LoginBtn")).click();
    }
}
