package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import java.util.List;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

public class IncidentDelete extends BasePage {

    @FindBy(id = "modal-confirm")
    private WebElement confirmButton;

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    private Integer initialSize;

    private final String deletePrefix = "delete-";

    public void deleteIncident() {
        click(confirmButton);
    }

    public void showDeleteModalSpecificElement(WebElement element) {
        initialSize = nameColumnList.size();

        click(element);
    }

    public WebElement getElement(String name) {
        Integer position = findWebElementPosition(nameColumnList, name);
        return findById(deletePrefix + position);
    }

    public boolean verifyIncidentDeleted() {
        Integer newSize = nameColumnList.size();
        return (initialSize.equals(newSize) || initialSize < newSize);
    }

}
