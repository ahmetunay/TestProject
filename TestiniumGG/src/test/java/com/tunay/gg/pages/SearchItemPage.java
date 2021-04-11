package com.tunay.gg.pages;
import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchItemPage extends BasePageUtil {


    public By secondPElement = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public  By Spc;
    public By selectedSecond=By.xpath("//*[@class=\"current\"]");

    public void clickSecondPage()
    {
        scroolDown();
        clickElement(secondPElement);
    }
    public void clickRandomElement()
    {
        int xd=1 + (int)(Math.random() * 47);
        Spc=By.xpath("//*[@product-index=\""+xd+"\"]");
        clickElement(Spc);
    }

    public void checkPageTwo() {
        String second=driver.findElement(selectedSecond).getAttribute("innerText").toString();
        Assert.assertEquals("2",second );
    }
}
