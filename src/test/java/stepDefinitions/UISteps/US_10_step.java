package stepDefinitions.UISteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_10_step {

    MedunnaPage medunnaPage=new MedunnaPage();

    @Given("Kullanıcı {string} sayfasına gider.")
    public void kullanıcıSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanıcı login butonuna tıklar")
    public void kullanıcıLoginButonunaTıklar() {
        medunnaPage.loginZ.click();
        medunnaPage.signInZ.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Geçerli userName girer \\(doktor)")
    public void geçerliUserNameGirerDoktor() {
        medunnaPage.userNameZ.sendKeys("Dr.Zeynep");
        ReusableMethods.waitFor(3);
    }

    @And("Geçerli password girer")
    public void geçerliPasswordGirer() {
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("06Zeynep06&", Keys.ENTER).perform();
    }

    @And("Sign in butonuna tıklar")
    public void signInButonunaTıklar() {
        //bu code bölümü bi öncekinde yapıldı
        ReusableMethods.waitFor(3);

    }

    @And("MyPages butonuna tıklar")
    public void mypagesButonunaTıklar() {
        medunnaPage.myPagesZ.click();
        ReusableMethods.waitFor(2);
    }

    @And("Ana sayfada My Appointments butonuna tıklar.")
    public void anaSayfadaMyAppointmentsButonunaTıklar() {
        medunnaPage.myAppointmentsZ.click();
        ReusableMethods.waitFor(3);

    }

    @And("Doktor My Appointments sayfasında oldugunu doğrular")
    public void doktorMyAppointmentsSayfasındaOldugunuDoğrular() {
       Assert.assertTrue(medunnaPage.myAppointmentsPageZ.isDisplayed());
    }

    @And("Doktor randevu listesini görür")
    public void doktorRandevuListesiniGörür() {
        Assert.assertTrue(medunnaPage.myAppointmentTableZ.isDisplayed());
    }

    @And("Doktor randevu başlangıç ve bitiş tarihlerini görür")
    public void doktorRandevuBaşlangıçVeBitişTarihleriniGörür() throws IOException {
        ReusableMethods.getScreenshot("medunnaPatientAppointmentPage");
    }

    @Then("Doktor patient Id görünür olduğunu doğrular")
    public void doktorPatientIdGörünürOlduğunuDoğrular() {
        Assert.assertTrue(medunnaPage.patientIDZ.isDisplayed());
    }

    @And("Doktor Start date time bilgisinin görünür olduğunu doğrular")
    public void doktorStartDateTimeBilgisininGörünürOlduğunuDoğrular() {
        Assert.assertTrue(medunnaPage.patientStartDateZ.isDisplayed());
    }

    @And("Doktor end date time bilgisinin görünür olduğunu doğrular")
    public void doktorEndDateTimeBilgisininGörünürOlduğunuDoğrular() {
        Assert.assertTrue(medunnaPage.patientEndDateZ.isDisplayed());
    }

    @And("Doktor status bilgisinin görünür olduğunu doğrular")
    public void doktorStatusBilgisininGrünürOlduğunuDoğrular() {
        Assert.assertTrue(medunnaPage.patientStatusZ.isDisplayed());
    }
    @And("Sayfayı kapatır")
    public void sayfayıKapatır() {
        Driver.closeDriver();
    }
}
