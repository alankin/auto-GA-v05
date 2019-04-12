Feature: Delete an Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'

  Scenario Outline: Verify deletion of incident
    Given click 'Remove an incident' button in one element of 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And click 'Ok' button from deletion modal
    Then verify incident item has been deleted in 'Incidents list'

    Examples:
      | sname              | sdescription          | sdate                  | stype    | sseverity | semployeeId |
      | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH      | Juan Pinto  |
