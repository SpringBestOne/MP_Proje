package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {

    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginZ;

    @FindBy (xpath = "//*[text()='Sign in']")
    public WebElement signInZ;

















}
