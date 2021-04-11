package com.tunay.gg.pages;


import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePageUtil{

    public By emailElement = By.id("L-UserNameField");
    public By passwordElement = By.id("L-PasswordField");
    public By loginBtnElement = By.id("gg-login-enter");


    public void writeEmail() { driver.findElement(emailElement).sendKeys("testiniumtestinium232845"); }

    public void writePass()
    {
        driver.findElement(passwordElement).sendKeys("Gg123456789");
    }

    public void clickLoginFormBtn() { clickElement(loginBtnElement); }
}
