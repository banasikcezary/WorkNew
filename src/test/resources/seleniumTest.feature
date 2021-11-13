Feature: Shop
  Scenario: Choose phone with list
    Given Open browser and configuration
    When Go to tmobile website
    And Click on Devices
    And Click on Phone
    And Filter by smartwatches
    And Sort by price ascending
    And Add first element to basket
    And Open basket
    Then Assert "realme Watch 2 " in basket
    And Close browser