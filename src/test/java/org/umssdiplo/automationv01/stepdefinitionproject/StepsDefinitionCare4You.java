package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.care4you.home.Home;
import org.umssdiplo.automationv01.core.managepage.care4you.Incident.Incident;
import org.umssdiplo.automationv01.core.utils.care4you.Care4You;

public class StepsDefinitionCare4You {
    private Home home;
    private Incident incident;

    @Given("^'Care4You' page is loaded$")
    public void care4YouPageIsLoaded() throws Throwable {
        Care4You manager = Care4You.init();
        incident = manager.getIncident();
        home = manager.getHome();
    }

    @And("^click 'Incidents' tab in 'Header menu'$")
    public void navigateToIncidents() throws Throwable {
        home.navigateToIncidents();
    }

    @And("^click 'Incidents' menu item in 'Incidents menu'$")
    public void openIncidentsList() throws Throwable {
        incident.openIncidentsList();
    }

    @And("^click 'Create an incident' menu item in 'Incidents menu$")
    public void openIncidentsForm() throws Throwable {
        incident.openIncidentsForm();
    }

    @And("^click 'Generate Report' menu item in 'Incidents menu$")
    public void openIncidentsReport() throws Throwable {
        incident.openIncidentsReport();
    }
}
