Feature: Email repository

  In order to store email and repository name
  By request
  I should store email and repository idempotent

  Scenario: Store new email and repository pair
    When User save some random email and repository
    Then Pair are sored

  Scenario: Do not store the same email and repository pair
    When User save some random email and repository
    And Pair are sored
    Then Do not save the same email and repository

