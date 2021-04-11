package com.tunay.gg.tests;

import com.tunay.gg.pages.SearchItemPage;
import com.tunay.gg.util.BasePageUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchItemTest extends BasePageUtil {

    private SearchItemPage SItemPage;
    public SearchItemTest() {
        this.SItemPage = new SearchItemPage();
    }

    @And("^Arama  sonuclarısayfası açılır\\.$")
    public void aramaSonuclarısayfasıAçılır() {
        SItemPage.waitForDocumentLoad(SItemPage.driver);
    }

    @Then("^ikinci sayfaya tıklanır\\.$")
    public void ikinciSayfayaTıklanır() { SItemPage.clickSecondPage(); }

    @And("^ikinci sayfanın açıltığı kontrol edilir$")
    public void ikinciSayfanınAçıltığıKontrolEdilir() {
        scroolDown();
        SItemPage.checkPageTwo();
    }

    @And("^Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir\\.$")
    public void sonucaGöreSergilenenÜrünlerdenRastgeleBirÜrünSeçilir() { SItemPage.clickRandomElement(); }


}
