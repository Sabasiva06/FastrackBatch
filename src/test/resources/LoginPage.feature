@f1
Feature: Validating login function of facebook application

  @reg
  Scenario Outline: validating login by invalid username and invalid password
    Given user is on FB page
    When user enter incorrect "<user>" and incorrect "<password>"
    And user is click login button
    Then user should validate Fb home page is available or not

    Examples: 
      | user    | password        |
      | hijavaa | javawelcomesyou |

  @smoke @reg
  Scenario Outline: validating login by invalid username and invalid password
    Given user is on FB page
    When user enter incorrect "<user>" and incorrect "<password>"
    And user is click login button
    Then user should validate Fb home page is available or not

    Examples: 
      | user    | password        |
      | hijavaa | javawelcomesyou |

  @sanity
  Scenario Outline: validating login by invalid username and invalid password
    Given user is on FB page
    When user enter incorrect "<user>" and incorrect "<password>"
    And user is click login button
    Then user should validate Fb home page is available or not

    Examples: 
      | user    | password        |
      | hijavaa | javawelcomesyou |

  @reg
  Scenario Outline: validating login by invalid username and invalid password
    Given user is on FB page
    When user enter incorrect "<user>" and incorrect "<password>"
    And user is click login button
    Then user should validate Fb home page is available or not

    Examples: 
      | user    | password        |
      | hijavaa | javawelcomesyou |

  @retest
  Scenario Outline: validating login by invalid username and invalid password
    Given user is on FB page
    When user enter incorrect "<user>" and incorrect "<password>"
    And user is click login button
    Then user should validate Fb home page is available or not

    Examples: 
      | user    | password        |
      | hijavaa | javawelcomesyou |
