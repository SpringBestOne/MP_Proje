
Feature: Password Degisimi

  Scenario Outline:   
  Given  Kullanici "medunna_url" sayfasina gider.US8
    When   Kullanici login butonuna tiklarUS8
    Then   Farkli yetkilendirmeler icin Gecerli  kullanici ismi "<farkliUsername>" girer
    And    Farkli yetkilendirmeler icin Gecerli sifre  "<farkliPassword>" girer
    And    Sign in butonuna tiklarUS8
    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Kullanici yedi haneli yeni sifresini girerUS8
    And  New password confirmation butonuna tiklar, yeni sifresini tekrar girerUS8
    And  Save butonuna tiklar,US8



    Examples:
      | farkliUsername  | farkliPassword |
      | staffteam19     | medunna12.     |
      | physicionteam19 | medunna12.     |
      | patientteam19   | medunna12.     |
      | Adminteam19     | medunna12.     |


