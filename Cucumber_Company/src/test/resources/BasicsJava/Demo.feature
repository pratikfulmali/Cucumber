Feature: Login Page

  Scenario Outline: To open login page
    Given To open login page on firefox
    When Enter <username> and <password>
    And Click on login page
    Then open home page

    Examples: 
      | username            | password |
      | admin@yourstore.com | admin    |
      | name2sdd            | anv      |
