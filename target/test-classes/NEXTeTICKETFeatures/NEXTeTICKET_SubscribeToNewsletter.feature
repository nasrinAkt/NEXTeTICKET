Feature: This is a feature for subscribe to newsletter functionality creation


@Next1
Scenario: Verify Subscribe To Newsletter display in Home page footer
Given Open Application <"URL">
Then Scroll down till Subscribe To Newsletter
Then Verify Subscribe To Newsletter display in Home page footer

@Next2
Scenario: Verify Email field display under Subscribe To Newsletter  
Given Open Application <"URL">
Then Scroll down till Subscribe To Newsletter
Then Verify Email field display under Subscribe To Newsletter  

@Next3
Scenario: Verify Send button display under Subscribe To Newsletter
Given Open Application <"URL">
Then Scroll down till Subscribe To Newsletter
Then Verify Send button display under Subscribe To Newsletter
    
@Next4
Scenario: Verify Success massage(Your submission was successful) display when send with email
Given Open Application <"URL">
Then Scroll down till Subscribe To Newsletter
Then Enter valid Email
Then Click Send button
Then Verify Success massage(Your submission was successful) display when send with email

@Next5
Scenario: Verify Error massage(Please fill out this field) display when send without email
Given Open Application <"URL">
Then Scroll down till Subscribe To Newsletter
Then Keep Email field blank
Then Click Send button
Then Verify Error massage(Please fill out this field) display when send without email




