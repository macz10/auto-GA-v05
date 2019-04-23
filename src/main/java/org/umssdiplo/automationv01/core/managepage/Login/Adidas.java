package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Adidas extends BasePage {
    @FindBy(css = "a[href='/hombre']")
    private WebElement tabHombre;

    @FindBy(css = "a[href='/calzado_de_futbol-hombre']")
    private WebElement menuFutbol;

    @FindBy(css = ".gl-price__value gl-price__value--sale")
    private WebElement price;

    @FindBy(css = "a[href='/calzado-de-futbol-x-18.3-tf/BB9398.html'][data-auto-id='glass-hockeycard-link']")
    private WebElement shoe;

    @FindBy(css = "button[title='Elige tu talla']")
    private WebElement drpSize;

    @FindBy(css= "button[title='MX 9.5']")
    private WebElement slctSize;


    @FindBy(css= "button[type='submit']")
    private WebElement addCar;


//    public void setCredentials() {
//        String username = PropertyAccessor.getInstance().getUser();
//        String password = PropertyAccessor.getInstance().getPassword();
//        CommonEvents.setInputField(usernameInputField, username);
//        CommonEvents.setInputField(passwordInputField, password);
//        CommonEvents.clickButton(loginBtn);
//    }
    public void hoverHombre(){
        mouseOver(tabHombre);
    }
    public void mouseOver(WebElement webElement){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).build().perform();
    }
    public void clickFutbolMenu(){
        CommonEvents.jsClickElement(menuFutbol);
    }
    public  String getPrice(){
       return CommonEvents.getTextContent(price);
    }
    public void clickShoe(){
        CommonEvents.jsClickElement(shoe);
    }

    public void clickDrpSize(){
        CommonEvents.jsClickElement(drpSize);
    }

    public void clickSelectSize(){
        CommonEvents.clickButton(slctSize);
    }

    public void addCar(){
        CommonEvents.clickButton(addCar);
    }

}
