
Feature: To test add tariff plan functionality
 
  Scenario Outline: Add multiple tariff plan
    Given The user in add tariff plan page
    When The user fill in the plan details"<MR>","<FLM>","<FIM>","<FSP>","<LPM>","<IPM>","<SPC>"
    And The user submiths the form
    Then The user should see the success message

    Examples: 
    |MR |FLM|FIM|FSP|LPM|IPM|SPC|
    |100|100|300|200|200|900|200|
    |200|200|600|300|400|200|300|
    |300|200|200|100|500|300|700|
    |400|200|100|800|600|900|800|   
    