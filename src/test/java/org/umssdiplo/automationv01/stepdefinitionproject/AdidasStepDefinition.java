package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AdidasStepDefinition {
    private Adidas adidas;

//    @Given("^'PHP travel' page is loaded$")
//    public void phpTravelPageIsLoaded() throws Throwable {
//        login = LoadPage.loginPage();
//    }
//
//    @And("^set my credentials on 'Login' page$")
//    public void setMyCredentialsOnLoginPage() throws Throwable {
//        login.setCredentials();
//    }

    @Given("^'Adidas' page is loaded$")
    public void pumaPageIsLoaded() throws Throwable{
        adidas = LoadPage.loadPage();
    }

    @And("^tabHombre hover$")
    public void tabhombreHover() throws Throwable{
        adidas.hoverHombre();
    }

    @And("^soccer shoe is displayed$")
    public void soccerShoeIsDisplayed() throws Throwable{
    }

    @And("^click subMenu Futbol$")
    public void clickSubMenuFutbol() throws Throwable{
        adidas.clickFutbolMenu();
    }

    @And("^click calzado$")
    public void clickCalzado() throws Throwable{
        adidas.clickShoe();
    }

    @And("^select size$")
    public void selectSize() {
        adidas.clickDrpSize();
        adidas.clickSelectSize();
    }

    @And("^add to car$")
    public void addToCar() {
        adidas.addCar();
    }
}
