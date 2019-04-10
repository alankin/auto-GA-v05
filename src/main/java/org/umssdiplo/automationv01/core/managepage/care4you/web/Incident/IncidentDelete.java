package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class IncidentDelete extends BasePage {
    @FindBy(id = "delete-0")
    private WebElement deleteButton0;

    @FindBy(id = "modal-confirm")
    private WebElement confirmButton;

    @FindBy(id = "modal-cancel")
    private WebElement cancelButton;

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    public Integer initialSize;

    public void showDeleteModal() {
        initialSize = nameColumnList.size();
        CommonEvents.click(deleteButton0);
    }

    public void deleteIncident() {
        CommonEvents.click(confirmButton);
    }

    public void cancelDeletionIncident() {
        CommonEvents.click(cancelButton);
    }

    public void verifyIncidentDeleted() {
        Integer newSize = nameColumnList.size();
        if (initialSize.equals(newSize) || initialSize < newSize)){
            Assert.error();
        }
    }

}
