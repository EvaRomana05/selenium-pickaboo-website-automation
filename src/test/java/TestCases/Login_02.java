package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.LoginPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login_02 extends DriverSetUp {

    public static String baseUrl = "https://www.pickaboo.com/customer/account/login/";

    @Test(priority = 1)
    public static void loginWithErrorMessage() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        LoginPageObject aLoginPageObject = new LoginPageObject(driver);
        Thread.sleep(2000);

        aLoginPageObject.email.sendKeys("abcd@gmail.com");
        Thread.sleep(1000);

        aLoginPageObject.password.sendKeys("123456");
        Thread.sleep(2000);

        aLoginPageObject.loginButton.click(); //using Selenium click button method
        // Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String errorMessae = aLoginPageObject.errorMessage.getText();
        Assert.assertEquals(errorMessae, "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");

    }

    @Test(priority = 2)
    public static void loginWithSuccess() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        LoginPageObject aLoginPageObject = new LoginPageObject(driver);
        Thread.sleep(2000);

        aLoginPageObject.email.sendKeys("evaromana05@gmail.com");
        Thread.sleep(1000);

        aLoginPageObject.password.sendKeys("01020505");
        Thread.sleep(2000);

        aLoginPageObject.loginButton.click(); //using Selenium click button method
        // Thread.sleep(4000);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(currentUrl, "https://www.pickaboo.com/customer/account/");

    }

}