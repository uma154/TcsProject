$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/freshfruits.feature");
formatter.feature({
  "name": "Open the Change2natural",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To buy the fresh fruits",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launching application on the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.to_launching_application_on_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on fresh fruits",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_fresh_fruits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Pomegranate",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_Pomegranate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Increase weight",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.increase_weight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Assert the price",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.assert_the_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on cart to check  the item",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_cart_to_check_the_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter email and password credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.enter_email_and_password_credentials()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d87.0.4280.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MLB-TRACFONE-PC\u0027, ip: \u0027192.168.174.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\MLB-TR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52850}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5fb3bcf6e42a3c1581ef0bf53f69a1c2\n*** Element info: {Using\u003did, value\u003demail}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.pages.C2nfreshFruits.C2N_username(C2nfreshFruits.java:56)\r\n\tat com.stepdefinitions.C2nFruits.enter_email_and_password_credentials(C2nFruits.java:74)\r\n\tat ✽.Enter email and password credentials(file:///C:/Users/MLB-Tracfone/eclipse2020-09-workspace/Change2Natural/src/test/resources/Feature/freshfruits.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on login",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefinitions.C2nFruits.click_on_login()"
});
formatter.result({
  "status": "skipped"
});
});