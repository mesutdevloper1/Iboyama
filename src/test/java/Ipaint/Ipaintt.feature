#Author: mstgltn1@gmail.com



Feature: Ipaint teknasyon


  Scenario: Without a subscription/non save paint

    Given user see "X" button
    And user click "X" button
    When wait "3" second
    And User see <homepage>
    And user swipe up
    Then user click no1 image
    And wait "2" second
    When user see "palette"
    Given user click Greencolor
    And user click x=50 y=60 screen
    Then user click "ok symbol"
    And user wait "10" second
    Given user click "X" button
    When user click "save" button
    And user wait "10" second
    Given user click "X" button
    And user swipe until see "no1 image"

