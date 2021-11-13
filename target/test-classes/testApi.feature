Feature: Test NBP
  Scenario: Check value NPB
    Given Set initial configuration
    When Pobierz kursy walut
    And Wyświetl kurs dla waluty o kodzie: "USD"
    And Wyświetl kurs dla waluty o nazwie: "dolar amerykański"
    And Wyświetl waluty o kursie powyżej: 5
    And Wyświetl waluty o kursie poniżej: 3
