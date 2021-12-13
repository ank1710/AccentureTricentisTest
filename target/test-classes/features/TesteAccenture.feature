#Author: leozanat@gmail.com

@challenge 
Feature: Quoting assurance validation	
  I want to quote an assurance for my vehicle
  
  Background: Acessar o site da tricentis 
  Given acessar o site da tricentis sampleapp "http://sampleapp.tricentis.com/101/app.php"

  @tag1
  Scenario: Assurance Quoting
    And fill the vehicle data form
    And fill the insuransse data form
    And fill the product data form
    And select for the payment option
    And fill out the quote 
    Then i validate the sending email message successfully 

    
      

  