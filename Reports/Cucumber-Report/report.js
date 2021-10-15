$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/org/features_files/shopping.feature");
formatter.feature({
  "line": 1,
  "name": "Online E-Commerces Shopping Site",
  "description": "",
  "id": "online-e-commerces-shopping-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 40276200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Open The Site Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;open-the-site-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Appliction",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Move to Cursor Women Section",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Under Click Evening Dress and Navigate to dress page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Appliction()"
});
formatter.result({
  "duration": 13698613500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Move_to_Cursor_Women_Section()"
});
formatter.result({
  "duration": 517092800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Evening_Dress_and_Navigate_to_dress_page()"
});
formatter.result({
  "duration": 3597901100,
  "status": "passed"
});
formatter.before({
  "duration": 138900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Evening Dress Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;evening-dress-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user Move to Cursor Dress Item",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user Click On More Button and Navigate to Printed dress page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_to_Cursor_Dress_Item()"
});
formatter.result({
  "duration": 473567500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_More_Button_and_Navigate_to_Printed_dress_page()"
});
formatter.result({
  "duration": 3251689600,
  "status": "passed"
});
formatter.before({
  "duration": 3151600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Printed Dress Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;printed-dress-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user Enter a Quantity Value",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Select a \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Change the Color Item",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Click Add to Card Button and Click to Proceed to checkout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_a_Quantity_Value()"
});
formatter.result({
  "duration": 760277100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "Step_Definition.user_Select_a(String)"
});
formatter.result({
  "duration": 1158039500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Change_the_Color_Item()"
});
formatter.result({
  "duration": 239047100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Add_to_Card_Button_and_Click_to_Proceed_to_checkout_Button()"
});
formatter.result({
  "duration": 5204949200,
  "status": "passed"
});
formatter.before({
  "duration": 2961800,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Summary Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;summary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user Click to Proceed to checkout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_to_Proceed_to_checkout_Button()"
});
formatter.result({
  "duration": 30161220300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//a[@title\u003d\u0027Proceed to checkout\u0027])[2]\"}\n  (Session info: chrome\u003d94.0.4606.81)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-TG3D4HK\u0027, ip: \u0027192.168.236.158\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.81, chrome: {chromedriverVersion: 94.0.4606.41 (333e85df3c9b6..., userDataDir: C:\\Users\\spraks99\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:57970}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 024122fc89331ed04084c8594258579d\n*** Element info: {Using\u003dxpath, value\u003d(//a[@title\u003d\u0027Proceed to checkout\u0027])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Base.Class.Base_Class.clickElement(Base_Class.java:55)\r\n\tat org.step_definition.Step_Definition.user_Click_to_Proceed_to_checkout_Button(Step_Definition.java:119)\r\n\tat ✽.Then user Click to Proceed to checkout Button(src/test/java/org/features_files/shopping.feature:27)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "Login Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Enter a \"\u003cusername\u003e\" in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter a \"\u003cpassword\u003e\" in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Click to Sign in Button and Navigate to Order Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "online-e-commerces-shopping-site;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 38,
      "id": "online-e-commerces-shopping-site;login-page;;1"
    },
    {
      "cells": [
        "ram@123gmail.com",
        "sprksram123"
      ],
      "line": 39,
      "id": "online-e-commerces-shopping-site;login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3133700,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Login Page",
  "description": "",
  "id": "online-e-commerces-shopping-site;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Enter a \"ram@123gmail.com\" in Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter a \"sprksram123\" in Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Click to Sign in Button and Navigate to Order Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ram@123gmail.com",
      "offset": 14
    }
  ],
  "location": "Step_Definition.user_Enter_a_in_Username_Field(String)"
});
