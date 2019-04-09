package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class IncidentCreate extends BasePage {
    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "date")
    private WebElement dateField;

    @FindBy(id = "type")
    private WebElement typeField;

    @FindBy(id = "severity")
    private WebElement severityField;

    @FindBy(id = "employeeId")
    private WebElement employeeIdField;

    public void fillIncidentsForm(Incident incident) {
        CommonEvents.setInputField(nameField, incident.getName());
        CommonEvents.setInputField(descriptionField, incident.getDescription());
        CommonEvents.clickButton(dateField);
        CommonEvents.setInputFieldNoEditable(dateField, incident.getDate());
        CommonEvents.setInputFieldNoEditable(typeField, incident.getType());
        CommonEvents.setInputFieldNoEditable(severityField, incident.getSeverity());
        CommonEvents.setInputFieldNoEditable(employeeIdField, incident.getEmployeeId());
    }
}
