package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10_step {

    MedunnaPage medunnaPage=new MedunnaPage();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Kullanıcı {string} sayfasına gider.")
    public void kullanıcıSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanıcı login butonuna tıklar")
    public void kullanıcıLoginButonunaTıklar() {
        medunnaPage.loginZ.click();
        medunnaPage.signInZ.click();
    }

    @Then("Geçerli userName girer \\(doktor)")
    public void geçerliUserNameGirerDoktor() {

    }

    @And("Geçerli password girer")
    public void geçerliPasswordGirer() {
    }

    @And("Sign in butonuna tıklar")
    public void signInButonunaTıklar() {
    }

    @And("Ana sayfada My Appointments butonuna tıklar.")
    public void anaSayfadaMyAppointmentsButonunaTıklar() {
    }

    @Then("Ana sayfada My Appointments butonunun görünür olduğunu doğrular")
    public void anaSayfadaMyAppointmentsButonununGörünürOlduğunuDoğrular() {
    }

    @And("Doktor My Appointments sayfasında oldugunu doğrular")
    public void doktorMyAppointmentsSayfasındaOldugunuDoğrular() {
    }

    @And("Doktor randevu listesini görür")
    public void doktorRandevuListesiniGörür() {
    }

    @And("Doktor randevu başlangıç ve bitiş tarihlerini görür")
    public void doktorRandevuBaşlangıçVeBitişTarihleriniGörür() {
    }

    @Then("Doktor patient Id görünür olduğunu doğrular")
    public void doktorPatientIdGörünürOlduğunuDoğrular() {
    }

    @And("Doktor Start date time bilgisinin görünür olduğunu doğrular")
    public void doktorStartDateTimeBilgisininGörünürOlduğunuDoğrular() {
    }

    @And("Doktor end date time bilgisinin görünür olduğunu doğrular")
    public void doktorEndDateTimeBilgisininGörünürOlduğunuDoğrular() {
    }

    @And("Doktor status bilgisinin grünür olduğunu doğrular")
    public void doktorStatusBilgisininGrünürOlduğunuDoğrular() {
    }
}
