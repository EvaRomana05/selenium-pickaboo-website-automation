package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamsungMobileSearchPageObject extends PageObject {

    @FindBy(xpath = "//input[@id='search']")
    public WebElement search;

    @FindBy(xpath = "//button[@title='Search']")
    public WebElement searchBUtton;

    @FindBy(xpath = "//a[@href='https://www.pickaboo.com/samsung-galaxy-a52s-5g-8gb-128gb.html']")
    public WebElement product1;

    @FindBy(xpath = "//div[@id='option-label-color-92-item-10781']")
    public WebElement blackColor;

    @FindBy(xpath = "//div[@id='option-label-color-92-item-683']")
    public WebElement whiteColor;


    @FindBy(xpath = "//button[@title='Increase the quantity']")
    public WebElement productQuantity;

    @FindBy(xpath = "//button[@title='Add to Cart']")
    public WebElement addToCart;


    public SamsungMobileSearchPageObject(WebDriver driver) {
        super(driver);
    }
}
