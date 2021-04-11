package com.tunay.gg.util;

import com.tunay.gg.logger.Log;
import com.tunay.gg.tests.BaseTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageUtil {

    public WebDriver driver = BaseTest.getDriver();
    private int defaultWait = BaseTest.getDefaultWait();

    protected void clickElement(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        wait.until(ExpectedConditions.elementToBeClickable(selector)).click();
    }

    protected void clickElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected List<WebElement> findElements(By selector)
    {
        return driver.findElements(selector);
    }

    protected void mouseOver(By we){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(we)).build().perform();
    }

    protected void forceWait(int millisecond) throws InterruptedException {
        Thread.sleep(millisecond);
    }

    protected void waitElementInvisibility(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(selector));
    }

    protected void waitElementVisibility(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    protected void sendKeys(By selector, String text) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector)).sendKeys(text);
    }

    protected void scrollTo(int x, int y){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollTo([0],[1])", x,y);
    }

    protected void clickForcefully(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    protected String getText(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, defaultWait);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(selector)).getText();
    }

    protected boolean isElementDisplayed(By selector) {
        try {
            return driver.findElement(selector).isDisplayed();
        }catch (WebDriverException e){
            return false;
        }
    }

    protected boolean checkImageDisplayed(WebElement element){
        return (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", element);
    }

    protected void sendKeys(Keys key){
        Actions action = new Actions(driver);
        action.sendKeys(key).perform();
    }
    public  void waitForDocumentLoad(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return  document.readyState").equals("complete");}});
    }
    public void scroolDown()
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
