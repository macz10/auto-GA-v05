# Login feature review the behavior in thie feature
Feature: Shoes

  Scenario: Shoes page is displayed
    Given 'Adidas' page is loaded
    And tabHombre hover
    And click subMenu Futbol
    And click calzado
    And select size
    And add to car
