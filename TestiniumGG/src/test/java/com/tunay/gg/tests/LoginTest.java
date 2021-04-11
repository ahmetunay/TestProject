package com.tunay.gg.tests;

import com.tunay.gg.pages.LoginPage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;

public class LoginTest extends BasePageUtil  {

    private LoginPage loginPage;
    public LoginTest() {
        this.loginPage = new LoginPage();
    }

    @And("^Login Sayfasındaki eposta alanı doldurulur$")
    public void loginSayfasındakiEpostaAlanıDoldurulur() {
        loginPage.writeEmail();
    }

    @And("^Login Sayfasındaki şifre alanı doldurulur$")
    public void loginSayfasındakiŞifreAlanıDoldurulur() {
        loginPage.writePass();
    }

    @And("^Login Sayfasındaki giriş yap butonuna tıklanır$")
    public void loginSayfasındakiGirişYapButonunaTıklanır() {
        loginPage.clickLoginFormBtn();
    }
}
