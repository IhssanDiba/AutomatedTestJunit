#Author: Ihssan Diba


@SmokeScenario
Feature: feature to test login functionality
  I want to use this template for my feature file

  @smoketest
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user navigated to the home page

