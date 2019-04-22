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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
