Feature: Add to Cart

  Scenario: Adidas home page is displayed in Soccer men section
    Given 'Adidas' page is loaded
    And Hover over 'HOMBRE' menu item in 'Header' menu
    And Click over 'Futbol' menu item inside 'TENIS' menu item section
    And Get price of 'Calzado de Fútbol X 18.3 TF'
    And Click over 'Calzado de Fútbol X 18.3 TF' card item
    And Click over 'ELIGE TU TALLA' select
    And Click over 'MX 9.5' select option from 'ELIGE TU TALLA' select
    And Click over 'Add to car' button from main preview
    Then Verify quantity value is "Cantidad: 1" from cart modal
    And Click over 'VER CARRITO' link from cart modal
    Then Verify "Calzado de Fútbol X 18.3 TF" title is displayed in card
    Then Verify quantity value is "1 producto" in request summarize
    Then Verify stored product price is "$1,329" like request summarize
    Then Verify total product price is "$1,329.00" in request summarize
    Then Verify total final price is "$1,428.00" in request summarize