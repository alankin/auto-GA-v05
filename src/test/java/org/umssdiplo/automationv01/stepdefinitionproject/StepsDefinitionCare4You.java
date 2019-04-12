package org.umssdiplo.automationv01.stepdefinitionproject;

import com.sun.tools.javac.util.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentCreate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentDelete;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentEdit;
import org.umssdiplo.automationv01.core.managepage.care4you.web.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentHome;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

import java.util.List;

public class StepsDefinitionCare4You {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;
    private IncidentEdit incidentEdit;
    private IncidentDelete incidentDelete;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        home = manager.getHome();
        incidentHome = manager.getIncidentHome();
        incidentCreate = manager.getIncidentCreate();
        incidentEdit = manager.getIncidentEdit();
        incidentDelete = manager.getIncidentDelete();

    }

    /**
     * Home
     */

    @And("^click 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @And("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incidentHome.openIncidentsList();
    }

    @And("^click 'Create an incident' menu item in 'Incidents menu'$")
    public void openIncidentsForm() throws Throwable {
        incidentHome.openIncidentsForm();
    }

    @And("^click 'Generate Report' menu item in 'Incidents menu$")
    public void openIncidentsReport() throws Throwable {
        incidentHome.openIncidentsReport();
    }

    /**
     * Commons
     */

    @Then("^verify incident item with name \"([^\"]*)\" exist in 'Incidents list'$")
    public void verifyIncidentItemWithNameExistInIncidentsList(String name) {
        WebElement element = incidentCreate.getElement(name);
        if (null == element) {
            Assert.error("Verification Exception: Incident with name: " + name + " not exists in incident list.");
        }
    }

    /**
     * Creation
     */
    @And("^Enter 'Create an incident' form information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }


    @And("^click 'submit' button in 'Incidents menu'$")
    public void submitIncidentsForm() throws Throwable {
        incidentCreate.submitIncidentsForm();
    }

    /**
     * Edition
     */

    @Given("^click 'Edit an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void navigateToEditIncident(String name) throws Throwable {
        WebElement element = incidentEdit.getElement(name);
        if (null == element) {
            Assert.error("[" + IncidentEdit.class + "]: Verification Exception: Incident with name: " + name + " not exists in incident list.");
        }

        incidentEdit.navigateToEditIncident(element);
    }

    /**
     * Deletion
     */
    @Given("^click 'Remove an incident' button in element with name \"([^\"]*)\" of 'Incidents list'$")
    public void showDeleteModalSpecificElement(String name) throws Throwable {
        WebElement element = incidentDelete.getElement(name);
        if (null == element) {
            Assert.error("[" + IncidentEdit.class + "]: Verification Exception: Incident with name: " + name + " not exists in incident list.");
        }

        incidentDelete.showDeleteModalSpecificElement(element);
    }

    @And("^click 'Ok' button from deletion modal$")
    public void deleteIncident() throws Throwable {
        incidentDelete.deleteIncident();
    }

    @Then("^verify incident item has been deleted in 'Incidents list'$")
    public void verifyIncidentDeleted() throws Throwable {
        Boolean removed = incidentDelete.verifyIncidentDeleted();
        if (removed) {
            Assert.error("[" + IncidentEdit.class + "]: Verification Exception: Incident has not been removed from in incident list.");
        }
    }
}
