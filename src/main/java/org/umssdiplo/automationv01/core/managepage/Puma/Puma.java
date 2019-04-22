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

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
