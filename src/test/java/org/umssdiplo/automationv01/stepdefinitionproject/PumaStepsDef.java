package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Adidas.Adidas;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class PumaStepsDef {
    private Adidas adidas;

//    @Given("^'PHP travel' page is loaded$")
//    public void phpTravelPageIsLoaded() throws Throwable {
//        login = LoadPage.loginPage();
//    }

//    @And("^set my credentials on 'Login' page$")
//    public void setMyCredentialsOnLoginPage() throws Throwable {
//        login.setCredentials();
//    }

    @Given("^'Puma' page is loaded$")
    public void pumaPageIsLoaded() throws Throwable{
        adidas = LoadPage.loginPage();
    }

    @And("^soccer shoe is displayed$")
    public void soccerShoeIsDisplayed() {
    }
}
