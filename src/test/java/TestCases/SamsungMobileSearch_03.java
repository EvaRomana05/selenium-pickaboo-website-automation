package TestCases;

import BasicPackage.DriverSetUp;
import PageObject.SamsungMobileSearchPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SamsungMobileSearch_03 extends DriverSetUp {

    public static String baseUrl = "https://www.pickaboo.com/";

    @Test
    public static void samsung() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        SamsungMobileSearchPageObject aSamsungMobileSearchPageObject = new SamsungMobileSearchPageObject(driver);

        aSamsungMobileSearchPageObject.search.sendKeys("samsung");
        Thread.sleep(1000);

        aSamsungMobileSearchPageObject.searchBUtton.click();
        Thread.sleep(2000);

        aSamsungMobileSearchPageObject.product1.click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-color-92-item-10781']")));

        aSamsungMobileSearchPageObject.blackColor.click();
        Thread.sleep(2000);

        aSamsungMobileSearchPageObject.whiteColor.click();
        Thread.sleep(2000);

        aSamsungMobileSearchPageObject.productQuantity.click();
        aSamsungMobileSearchPageObject.productQuantity.click();
        Thread.sleep(2000);

        aSamsungMobileSearchPageObject.addToCart.click();
        Thread.sleep(2000);

//

    }
}
