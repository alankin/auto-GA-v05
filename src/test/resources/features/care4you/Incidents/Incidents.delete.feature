Feature: Delete an Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'

  Scenario Outline: Verify deletion of incident
    Given click 'Remove an incident' button in element with name "<name>" of 'Incidents list'
    And click 'Ok' button from deletion modal
    Then verify incident item has been deleted in 'Incidents list'

    Examples:
      | name               |
      | My incident EDITED |
