Feature:Register User
  @nima
  Scenario: User registration and account deletion
    Given I launch the browser
    When I navigate to "http://automationexercise.com"
    Then I verify that the home page is visible successfully
    When I click on the "Signup / Login" button
    Then I verify that "New User Signup!" is visible
    When I enter my "name" and "email address"
    And I click the "Signup" button
    Then I verify that "Enter Account Information" is visible
    When I fill in the required account details:
      | Title | Name | Email | Password | Date of birth |
      | Mr | John Smith | johnsmith@example.com | password | 01/01/1990 |
    And I select the "Sign up for our newsletter!" checkbox
    And I select the "Receive special offers from our partners!" checkbox
    And I fill in the following additional details:


      | First name | Last name | Company | Address | Address2 | Country | State | City | Zipcode | Mobile Number |
      | John | Smith | ABC Inc | Main St | Apt 101 | United States | California | LA | 90001 | 1234567890 |
    And I click the "Create Account" button
    Then I verify that "Account Created!" is visible
    When I click the "Continue" button
    Then I verify that "John Smith" is visible
    When I click the " Delete Account" button
    Then I verify that "Account Deleted!" is visible
    And I click the "Continue" button





