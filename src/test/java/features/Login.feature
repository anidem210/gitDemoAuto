Feature: Call Tab

  Background: 
    Given "Call" Tab Must be Selected
  
  @SmokeTest
  Scenario Outline: Add Numbers and Symbols to Find Input Field
     When Click on "<dialpad_key>" Button
     Then "<dialpad_key>" is displayed in "find" input field
  
    Examples: 
      | dialpad_key |  
      | 1           | 
      | 2           | 
      | 3           | 
      | 4           | 
      | 5           | 
      | 6           | 
      | 7           | 
      | 8           | 
      | 9           | 
      | *           | 
      | 0           | 
      | #           | 
      | +           | 
  
  @SanityTest @SmokeTest
  Scenario Outline: Make a Call to Unknown Numbers
      And "<number>" is not an account, contact or lead
     When Using "<dial_mode>", write "<number>" in the "find" input field
      And Click on "Call" Button
     Then Redirects to Outbound Call Screen Calling to "<outbound_number>"
  
    Examples: 
      | dial_mode              | number        | outbound_number | 
      | softphone dialpad      | +526622231410 | +526622231410   | 
      | keyboard number        | +526622290153 | +526622290153   | 
      | keyboard alphanumberic | +01800666HOLA | +018006664652   | 
  
  @SanityTest @SmokeTest
  Scenario Outline: Make a Call to Account/Contact/Lead
      And At least one "<type>" has been added
     When Write "<name>" in the "find" input field
      And Click on "<type>" Element
     Then Redirects to Outbound Call Screen Calling to "<number>"
  
    Examples: 
      | type    | name      | number | 
      | account | account 1 |+526622231420 | 
      | contact | contact 1 |+526622231410 | 
      | lead    | lead 1    |+526622231430 | 
  
  @SmokeTest
  Scenario: Make a Call to Previous Dial Number
      And At Least a Call Has Been Done
     #When Click on "Call" Button
     When Click at first "Call" Button
		  """
		  Must Appear the previous number dialed in the "find" input field
		  """
      And Click on "Call" Button
     Then Redirects to Outbound Call Screen Calling to "previous number dialed"
  
  @SmokeTest
  Scenario Outline: Enter Data in Find Input Field and Clear Data
     When Using "<dial_mode>", write "<number>" in the "find" input field
      And Click on "<button>" Button
     Then Input Field is Empty
  
    Examples: 
      | button       | dial_mode              | number        | outbound_number | 
      | X Clear      | softphone dialpad      | +526622231410 | +526622231410   | 
      | X Clear      | keyboard number        | +526622290153 | +526622290153   | 
      | X Clear      | keyboard alphanumberic | +01800666HOLA | +018006664652   | 
      | X Clear Icon | softphone dialpad      | +526622231410 | +526622231410   | 
      | X Clear Icon | keyboard number        | +526622290153 | +526622290153   | 
      | X Clear Icon | keyboard alphanumberic | +01800666HOLA | +018006664652   | 
  
  @SmokeTest
  Scenario Outline: Change Status in Available/Busy Button
      And "Available/Busy" Button Status is "<first_status>"
     When Click on "Available/Busy" Button
     Then "Available/Busy" Button Status is "<second_status>"
  
    Examples: 
      | first_status | second_status | 
      | Available    | Busy          | 
      | Busy         | Available     | 
  
  @SmokeTest
  Scenario Outline: Change Status in Close/Open Dialpad Buttons
      And "<first_status>" Button Status is "displayed"
     When Click on "<first_status>" Button
     Then "Dialpad" is "<second_status>"
      And "<first_status>" Button Status is "hidden"
  
    Examples: 
      | first_status  | second_status | 
      | Close Dialpad | hidden        | 
      | Open Dialpad  | displayed     | 
  
  @SmokeTest
  Scenario Outline: Change Status in None/Forward/Omniring Button
      And "None/Forward/Omniring" Button Status is "<first_status>"
     When Click on "None/Forward/Omniring" Button
     Then "None/Forward/Omniring" Button Status is "<second_status>"
  
    Examples: 
      | first_status | second_status | 
      | None         | Forward       | 
      | Forward      | Omniring      | 
      | Omniring     | None          | 
  
  @MobileTest
  Scenario: Navigate to CCio Voicemail
     When Click on "Voicemail" Button
     Then Redirects to "CloudCaller.io Voicemail "
  
  @SmokeTest
  Scenario: Navigate to Conference Call
     When Click on "Conference" Button
     Then Redirects to "Conference Call"
  
  @SmokeTest
  Scenario: Navigate to Call Recordings
     When Click on "Call Recordings" Button
     Then Redirects to "Call Recordings"
  
