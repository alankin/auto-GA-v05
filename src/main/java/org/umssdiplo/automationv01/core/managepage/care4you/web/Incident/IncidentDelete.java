package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

public class IncidentDelete extends BasePage {

    @FindBy(id = "modal-confirm")
    private WebElement confirmButton;

    @FindBy(id = "modal-cancel")
    private WebElement cancelButton;

    public void deleteIncident() {
        click(confirmButton);
    }

    public void cancelIncident() {
        click(cancelButton);
    }

    public void showDeleteModalSpecificElement(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-trash')]"));
        click(element);
    }

    public WebElement verifyIncidentDeleted(String name) {
        try {
            return findByXPath(("//td[contains(text(), '" + name + "')]"));
        } catch (Exception e) {
            return null;
        }
    }

}
