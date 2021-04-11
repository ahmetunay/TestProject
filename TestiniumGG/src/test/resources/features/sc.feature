@Senaryo
Feature: Senaryolar

  Background:
    And Tarayıcı çalıştırılır

  Scenario: Login Formunun Doldurulması ve Üyeliğe giriş Testi
    Then  Web Sitesi Başlığı kontrol edilir
    And   Login Butonu üstünde durulur
    Then  Login Button Tıklanır
    When  Login Sayfanın Yüklenmesi beklenir
    And   Login Sayfasındaki eposta alanı doldurulur
    And   Login Sayfasındaki şifre alanı doldurulur
    And   Login Sayfasındaki giriş yap butonuna tıklanır
    Then  Giriş yapmış kullanıcı için ana ekran kontrol edilir
    And   Arama kutucuğuna bilgisayar kelimesi girilir
    And   Bul butonuna tıklanır
    And  Arama  sonuclarısayfası açılır.
    Then ikinci sayfaya tıklanır.
    And  ikinci sayfanın açıltığı kontrol edilir
    And  Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
    And  Seçilen ürün sepete eklenir.
    And  Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
    And  Adet arttırılır
    And  Sepete Gidilir
    And  İki adet Ürün olduğu kontrol edilir.
    And  Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.
