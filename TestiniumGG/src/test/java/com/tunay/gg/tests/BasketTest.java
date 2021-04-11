package com.tunay.gg.tests;


import com.tunay.gg.pages.BasketPage;
import com.tunay.gg.pages.SearchItemPage;
import com.tunay.gg.pages.SelectedItemPage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;

public class BasketTest extends BasePageUtil {
    private BasketPage basketPage;
    public BasketTest() {
        this.basketPage = new BasketPage();
    }

    @And("^İki adet Ürün olduğu kontrol edilir\\.$")
    public void i̇kiAdetÜrünOlduğuKontrolEdilir() {
        basketPage.checktwo();
    }

    @And("^Ürün sepetten silinerek sepetin boş olduğu kontrol edilir\\.$")
    public void ürünSepettenSilinerekSepetinBoşOlduğuKontrolEdilir() {
        basketPage.clickdelete();
        basketPage.checkEmpty();
    }
}
