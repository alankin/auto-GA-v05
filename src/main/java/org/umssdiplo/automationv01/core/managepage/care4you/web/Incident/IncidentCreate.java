package org.umssdiplo.automationv01.core.managepage.care4you.web.Incident;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;

import java.util.List;

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

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(className = "incident-list-name")
    private List<WebElement> nameColumnList;

    private final static String calendarExpr = "//div[@aria-label='";
    private final static String closeExpr = "']";

    public void fillIncidentsForm(Incident incident) {
        setValue(nameField, incident.getName());
        setValue(descriptionField, incident.getDescription());
        click(dateField);
        click(findByXPath(getDate(incident.getDate())));
        setValueNoEditable(typeField, incident.getType());
        setValueNoEditable(severityField, incident.getSeverity());
        setValueNoEditable(employeeIdField, incident.getEmployeeId());
    }

    public void submitIncidentsForm() {
        click(submitButton);
    }

    public WebElement getElement(String name) {
        return findWebElement(nameColumnList, name);
    }

    private static String getDate(String date) {
        return calendarExpr + date + closeExpr;
    }
}
