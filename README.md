# App-Automation-on-Google-Calculator-with-Selenium-Appium

## Scenerio
- Sum of 2 numbers (9+5=14)
- Subtraction of 2 numbers (8-3=5)
- multiplied of Result of Sum and Subtraction (14*5=70)
- Divided the result of multiplication with 10 (70/10=7)
- Solved this series (100+200-100*2/5)

## Technology and Tool Used
- Selenium Webdriver
- Android Studio
- Appium
- Intellij
- Appium Inspector
- Gradle
- Java

## How to run this project:
- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration
- Hit this command in cmd for checking the connectivity with emulator : adb devices
- Open Appium Server with following command: appium -p 4723
- Open Appium Inspector
- Open Intellij Idea
- Hit the following command into the terminal: gradle clean test
- For generating Allure Report use these commands: allure generate allure-results --clean -o allure-report and allure serve allure-results

## Prerequisites:
- Install Android Studio latest version
- Install Appium Inspector
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME

## Allure Report Screenshots:
![1](https://user-images.githubusercontent.com/96409251/228184791-e090eb64-6586-4cda-bc39-5b5d3321c5f8.png)
![2](https://user-images.githubusercontent.com/96409251/228184972-46e03ee0-a795-4726-823a-30606f6c07c9.png)
![3](https://user-images.githubusercontent.com/96409251/228185040-a1679cbe-17fc-4aa1-8ffd-93e9c86249ab.png)

## Gradle report Screenshots:
![4](https://user-images.githubusercontent.com/96409251/228185358-35303518-e3a7-4333-9701-a346969460d7.png)
