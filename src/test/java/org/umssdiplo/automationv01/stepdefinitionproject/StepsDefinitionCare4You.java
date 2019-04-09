package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.care4you.domain.Incident;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentCreate;
import org.umssdiplo.automationv01.core.managepage.care4you.web.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.web.Incident.IncidentHome;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

import java.util.List;

public class StepsDefinitionCare4You {
    private Home home;
    private IncidentHome incidentHome;
    private IncidentCreate incidentCreate;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        home = manager.getHome();
        incidentHome = manager.getIncidentHome();
        incidentCreate = manager.getIncidentCreate();

    }

    @And("^click 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @And("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incidentHome.openIncidentsList();
    }

    @And("^click 'Create an incident' menu item in 'Incidents menu$")
    public void openIncidentsForm() throws Throwable {
        incidentHome.openIncidentsForm();
    }

    @And("^click 'Generate Report' menu item in 'Incidents menu$")
    public void openIncidentsReport() throws Throwable {
        incidentHome.openIncidentsReport();
    }


    @Given("^Enter 'Create an incident' form information$")
    public void enterIncidentsFormInformation(List<Incident> incident) throws Throwable {
        System.out.println(incident.get(0).getName());
    }
}
