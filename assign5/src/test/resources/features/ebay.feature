Feature: search action
    Description: This feature will test a search functionality

  Scenario: Login with valid username and password
    Given Open anybrowser of choice and navigate to ebay home page
    When User enters search input "<searchvalue>" in search box
    And user selects the category "<category>" of choice
    And Click on search button
    And print the result of the product
    And display nth product details
    And Print all the products in first page
    And print all the products along with scroll down
    Then User should able to see the search results
