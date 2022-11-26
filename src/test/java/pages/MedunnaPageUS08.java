package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPageUS08 {

    public MedunnaPageUS08() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement kullaniciGirisi;

      @FindBy(xpath = "//*[text()='Password']")
    public WebElement passwordSekmesi;


    @FindBy(xpath = "//*[@id='currentPassword']")
    public WebElement currentPassword;

    @FindBy(xpath = "//*[@id='newPassword']")
    public WebElement newPassword;


    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')]")
    public WebElement passwordStrength3;

    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[4]")
    public WebElement passwordStrength4;

    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[5]")
    public WebElement passwordStrength5;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    public WebElement newPasswordConfirmation;

    @FindBy(xpath = "//*[@id=\"password-form\"]/button/span")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[text()='Password changed!']")
    public WebElement passwordChanged;


}