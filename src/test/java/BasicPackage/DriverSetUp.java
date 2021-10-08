package BasicPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class DriverSetUp {

    public static WebDriver driver;

    @BeforeSuite
    public static void setDriver() {
        System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=\"Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)\"");
        driver = new ChromeDriver(options);
    }

    @AfterSuite
    public static void close() {
        driver.close();
    }


}


