package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPageUS08;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaStepDefUS08 {
    MedunnaPageUS08 medunnaPage=new MedunnaPageUS08();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Kullanici {string} sayfasina gider.US8")
    public void kullaniciSayfasinaGiderUS8(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @When("Kullanici login butonuna tiklarUS8")
    public void kullaniciLoginButonunaTiklarUS8() {
        ReusableMethods.waitFor(2);
ReusableMethods.bulveTikla(medunnaPage.login);
        ReusableMethods.waitFor(3);
        medunnaPage.signIn.click();
    }
    @Then("Gecerli userName girerUS8")
    public void gecerliUserNameGirerUS8() {
        medunnaPage.userName.sendKeys("team19");
        ReusableMethods.waitFor(3);
    }
    @And("Gecerli password girerUS8")
    public void gecerliPasswordGirerUS8() {
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("Team019"+Keys.ENTER).perform();
    }
    @And("Sign in butonuna tiklarUS8")
    public void signInButonunaTiklarUS8() {
    }
    @Then("Kullanici isminin uzerine tiklarUS8")
    public void kullaniciIsmininUzerineTiklarUS8() {
        ReusableMethods.waitFor(2);
        medunnaPage.kullaniciGirisi.click();
    }
    @And("Acilan sekmelerden, password secenegine tiklarUS8")
    public void acilanSekmelerdenPasswordSecenegineTiklarUS8() {
        ReusableMethods.waitFor(3);
        ReusableMethods.bulveTikla(medunnaPage.passwordSekmesi);
    }
    @And("Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8")
    public void kullaniciCurrentPasswordKutucugunaTiklarVeMevcutPasswordunuGirerUS8() {
        ReusableMethods.waitFor(3);
        medunnaPage.currentPassword.click();
        ReusableMethods.getActions().sendKeys("Team019").perform();
    }
    @And("Kullanici New password kutusuna tiklar yedi haneli Kucuk Harf girer kirmizi strangth seviyesini gorurUS8")
    public void kullaniciNewPasswordKutusunaTiklarYediHaneliKucukHarfGirerKirmiziStrangthSeviyesiniGorurUS8() {

        // 7 Haneli  Kucuk Harf girer kirmizi strangth seviyesini gorur
        ReusableMethods.waitFor(1);
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys("ggggggg").perform();

        ReusableMethods.waitFor(1);
        //Strengt Seviyesinin RED COLOR oldugunu gorur
        Assert.assertTrue(medunnaPage.passwordStrength1.isDisplayed());
    }
    @And("Kullanici, New password kutusuna tiklar,yedi haneli bir sifre girer ve daha guclu sifre icin en az bir buyuk harf girerUS8")
    public void kullaniciNewPasswordKutusunaTiklarYediHaneliBirSifreGirerVeDahaGucluSifreIcinEnAzBirBuyukHarfGirerUS8() {

        // 7 Haneli  Kucuk Harf ve icinde bir BUYUK harf girer
        medunnaPage.newPassword.click();
        ReusableMethods.getActions().sendKeys("ggggggG").perform();
    }
    @And("{string} seviyesinin degistigini gorurUS8")
    public void seviyesininDegistiginiGorurUS8(String arg0) {

        //Strengt Seviyesinin ORANGE COLOR oldugunu gorur
        Assert.assertTrue(medunnaPage.passwordStrength2.isDisplayed());
    }
    @And("Kullanici yedi haneli sifre girer, sifre en az bir rakam icermeli ve {string} seviyesinin degistigi gorullurUS8")
    public void kullaniciYediHaneliSifreGirerSifreEnAzBirRakamIcermeliVeSeviyesininDegistigiGorullurUS8(String arg0) {

        // 7 Haneli  Buyuk Harf, Kucuk Harf ve bir Rakam iceren sifre girer
        medunnaPage.newPassword.click();
        ReusableMethods.getActions().sendKeys("gggggG1").perform();
    }
    @And("{string} seviyesinin OrangeColor olarak degistigini gorurUS8")
    public void seviyesininOrangeColorOlarakDegistiginiGorurUS8(String arg0) {

        //Strengt Seviyesinin GREEN COLOR oldugunu gorur
        Assert.assertTrue(medunnaPage.passwordStrength3.isDisplayed());
    }
    @And("Kullanici yedi haneli sifre girer, sifre en az bir ozel karakter icermeli ve {string} seviyesinin degistigi gorullurUS8")
    public void kullaniciYediHaneliSifreGirerSifreEnAzBirOzelKarakterIcermeliVeSeviyesininDegistigiGorullurUS8(String arg0) {

        // 7 Haneli  Buyuk Harf, Kucuk Harf ve bir Ozel Karakter iceren sifre girer
        medunnaPage.newPassword.click();
        ReusableMethods.getActions().sendKeys("gggggG*").perform();
    }
    @And("{string} seviyesinin greenColor olarak degistigini gorurUS8")
    public void seviyesininGreenColorOlarakDegistiginiGorurUS8(String arg0) {

        //Strengt Seviyesinin GREEN COLOR oldugunu gorur
        Assert.assertTrue(medunnaPage.passwordStrength4.isDisplayed());
    }
    @And("Guclu bir paraola icin Kullanici yedi haneli sifre girer, sifre en az bir buyuk harf, bir rakam bir ozel karakter icermeli ve {string} seviyesinin degistigi gorullurUS8")
    public void gucluBirParaolaIcinKullaniciYediHaneliSifreGirerSifreEnAzBirBuyukHarfBirRakamBirOzelKarakterIcermeliVeSeviyesininDegistigiGorullurUS8(String arg0) {

        // 7 Haneli  Buyuk Harf, Kucuk Harf, Rakam ve Ozel Karakter iceren sifre girer
        medunnaPage.newPassword.click();
        ReusableMethods.getActions().sendKeys("ggggG1*").perform();
    }
    @And("{string} seviyesinin fullColor olarak degistigini gorurUS8")
    public void seviyesininFullColorOlarakDegistiginiGorurUS8(String arg0) {

        //Strengt Seviyesinin FULL GREEN COLOR  oldugunu gorur
        Assert.assertTrue(medunnaPage.passwordStrength5.isDisplayed());
    }

    @And("Kullanici yedi haneli yeni sifresini girerUS8")
    public void kullaniciYediHaneliYeniSifresiniGirerUS8() {
        medunnaPage.newPassword.click();
        ReusableMethods.getActions().sendKeys("Team019").perform();
    }

    @And("New password confirmation butonuna tiklar, yeni sifresini tekrar girerUS8")
    public void newPasswordConfirmationButonunaTiklarYeniSifresiniTekrarGirerUS8() {
        ReusableMethods.waitFor(2);
        medunnaPage.newPasswordConfirmation.click();
        ReusableMethods.getActions().sendKeys("Team019").perform();
    }

    @And("Save butonuna tiklar,US8")
    public void saveButonunaTiklarUS8() {
        ReusableMethods.waitFor(1);
        ReusableMethods.bulveTikla(medunnaPage.saveButton);
    }

    @And("Password Changed yazisini gorur,  New password confirmation onaylanir,US8")
    public void passwordChangedYazisiniGorurNewPasswordConfirmationOnaylanirUS8() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunnaPage.passwordChanged.isDisplayed());
    }

    @And("sayfayi kapatirUS8")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }


    @Then("Farkli yetkilendirmeler icin Gecerli  kullanici ismi {string} girer")
    public void farkliYetkilendirmelerIcinGecerliKullaniciIsmiGirer(String farkliUsername) {
        medunnaPage.userName.sendKeys(farkliUsername);
        ReusableMethods.waitFor(3);

    }

    @And("Farkli yetkilendirmeler icin Gecerli sifre  {string} girer")
    public void farkliYetkilendirmelerIcinGecerliSifreGirer(String farkliPassword) {
        ReusableMethods.getActions().sendKeys(Keys.TAB).sendKeys(farkliPassword+Keys.ENTER).perform();
    }
}