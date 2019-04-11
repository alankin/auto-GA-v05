Feature: Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Create an incident' menu item in 'Incidents menu'

  Scenario Outline: : Incidents form is filled
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |

    Examples:
      | sname       | sdescription   | sdate                   | stype    | sseverity | semployeeId |
      | My incident | My description | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Incidents form is submitted
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And click 'submit' button in 'Incidents menu'

    Examples:
      | sname   | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | EJEMPLO | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |

  Scenario Outline: Verify creation of incident
    Given Enter 'Create an incident' form information
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And click 'submit' button in 'Incidents menu'
    Then verify incident item exist in 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |

    Examples:
      | sname          | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | Injury by fire | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |
