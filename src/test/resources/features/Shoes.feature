# Login feature review the behavior in thie feature
Feature: Shoes

  Scenario: Shoes page is displayed
    Given 'Adidas' page is loaded
    And tabHombre hover
    And click subMenu Futbol
    And click calzado
    And select size
    And add to car
    And verify quantity "1"
    And see car
    And verify title "Calzado de Fútbol X 18.3 TF"
    And Verify quanttity "1"
    And price: "$1,329.00"
    And total: "$1,428.00"

