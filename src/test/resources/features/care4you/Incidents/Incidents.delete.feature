Feature: Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'

  Scenario: First Incident is removed
    Given click 'Delete an incident' button in first element of 'Incidents list'
    And click 'Ok' button from deletion modal

  Scenario: Verify deletion of incident
    Given click 'Delete an incident' button in first element of 'Incidents list'
    And click 'Ok' button from deletion modal
    Then verify incident item has been deleted in 'Incidents list'