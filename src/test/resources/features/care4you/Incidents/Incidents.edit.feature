Feature: Incident

  Background: Incidents form is displayed
    Given 'Care4You' page is loaded
    And click 'Incidents' tab in 'Header menu'
    And click 'Incidents' menu item in 'Incidents menu'
    #And click 'Edit an incident' button in first element of 'Incidents list'

  Scenario Outline: Edit specific incident
    Given click 'Edit an incident' button in one element of 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |

    Examples:
      | sname          | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | Injury by fire | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Incidents form is filled
    Given click 'Edit an incident' button in one element of 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And Enter 'Create an incident' form information
      | name               | description           | date                   | type     | severity | employeeId |
      | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH     | Juan Pinto |

    Examples:
      | sname          | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | Injury by fire | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Incidents form is submitted
    Given click 'Edit an incident' button in one element of 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And Enter 'Create an incident' form information
      | name               | description           | date                   | type     | severity | employeeId |
      | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH     | Juan Pinto |
    And click 'submit' button in 'Incidents menu'

    Examples:
      | sname          | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | Injury by fire | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |


  Scenario Outline: : Verify edition of incident
    Given click 'Edit an incident' button in one element of 'Incidents list'
      | name    | description    | date    | type    | severity    | employeeId    |
      | <sname> | <sdescription> | <sdate> | <stype> | <sseverity> | <semployeeId> |
    And Enter 'Create an incident' form information
      | name               | description           | date                   | type     | severity | employeeId |
      | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH     | Juan Pinto |
    And click 'submit' button in 'Incidents menu'
    Then verify incident item has been edited in 'Incidents list'
      | name               | description           | date                   | type     | severity | employeeId |
      | My incident EDITED | My description EDITED | Friday, April 19, 2019 | FRACTURE | HIGH     | Juan Pinto |
    Examples:
      | sname          | sdescription | sdate                   | stype    | sseverity | semployeeId |
      | Injury by fire | EJEMPLO      | Tuesday, April 16, 2019 | FRACTURE | HIGH      | Juan Pinto  |