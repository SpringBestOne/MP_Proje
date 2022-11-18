
@Zeynep
Feature: US_001 Doktor (Physician) randevuları

  Background: Ortak Steps
    Given  Kullanıcı "medunna_url" sayfasına gider.
    When   Kullanıcı login butonuna tıklar
    Then   Geçerli userName girer (doktor)
    And    Geçerli password girer
    And    Sign in butonuna tıklar
    And    Ana sayfada My Appointments butonuna tıklar.

  Scenario: TC_001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

    Then Ana sayfada My Appointments butonunun görünür olduğunu doğrular
    And  Doktor My Appointments sayfasında oldugunu doğrular
    And  Doktor randevu listesini görür
    And  Doktor randevu başlangıç ve bitiş tarihlerini görür

    Scenario: TC_002 Doktor "patient id, start date, end date, status" bilgilerini görebilmeli

      Then Doktor patient Id görünür olduğunu doğrular
       And Doktor Start date time bilgisinin görünür olduğunu doğrular
       And Doktor end date time bilgisinin görünür olduğunu doğrular
       And Doktor status bilgisinin grünür olduğunu doğrular

















