package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IncidentEdit extends BasePage {
    @FindBy(id = "update-0")
    private WebElement updateButton0;

    public void navigateToEditIncident() {
        System.out.println(updateButton0);
        CommonEvents.click(updateButton0);
    }

}
