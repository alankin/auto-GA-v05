package org.umssdiplo.automationv01.core.managepage.care4you.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
    @FindBy(id = "root-incidents-menu")
    private WebElement incidentsOption;

    @FindBy(id = "root-incidents-home")
    private WebElement homeOption;

    public void navigateToIncidents() {
        CommonEvents.clickButton(incidentsOption);
    }

    public void navigateToHome() {
        CommonEvents.clickButton(homeOption);
    }
}
