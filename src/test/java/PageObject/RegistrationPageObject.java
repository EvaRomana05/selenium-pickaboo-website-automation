package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObject extends PageObject{

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    public WebElement registrationMenu;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@title='Create an Account']")
    public WebElement createConfirmButton;

    public RegistrationPageObject(WebDriver driver) {
        super(driver);
    }


}
