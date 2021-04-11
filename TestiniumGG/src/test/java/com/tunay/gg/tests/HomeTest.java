package com.tunay.gg.tests;

import com.tunay.gg.pages.HomePage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class HomeTest extends BasePageUtil {

    private HomePage homePage;
    public HomeTest() {
        this.homePage = new HomePage();
    }


    @And("^Tarayıcı çalıştırılır$")
    public void tarayıcıÇalıştırılır() {
        System.out.println("Tarayıcı Çalıştı");
    }

    @Then("^Web Sitesi Başlığı kontrol edilir$")
    public void webSitesiBaşlığıKontrolEdilir() { Assert.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi",driver.getTitle()); }

    @And("^Login Butonu üstünde durulur$")
    public void loginButonuÜstündeDurulur() {
        homePage.iconwait();
    }

    @Then("^Login Button Tıklanır$")
    public void loginButtonTıklanır() {
        homePage.clickLogin();
    }

    @When("^Login Sayfanın Yüklenmesi beklenir$")
    public void loginSayfanınYüklenmesiBeklenir() {
        homePage.waitForDocumentLoad(homePage.driver);
    }









}
