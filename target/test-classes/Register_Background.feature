Feature: Register Test

  Background: 
    And click Sign in button
    And type email "asd@gmail.com"
    And click on Create an Account button

  Scenario: Kişi1
    And choose title
    And type firstname "kişi1" and lastname "kişi"

  Scenario: Kişi2
    And choose title
    And type firstname "kişi2" and lastname "kişi"

  Scenario Outline: 
    And choose title
    And type firstname "<isim>" and lastname "<soyisim>"
    And type password "<sifre>"

    Examples: 
      | Email           | isim | soyisim  | sifre |
      | kisi3@gmail.com | kisiad    | kisisoyad | asd123   |
      | kisi4@gmail.com | kisiad    | kisisoyad | asd123   |
      | kisi5@gmail.com | kisiad    | kisisoyad | asd123   |
      | kisi6@gmail.com | kisiad    | kisisoyad | asd123   |
      | kisi7@gmail.com | kisiad    | kisisoyad | asd123   |
