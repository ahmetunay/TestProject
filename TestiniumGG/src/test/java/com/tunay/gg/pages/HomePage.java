package com.tunay.gg.pages;

import com.tunay.gg.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePageUtil {

        public final By iconuser= By.xpath("//*[@data-cy=\"header-user-menu\"]");
        public final By btnLogin= By.xpath("//*[@data-cy=\"header-login-button\"]");

        public void iconwait()
        {
            mouseOver(iconuser);
        }
        public void clickLogin()
        {
            clickElement(btnLogin);
        }
}
