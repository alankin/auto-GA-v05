package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

public class IncidentEdit extends BasePage {

    public void navigateToEditIncident(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-pencil')]"));
        click(element);
    }

}
