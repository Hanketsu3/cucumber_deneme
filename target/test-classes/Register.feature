Feature: Register Test

  Scenario Outline: 

    And click Sign in button
    And type email "<Email>"
    And click on Create an Account button
    And choose title
    And type firstname "<firstname>" and lastname "<lastname>"
    And type password "<password>"

		Examples:
		|Email|firstname|lastname|password|
		|kisi1@gmail.com|kisiad|kisisoyad|asd123|
		|kisi2@gmail.com|kisiad|kisisoyad|asd123|
		|kisi3@gmail.com|kisiad|kisisoyad|asd123|
		|kisi4@gmail.com|kisiad|kisisoyad|asd123|
		|kisi5@gmail.com|kisiad|kisisoyad|asd123|
		