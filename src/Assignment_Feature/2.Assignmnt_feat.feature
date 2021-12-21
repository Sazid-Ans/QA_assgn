Feature:
  @scenario03
  Scenario: Open Google page and click on google apps find You tube
    Given open google search home page
    Then locate google app button and click
    Then locate youtube link and click
    When youtube page page opens verify it

  @scenario04
  Scenario: : Open Google page and click on Google apps find google maps
    Given open google search home page
    Then locate google app button and click
    Then locate google_maps and click
    When google_maps opens verify it

    Scenario: dryrun
      Given open google search home page
      Then open google maps