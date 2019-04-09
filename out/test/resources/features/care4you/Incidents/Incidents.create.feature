Feature: Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Create an incident' menu item in 'Incidents menu

  Scenario Outline: : Incidents form is filled
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <ddate> | <stype> | <sseverity> | <semployeeId> |


    Examples:
      | sname | sdescription | ddate      | stype  | sseverity | semployeeId |
      | name1 | description  | 2018-01-01 | INJURY | HIGH      | 1           |