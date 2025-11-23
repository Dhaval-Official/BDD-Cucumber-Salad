Feature: Search Functionality

  Background:
    Given User open app

  Scenario: Search for valid product
    When User enter valid product on search
    And User click on Search
    Then Valid product should appear

  Scenario: Search for Invalid product
    When User enter invalid product on search
    And User click on Search
    Then No Product should be displayed

  Scenario: Search without providing anything
    When User enter nothing
    And User click on Search
    Then Text should appear as nothing has searched