$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginPage.feature");
formatter.feature({
  "name": "Validating login function of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@f1"
    }
  ]
});
formatter.scenarioOutline({
  "name": "validating login by invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user is on FB page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter incorrect \"\u003cuser\u003e\" and incorrect \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should validate Fb home page is available or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ]
    },
    {
      "cells": [
        "hijavaa",
        "javawelcomesyou"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating login by invalid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@f1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_on_FB_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter incorrect \"hijavaa\" and incorrect \"javawelcomesyou\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enter_incorrect_and_incorrect(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_is_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should validate Fb home page is available or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_validate_Fb_home_page_is_available_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});