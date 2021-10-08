package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends PageObject{

    @FindBy(xpath = "//div[contains(text(),'The account sign-in was incorrect or your account ')]")
    public WebElement errorMessage;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='send2']")
    public WebElement loginButton;

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }
}
