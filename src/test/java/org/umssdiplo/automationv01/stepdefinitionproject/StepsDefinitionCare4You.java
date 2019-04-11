package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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


    @And("^Enter 'Create an incident' form information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        incidentCreate.fillIncidentsForm(incident.get(0));
    }


    @And("^click 'submit' button in 'Incidents menu'$")
    public void submitIncidentsForm() throws Throwable {
        incidentCreate.submitIncidentsForm();
    }

    @And("^verify incident item exist in 'Incidents list'$")
    public void verifyIncidentCreated(List<Incident> incident) throws Throwable {
        incidentCreate.verifyIncidentCreated(incident.get(0));
    }

    @And("^click 'Edit an incident' button in first element of 'Incidents list'$")
    public void navigateToEditIncidentFirstElement() throws Throwable {
        incidentEdit.navigateToEditIncidentFirstElement();
    }

    @Given("^click 'Edit an incident' button in one element of 'Incidents list'$")
    public void navigateToEditIncident(List<Incident> incidents) throws Throwable {
        incidentEdit.navigateToEditIncident(incidents.get(0));
    }

    @And("^verify incident item has been edited in 'Incidents list'$")
    public void verifyIncidentEdited(List<Incident> incident) throws Throwable {
        incidentEdit.verifyIncidentEdited(incident.get(0));
    }

    @Given("^click 'Delete an incident' button in first element of 'Incidents list'$")
    public void showDeleteModal() throws Throwable {
        incidentDelete.showDeleteModalFirstElement();
    }

    @Given("^click 'Remove an incident' button in one element of 'Incidents list'$")
    public void showDeleteModalSpecificElement(List<Incident> incidents) throws Throwable {
        incidentDelete.showDeleteModalSpecificElement(incidents.get(0));
    }

    @And("^click 'Ok' button from deletion modal$")
    public void deleteIncident() throws Throwable {
        incidentDelete.deleteIncident();
    }

    @And("^click 'Cancel' button from deletion modal$")
    public void cancelDeletionIncident() throws Throwable {
        incidentDelete.cancelDeletionIncident();
    }

    @And("^verify incident item has been deleted in 'Incidents list'$")
    public void verifyIncidentDeleted() throws Throwable {
        incidentDelete.verifyIncidentDeleted();
    }
}
