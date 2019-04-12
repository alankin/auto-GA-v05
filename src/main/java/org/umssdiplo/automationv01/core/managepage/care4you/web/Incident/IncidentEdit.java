package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

import java.util.List;

public class IncidentEdit extends BasePage {

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    public WebElement getElement(String name) {
        Integer position = findWebElementPosition(nameColumnList, name);
        return findById("update-" + position);
    }

    public void navigateToEditIncident(WebElement element) {
        click(element);
    }

}
