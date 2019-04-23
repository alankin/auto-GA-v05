package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

public class Puma extends BasePage {

    private String price;

    @FindBy(xpath = "//a[@href='/hombre']")
    private WebElement hombreHeaderMenu;

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private WebElement futbolMenuItem;

    @FindBy(xpath = "//div[@title='Calzado de Fútbol X 18.3 TF']/parent::div//span[contains(@class, 'gl-price__value gl-price__value--sale')]")
    private WebElement firstShoeTitle;

    @FindBy(xpath = "//a[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html']")
    private WebElement firstShoeItem;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement buttonEligeTuTalla;

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement buttonMX;

    @FindBy(xpath = "//button[@data-auto-id='add-to-bag']")
    private WebElement buttonAddToCar;

    @FindBy(xpath = "//span[@data-auto-id='add-to-bag-product-info-qty']")
    private WebElement quantitySelected;

    @FindBy(xpath = "//a[@href='//www.adidas.mx/on/demandware.store/Sites-adidas-MX-Site/es_MX/Cart-Show' and contains(@class, 'gl-cta gl-cta--primary')]")
    private WebElement seeCartLink;

    @FindBy(xpath = "//a[@title='Calzado de Fútbol X 18.3 TF']")
    private WebElement titleCardCart;

    //
    @FindBy(xpath = "//div[contains(@class, 'cart-widget-label') and contains(text(), '1 producto')]")
    private WebElement quantityValueSummarize;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement totalProductPrice;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement totalFinalPrice;

    public void hoverOverHeaderMenu() {
        hover(hombreHeaderMenu);
    }

    public void hoverOverFutbolMenu() {
        clickButton(futbolMenuItem);
    }

    public void getPriceCalzado() {
        setPrice(firstShoeTitle.getText());
    }

    public void clickOverCalzado() {
        firstShoeItem.click();
    }

    public void clickOverEligeTuTalla() {
        buttonEligeTuTalla.click();
    }

    public void clickOverSizeButton() {
        buttonMX.click();
    }

    public void clickOverAddToCar() {
        buttonAddToCar.click();
    }

    public String getQuantitySelected() {
        return quantitySelected.getText();
    }

    public void clickOverSeeCarLink() {
        seeCartLink.click();
    }

    public String getTitleCard() {
        return titleCardCart.getText();
    }

    public String getQuantitySummarize() {
        return quantityValueSummarize.getText();
    }

    public String getTotalProductPrice() {
        return totalProductPrice.getText();
    }

    public String getTotalFinalPrice() {
        return totalFinalPrice.getText();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
