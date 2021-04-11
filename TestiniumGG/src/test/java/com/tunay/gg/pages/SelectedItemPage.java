package com.tunay.gg.pages;

import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedItemPage extends BasePageUtil {


    public By btnSepeteAt =By.id("add-to-basket");
    public By productPrice=By.id("sp-price-lowPrice");
    public By basketIcon=By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]");

    String productP;
    String basketP;


    public void addPCtoBasket() { clickElement(btnSepeteAt); }

    public void getTwoPriceAndCompare()
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/10)");

        productP=driver.findElement(productPrice).getAttribute("innerText").toString();

        mouseOver(basketIcon);
        mouseOver(basketIcon);

        basketP = driver.findElement(By.xpath("//p[@class='product-price']/span[@class='product-new-price']")).getAttribute("innerText").toString();

        System.out.println("Product Price"+productP);
        System.out.println("Basket Price"+basketP);

        Assert.assertEquals(productP, basketP);

        driver.navigate().refresh();;
    }

    public void oneMore() { addPCtoBasket(); }

    public void goBasket(){ clickElement(basketIcon); }
}
