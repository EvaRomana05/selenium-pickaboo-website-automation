package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.RegistrationPageObject;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationPage_01 extends DriverSetUp {

    public static String baseUrl = "https://www.pickaboo.com/";

    @Test
    public static void registration() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);
        registrationPageObject.registrationMenu.click(); //using Selenium click button method

        Thread.sleep(2000);

//        registrationPageObject.createConfirmButton.click();

        registrationPageObject.firstName.sendKeys("Karim");
        Thread.sleep(1000);

        registrationPageObject.lastName.sendKeys("Rahman");
        Thread.sleep(1000);

        registrationPageObject.email.sendKeys("abcd@gmail.com");
        Thread.sleep(1000);

        registrationPageObject.password.sendKeys("123456");
        Thread.sleep(1000);

        registrationPageObject.confirmPassword.sendKeys("123456");
        Thread.sleep(20000);

        registrationPageObject.createConfirmButton.click(); //using Selenium click button method
        Thread.sleep(4000);


    }
}
