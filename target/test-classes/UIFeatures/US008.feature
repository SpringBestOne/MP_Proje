@Gulsah

Feature: US_008 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir.

 Background: Ortak Steps

    Given  Kullanici "medunna_url" sayfasina gider.US8
    When   Kullanici login butonuna tiklarUS8
    Then   Gecerli userName girerUS8
    And    Gecerli password girerUS8
    And    Sign in butonuna tiklarUS8

  Scenario:TC 001

    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Kullanici New password kutusuna tiklar yedi haneli Kucuk Harf girer kirmizi strangth seviyesini gorurUS8
    And  Kullanici, New password kutusuna tiklar,yedi haneli bir sifre girer ve daha guclu sifre icin en az bir buyuk harf girerUS8
    And  "Password strength:" seviyesinin degistigini gorurUS8
    And  sayfayi kapatirUS8

  Scenario:TC 002
    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Kullanici yedi haneli sifre girer, sifre en az bir rakam icermeli ve "Password strength:" seviyesinin degistigi gorullurUS8
    And  "Password strength:" seviyesinin OrangeColor olarak degistigini gorurUS8
    And  sayfayi kapatirUS8

  Scenario:TC 003
    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Kullanici yedi haneli sifre girer, sifre en az bir ozel karakter icermeli ve "Password strength:" seviyesinin degistigi gorullurUS8
    And  "Password strength:" seviyesinin greenColor olarak degistigini gorurUS8
    And  sayfayi kapatirUS8

  Scenario:TC 004
    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Guclu bir paraola icin Kullanici yedi haneli sifre girer, sifre en az bir buyuk harf, bir rakam bir ozel karakter icermeli ve "Password strength:" seviyesinin degistigi gorullurUS8
    And  "Password strength:" seviyesinin fullColor olarak degistigini gorurUS8
    And  sayfayi kapatirUS8

  Scenario:TC 005
    Then Kullanici isminin uzerine tiklarUS8
    And  Acilan sekmelerden, password secenegine tiklarUS8
    And  Kullanici, Current password kutucuguna tiklar ve mevcut passwordunu girerUS8
    And  Kullanici yedi haneli yeni sifresini girerUS8
    And  New password confirmation butonuna tiklar, yeni sifresini tekrar girerUS8
    And  Save butonuna tiklar,US8
    And  Password Changed yazisini gorur,  New password confirmation onaylanir,US8
    And  sayfayi kapatirUS8

