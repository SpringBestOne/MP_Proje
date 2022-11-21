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
    @FindBy (xpath = "//*[@id='username']")
    public WebElement userNameZ;
    @FindBy (xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement myPagesZ;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointmentsZ;
    @FindBy (xpath = "//*[@id='appointment-heading']")
    public WebElement myAppointmentsPageZ;
    @FindBy (xpath = "//tbody")
    public WebElement myAppointmentTableZ;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[1]")
    public WebElement patientIDZ;

    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[2]")
    public WebElement patientStartDateZ;

    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[3]")
    public WebElement patientEndDateZ;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-sort fa-w-10 '])[4]")
    public WebElement patientStatusZ;





}
