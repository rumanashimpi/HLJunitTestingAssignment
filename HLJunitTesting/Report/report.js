$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Features/JavaScriptAlerts.feature");
formatter.feature({
  "name": "JavaScript Alerts verification",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify JS Alert OK Message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@rumana"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to url \"https://the-internet.herokuapp.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HLStepDefinitions.i_navigate_to_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click JavaScriptAlerts",
  "keyword": "When "
});
formatter.match({
  "location": "HLStepDefinitions.i_click_JavaScriptAlerts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to JavaSriptAlerts page",
  "keyword": "Then "
});
formatter.match({
  "location": "HLStepDefinitions.i_navigate_to_JavaSriptAlerts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click JS Alerts and click OK",
  "keyword": "When "
});
formatter.match({
  "location": "HLStepDefinitions.iClickJSAlertsAndClickOK()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the result \"You successfuly clicked an alert\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HLStepDefinitions.verifyTheResult(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});