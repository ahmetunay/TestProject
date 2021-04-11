package com.tunay.gg.tests;

import com.tunay.gg.pages.LoginedUserPage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginedUserTest extends BasePageUtil{

    private LoginedUserPage UserPage;
    public LoginedUserTest() {
        this.UserPage = new LoginedUserPage();
    }

    @Then("^Giriş yapmış kullanıcı için ana ekran kontrol edilir$")
    public void girişYapmışKullanıcıIçinAnaEkranKontrolEdilir() {
        UserPage.checkUserName();
    }

    @And("^Arama kutucuğuna bilgisayar kelimesi girilir$")
    public void aramaKutucuğunaBilgisayarKelimesiGirilir() {
        UserPage.searchPC();
    }

    @And("^Bul butonuna tıklanır$")
    public void bulButonunaTıklanır() {
        UserPage.clickFind();
    }
}
