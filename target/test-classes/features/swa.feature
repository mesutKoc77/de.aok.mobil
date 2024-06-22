
@mesut
Feature: New User Registration for MeineAok
  As a new user
  I want to register for the MeineAok application
  So that I can access the services offered

  Background: User access the app successfully
    Given User Installs the Driver and directs it to the application under test with "aokAppPackage" and "aokAppActivity".

  Scenario: User successfully registers for MeineAok
    Given the user opens MeineAok application and chooses his "branch_name"
    When the user clicks the Akzeptieren button
    When the user clicks the Jetzt Registrieren button
    When the user accepts Zustimmung erforderlich and clicks the Weiter button
    When the user enters the card number in the Versicherungsnummer field and clicks the Weiter button
    When the user fills in the Benutzername, E-Mail and E-Mail wiederholen fields
    And the user checks the Ich willige ein... text box
    And the user clicks the Weiter button
    When the user enters the information in the relevant fields in the Password area
    And the user clicks the Weiter button
    When the user enters his mobile phone information
    And the user checks the Ich willige ein... text box
    And the user clicks the Code anfordern button
    When the user clicks the Code bestätigen button
    When the user verifies his email address
    And the user clicks the Weiter button
    Then the user should receive the email that the Freischaltcode will be sent to his home



