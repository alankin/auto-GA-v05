package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import com.sun.tools.javac.util.Assert;
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

    public void deleteIncident() {
        click(confirmButton);
    }

    public void showDeleteModalSpecificElement(WebElement element) {
        initialSize = nameColumnList.size();

        click(element);
    }

    public WebElement getElement(String name) {
        Integer position = findWebElementPosition(nameColumnList, name);
        return findById("delete-" + position);
    }

    public void verifyIncidentDeleted() {
        Integer newSize = nameColumnList.size();
        if (initialSize.equals(newSize) || initialSize < newSize) {
            Assert.error();
        }
    }

}
