package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IncidentDelete extends BasePage {
    @FindBy(id = "delete-0")
    private WebElement deleteButton0;

    @FindBy(id = "modal-confirm")
    private WebElement confirmButton;

    @FindBy(id = "modal-cancel")
    private WebElement cancelButton;

    public void showDeleteModal() {
        CommonEvents.click(deleteButton0);
    }

    public void deleteIncident() {
        CommonEvents.click(confirmButton);
    }

    public void cancelDeletionIncident() {
        CommonEvents.click(cancelButton);
    }

}
