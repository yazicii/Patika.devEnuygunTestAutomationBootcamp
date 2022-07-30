import org.openqa.selenium.chrome.ChromeOptions;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utility {

    public static ChromeOptions setChromeOptions(String[] arguments) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(arguments);
        return options;
    }

    public static void setDriverProps(Enum driverType) {
        Path resourcesDirectory = Paths.get("src", "main", "resources");
        String absolutePath = resourcesDirectory.toFile().getAbsolutePath();

        if (driverType.equals(DriverType.CHROME)) {
            System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");

        }
        if (driverType.equals(DriverType.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", absolutePath + "/binary/geckodriver.exe");

        }
    }

}
