$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Accessories.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Accessories feedback form",
  "description": "I want to test accessories feedback form and submit it sucessfully",
  "id": "accessories-feedback-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 32730035717,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Fillin the form and submit",
  "description": "",
  "id": "accessories-feedback-form;fillin-the-form-and-submit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "I am at the accessories page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I scrolled down to acessories section",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter values in the fields",
  "rows": [
    {
      "cells": [
        "First Name",
        "Email Address",
        "Whats your idea"
      ],
      "line": 29
    },
    {
      "cells": [
        "Vignesh",
        "vikiorton@gmail.com",
        "Test"
      ],
      "line": 30
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I checked the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I clicked on the send button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should see Thank you message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessoriesSteps.i_am_at_the_accessories_page()"
});
formatter.result({
  "duration": 1352396986,
  "status": "passed"
});
formatter.match({
  "location": "AccessoriesSteps.i_scrolled_down_to_acessories_section()"
});
formatter.result({
  "duration": 7256135388,
  "status": "passed"
});
formatter.match({
  "location": "AccessoriesSteps.i_enter_values_in_the_fields(Credentials\u003e)"
});
formatter.result({
  "duration": 3337554996,
  "status": "passed"
});
formatter.match({
  "location": "AccessoriesSteps.i_checked_the_checkbox()"
});
formatter.result({
  "duration": 492546431,
  "status": "passed"
});
formatter.match({
  "location": "AccessoriesSteps.i_clicked_on_the_send_button()"
});
formatter.result({
  "duration": 481867626,
  "status": "passed"
});
formatter.match({
  "location": "AccessoriesSteps.i_should_see_Thank_you_message()"
});
formatter.result({
  "duration": 221026854,
  "status": "passed"
});
formatter.after({
  "duration": 1225239283,
  "status": "passed"
});
});