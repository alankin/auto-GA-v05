package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Puma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPuma {
    private Puma puma;

    @Given("^'Puma' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
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
}
