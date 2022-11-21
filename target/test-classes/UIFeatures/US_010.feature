
@Zeynep
Feature: US_001 Doktor (Physician) randevuları

  Background: Ortak Steps
    Given  Kullanıcı "medunna_url" sayfasına gider.
    When   Kullanıcı login butonuna tıklar
    Then   Geçerli userName girer (doktor)
    And    Geçerli password girer
    And    Sign in butonuna tıklar

  @Zeynep1
  Scenario: TC_001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

     And MyPages butonuna tıklar
    And  Ana sayfada My Appointments butonuna tıklar.
    And  Doktor My Appointments sayfasında oldugunu doğrular
    And  Doktor randevu listesini görür
    And  Doktor randevu başlangıç ve bitiş tarihlerini görür
    And  Sayfayı kapatır

  @Zeynep2
    Scenario: TC_002 Doktor "patient id, start date, end date, status" bilgilerini görebilmeli

       And MyPages butonuna tıklar
       And Ana sayfada My Appointments butonuna tıklar.
      Then Doktor patient Id görünür olduğunu doğrular
       And Doktor Start date time bilgisinin görünür olduğunu doğrular
       And Doktor end date time bilgisinin görünür olduğunu doğrular
       And Doktor status bilgisinin görünür olduğunu doğrular
       And Sayfayı kapatır
















