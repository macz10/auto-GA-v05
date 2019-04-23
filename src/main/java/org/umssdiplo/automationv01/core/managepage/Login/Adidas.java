package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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

    @FindBy(css= "span[data-auto-id='add-to-bag-product-info-qty']")
    private WebElement quantity;

    @FindBy(css = "a[data-auto-id='view-bag-desktop']")
    private WebElement seeCar;

    @FindBy(css="a.name[title='Calzado de Fútbol X 18.3 TF']")
    private WebElement title;

    @FindBy(css=".cart-products-payment_total .cart-widget-value")
    private WebElement totalp;

    @FindBy(css=".totalcolumn .standartprice")
    private WebElement price1;

    @FindBy(css=".cart-products-payment_total .cart-widget-value")
    private WebElement quantity1;

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

    public void quantity(){
        CommonEvents.getTextContent(quantity);

    }
    public void seeCar(){
        CommonEvents.clickButton(seeCar);
    }

    public String getTitle() {
       return CommonEvents.getTextContent(title);
    }

    public String getTitleText2(){
        return title.getText();
    }

    public String getQuantity(){
        return quantity.getText();
    }

    public String getPrice1(){
        return price.getText();
    }

    public String getTotalPrice(){
        return totalp.getText();
    }
}
