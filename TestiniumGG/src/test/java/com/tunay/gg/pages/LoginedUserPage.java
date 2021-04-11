package com.tunay.gg.pages;


import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginedUserPage extends BasePageUtil {

    public final By btnSearch=By.xpath("//*[@data-cy=\"search-find-button\"]");
    public By searchInputElement = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    public By userName=By.xpath("//*[@class='gekhq4-4 egoSnI']//following::span");

    public void checkUserName()
    {
        Assert.assertEquals("testiniumtestinium232845", driver.findElement(userName).getText());
    }
    public void searchPC()
    {
        driver.findElement(searchInputElement).sendKeys("bilgisayar");
    }
    public  void clickFind()
    {
        clickElement(btnSearch);
    }

}
