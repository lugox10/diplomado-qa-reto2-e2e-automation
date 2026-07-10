Feature: Flujo E2E de compra en SauceDemo

  Background:
    Given el usuario abre la aplicación
    And inicia sesión con credenciales válidas

  Scenario: Comprar dos productos exitosamente
    When agrega los productos "Sauce Labs Backpack" y "Sauce Labs Bike Light"
    And va al carrito
    And inicia el checkout con datos válidos
    Then la compra debe finalizar exitosamente

  Scenario: Ordenar productos por precio
    When ordena los productos por "Price (low to high)"
    Then los productos deben quedar ordenados por precio