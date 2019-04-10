package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

public class IncidentHome extends BasePage {
    @FindBy(id = "list-incidents-menu")
    private WebElement listIncidentsOption;

    @FindBy(id = "create-incident-menu")
    private WebElement createIncidentsOption;

    @FindBy(id = "report-incident-menu")
    private WebElement reportIncidentsOption;

    public void openIncidentsList() {
        click(listIncidentsOption);
    }

    public void openIncidentsForm() {
        click(createIncidentsOption);
    }

    public void openIncidentsReport() {
        click(reportIncidentsOption);
    }
}
