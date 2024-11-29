# Guest Registration Web Form Automation Using Junit

## Overview
In this project, it demonstrates how to automate the submission of a form. The form is available on this site:(https://demo.wpeverest.com/user-registration/guest-registration-form/). The automation process covers different kinds of webelements such as input fields, date picker , drop down menu , checkbox , radio button, submit button and a successful submission message. To automate this project, you need knowledge of Selenium WebDriver to interact with web elements (input fields, date picker,dropdown menu, etc.) and the JUnit framework


## Elements of the Form 

- Name input field
- Phone number input Field
- Email imput field
- User Password Field
- Radio Buttons
- Date picker
- Nationality input field
- Choosing country from dropdown menu
- Mandatory Checkbox
- Submit Button

## Essentials for automation
- Chromedriver
- Java
- Selenium Webdriver
- Junit Framework

## Automation Process Overview
To automate the form filling, the findElements and findElement methods are used. These methods are utilize to locate such as id, cssSelector, and className to interact with web elements, "sendkeys()" method also used for passing the value for interction. The "Thread.sleep()" method is also called to pause the execution for 2000 ms. The "click()" method is used to click the buttons, radio button. JavaScript Executor is also used for date picker.For assertion, the "getText()" method is used to retrieve the text and verify if the actual text matches the expected text ("User successfully registered."). The comparison is done using the assertEquals() method.
"driver.quit()" method used for totally terminate the browser after the completion of automation

## Report:
- Need to use gradle for creating the report.
- For installation in this project Binary only file is used
- Report shows the success rate of the test
- Used the "gradle clean test" command for creating the test report.

  ![Assignment_Junit_Bonus](https://github.com/user-attachments/assets/04980593-1616-4ef2-9b78-9bcd7d0023ef)

## Recorded Video Using Screen recoder

https://github.com/user-attachments/assets/6bd504a9-f522-4473-a348-df2803a7f186

