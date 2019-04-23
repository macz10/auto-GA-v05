package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Adidas;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class AdidasStepDefinition {
    private Adidas adidas;

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
    public void selectSize() throws Throwable{
        adidas.clickDrpSize();
        adidas.clickSelectSize();
    }

    @And("^add to car$")
    public void addToCar() throws Throwable{
        adidas.addCar();
    }

    @And("^verify quantity$")
    public void verifyQuantity() throws Throwable{
        adidas.quantity();
    }


    @And("^verify quantity \"([^\"]*)\"$")
    public void verifyQuantity(String quantity) throws Throwable {
        String quant= adidas.getQuantity();
        //Assert.assertTrue(quantity.equals(quant));
    }

    @And("^see car$")
    public void seeCar() throws Throwable{
        adidas.seeCar();
    }

    @And("^verify title$")
    public void verifyTitle() throws Throwable{
        String title = "Calzado de Fútbol X 18.3 TF";
        Assert.assertEquals(adidas.getTitle(), title, "Titulo incorrecto");
    }

    @And("^verify title \"([^\"]*)\"$")
    public void verifyTitle(String title) throws Throwable {
        Assert.assertTrue(title.equals(adidas.getTitleText2()));
    }

    @And("^Verify quanttity \"([^\"]*)\"$")
    public void verifyQuanttity(String q1) throws Throwable {
        Assert.assertTrue(q1.equals(adidas.getQuantity()));
    }

    @And("^price: \"([^\"]*)\"$")
    public void price(String price) throws Throwable {
        Assert.assertTrue(price.equals(adidas.getPrice1()));
    }

    @And("^total: \"([^\"]*)\"$")
    public void total(String total) throws Throwable {
        Assert.assertTrue(total.equals(adidas.getTotalPrice()));
    }



}
