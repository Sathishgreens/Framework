Feature: Testing Login Results

  Scenario: Testing with invalid data
    Given Launching FaceBook URL
    When User Enters UserName and PassWorg
    And User Clicks Login
    Then Take Screenshot of result
