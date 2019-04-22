Feature: Add to Cart

  Scenario: Puma's home page is displayed in Soccer men section
    Given 'Puma' page is loaded
    And Hover over 'HOMBRE' menu item in 'Header' menu
    And Click over 'Futbol' menu item inside 'TENIS' menu item section
    And Get price of 'Calzado de Fútbol X 18.3 TF'
