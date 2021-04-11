package com.tunay.gg.tests;

import com.tunay.gg.pages.SearchItemPage;
import com.tunay.gg.pages.SelectedItemPage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;

public class SeletedItemTest extends BasePageUtil {

    private SelectedItemPage SelectedItemPage;
    public SeletedItemTest() {
        this.SelectedItemPage = new SelectedItemPage();
    }

    @And("^Seçilen ürün sepete eklenir\\.$")
    public void seçilenÜrünSepeteEklenir() {
        SelectedItemPage.addPCtoBasket();
    }

    @And("^Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır\\.$")
    public void ürünSayfasındakiFiyatIleSepetteYerAlanÜrünFiyatınınDoğruluğuKarşılaştırılır() { SelectedItemPage.getTwoPriceAndCompare(); }

    @And("^Adet arttırılır$")
    public void adetArttırılır() {
        SelectedItemPage.oneMore();
    }

    @And("^Sepete Gidilir$")
    public void sepeteGidilir() {
        SelectedItemPage.goBasket();
    }
}
