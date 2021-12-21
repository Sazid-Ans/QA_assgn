@RunAll
Feature: assignment by pooja on QA testing

  @scenario01
  Scenario: Open Google Page and search for selenium and open first page
    Given open google search home page
    And locate search box and type selenium
    Then press google search button
    When results appear click on the first link
    Then verify the page which opens

  @scenario02
    Scenario: Open Google page and open Gmail
              try login with invalid username and password and capture error displayed.
       Given open google search home page
      Then locate gmail link and click
    When user clicks on sign_in link
      Then locate username editbox and put correct username
      Then click next button
      When password editbox comes put wrong password
      Then verify login and print the error message

  #@scenario03
      #Scenario: Open Google page and click on google apps find You tube
        #Given open google search home page
        #Then locate google app button and click
        #Then locate youtube link and click
        #When youtube page page opens verify it

  #@scenario04
        #Scenario: : Open Google page and click on Google apps find google maps
          #Then locate google app button and click
          #Then locate google_maps and click
         #When google_maps opens verify it

