import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class DriverSetup extends Utility{
    WebDriver firefoxDriver;
    WebDriver chromeDriver;
    List<WebDriver> driverSetupList;
    DriverSetup driverSetup;
    SignupPage signupPage;
    LoginPage loginPage;


    public DriverSetup() {
        try {
            String[] args = {"start-maximized"};
            Utility.setDriverProps(DriverType.CHROME);
            Utility.setDriverProps(DriverType.FIREFOX);

            this.chromeDriver = new ChromeDriver(Utility.setChromeOptions(args));
            this.firefoxDriver = new FirefoxDriver();
        } catch (IllegalStateException e){
            System.out.println("Driver'ı yükler misiniz?");
        }

    }
    //Tekrar kod yazılmasını önlemek için DriverSetup sınıfından metodu oluşturuldu.
    public void setDriverSetup() {
        driverSetup = new DriverSetup();
        driverSetupList = new ArrayList<>();
        driverSetupList.add(driverSetup.chromeDriver);
        driverSetupList.add(driverSetup.firefoxDriver);

    }

    public DriverSetup(List<WebDriver> driverList) {
        this.chromeDriver = driverList.get(0);
        this.firefoxDriver = driverList.get(1);
    }

    public void open(String url) {

        this.firefoxDriver.get(url);
        this.chromeDriver.get(url);

    }
    //Metodu DriverSetup sayfasına çekerek tekrar kullanımlarda checkOpenWebV2 metodunu çağırarak tekrar tekrar yazmayız.
    public void checkOpenWebV2() {
        driverSetup.open("https://www.enuygun.com/");
        String openedWebApp = driverSetup.chromeDriver.getCurrentUrl();
        if (openedWebApp.equals("https://www.enuygun.com/")) {
            System.out.println("passed for chrome");
        }

        openedWebApp = driverSetup.firefoxDriver.getCurrentUrl();
        if (openedWebApp.equals("https://www.enuygun.com/")) {
            System.out.println("passed for firefox");
        }
    }

}
