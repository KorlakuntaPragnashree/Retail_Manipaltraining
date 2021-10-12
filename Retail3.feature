Feature: Forgot password

  Scenario: Forgot password
    Given Navigate to Retail application and Navigate to Account icon
    When User enter incorrect username or password
    And error message is displayed
    And Click on Forgotten password link
    And Enter Registered Email Address
    Then Confirmation message is displayed
