$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/TESTING/SELENIUM/WORKSPACE/BDDMVN21Art/Features/Ptest.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook projects",
  "description": "",
  "id": "facebook-projects",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Facebook logins",
  "description": "",
  "id": "facebook-projects;facebook-logins",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Enter username and passwords",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "prasads2209@gmail.com",
        "Metlife@F"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLogin.Enter_username_and_passwords(DataTable)"
});
formatter.result({
  "duration": 17344817600,
  "status": "passed"
});
});