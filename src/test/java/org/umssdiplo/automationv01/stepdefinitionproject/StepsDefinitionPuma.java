package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Puma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPuma {
    private Puma puma;

    @Given("^'Adidas' page is loaded$")
    public void adidasPageIsLoaded() throws Throwable {
        puma = LoadPage.loadPage();
    }

    @And("^Hover over 'HOMBRE' menu item in 'Header' menu$")
    public void hoverOverHeaderMenu() throws Throwable {
        puma.hoverOverHeaderMenu();
    }

    @And("^Click over 'Futbol' menu item inside 'TENIS' menu item section$")
    public void hoverOverShoesMenu() throws Throwable {
        puma.hoverOverFutbolMenu();
    }

    @And("^Get price of 'Calzado de Fútbol X 18.3 TF'$")
    public void getPrice() throws Throwable {
        puma.getPriceCalzado();
    }

    @And("^Click over 'Calzado de Fútbol X 18.3 TF' card item$")
    public void clickOverCalzado() throws Throwable {
        puma.clickOverCalzado();
    }

    @And("^Click over 'ELIGE TU TALLA' select$")
    public void clickOverEligeTuTalla() throws Throwable {
        puma.clickOverEligeTuTalla();
    }

    @And("^Click over 'MX 9.5' select option from 'ELIGE TU TALLA' select$")
    public void clickOverSizeButton() throws Throwable {
        puma.clickOverSizeButton();
    }

    @And("^Click over 'Add to car' button from main preview$")
    public void clickAddToCarBtn() throws Throwable {
        puma.clickOverAddToCar();
    }

    @Then("^Verify quantity value is \"([^\"]*)\" from cart modal$")
    public void verifyQuantity(String expectedQuantity) throws Throwable {
        Assert.assertEquals(puma.getQuantitySelected(), expectedQuantity);
    }

    @And("^Click over 'VER CARRITO' link from cart modal$")
    public void clickOverSeeCarLink() throws Throwable {
        puma.clickOverSeeCarLink();
    }

    @Then("^Verify \"([^\"]*)\" title is displayed in card$")
    public void verifyTitleCard(String title) throws Throwable {
        Assert.assertEquals(puma.getTitleCard().toLowerCase(), title.toLowerCase());
    }

    @Then("^Verify quantity value is \"([^\"]*)\" in request summarize$")
    public void verifyQuantityValueSummarize(String quantitySummarize) throws Throwable {
        Assert.assertEquals(puma.getQuantitySummarize().toLowerCase(), quantitySummarize.toLowerCase());
    }

    @Then("^Verify stored product price is \"([^\"]*)\" like request summarize$")
    public void verifyStoredProductPriceSummarize(String productPrice) throws Throwable {
        Assert.assertEquals(puma.getPrice(), productPrice);
    }

    @Then("^Verify total product price is \"([^\"]*)\" in request summarize$")
    public void verifyTotalProductPriceSummarize(String productPrice) throws Throwable {
        Assert.assertEquals(puma.getTotalProductPrice(), productPrice);
    }

    @Then("^Verify total final price is \"([^\"]*)\" in request summarize$")
    public void verifyTotalFinalPriceSummarize(String finalPrice) throws Throwable {
        Assert.assertEquals(puma.getTotalFinalPrice(), finalPrice);
    }
}
