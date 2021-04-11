package com.tunay.gg.pages;
import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage extends BasePageUtil {

    public By btnDelete=By.xpath("//a[@class='btn-delete btn-update-item']");
    public By emptyHeader=By.xpath("//div[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']//following::h2");

    public void checktwo(){
        Select select = new Select(driver.findElement(By.xpath("//select")));
        WebElement option = select.getFirstSelectedOption();
        String ItemQ = option.getText();
        Assert.assertEquals("2", ItemQ);
    }
    public void clickdelete(){
        clickElement(btnDelete);
    }

    public void checkEmpty(){
        String emptyText=driver.findElement(emptyHeader).getAttribute("innerText").toString();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.", emptyText);
    }
}
