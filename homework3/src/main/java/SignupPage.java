import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SignupPage extends DriverSetup{

    public SignupPage(List<WebDriver> driverList){
        super(driverList);
    }

    public void openSignup(){
        this.chromeDriver.findElement(By.id("ctx-RegisterBtn")).click();
        this.firefoxDriver.findElement(By.id("ctx-RegisterBtn")).click();
    }
}
