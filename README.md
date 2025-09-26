# 🚀 Selenium End-to-End Automation Framework – LambdaTest Playground

This project is a certification framework, developed for the LambdaTest Basic Certification. It automates an end-to-end workflow on the LambdaTest Selenium Playground
, implementing modern framework design patterns, reporting, and execution on cloud browsers.

## 🌐 End-to-End Workflow Automated

The following user journey was automated as part of the certification:

- Register a new user
- Login with the registered credentials
- Search for a record
- Validate the search results
- Logout
- Verify Logout is successful

## 🛠️ Tech Stack & Tools

- **Programming Language:** Java
- **Test Framework:** TestNG
- **Automation Tool:** Selenium WebDriver
- **Design Pattern:** Page Object Model (POM) with PageFactory
- **Build Tool:** Maven
- **Cloud Execution:** LambdaTest (cross-browser testing on Chrome, Firefox, and Edge)
- **Reports:** ExtentReports (with screenshots on failure)
- **Listeners:** TestNG custom listeners for logging and reporting
- **Additional Features:** Email reports, OOPS principles applied

## 📂 Framework Highlights

- ✅ **Page Object Model (POM):** Clean separation of test logic and page locators.
- ✅ **PageFactory:** Efficient initialization of web elements.
- ✅ **Listeners:** Captures logs, screenshots, and custom reporting.
- ✅ **ExtentReports:** Interactive HTML reports with detailed logs & screenshots.
- ✅ **Screenshots on Failures:** Auto-captured & embedded in reports.
- ✅ **Email Notifications:** Test summary sent after execution.
- ✅ **Cloud Execution (LambdaTest):** Same test suite executed across multiple browsers (Chrome, Firefox, Edge).

## ☁️ Cloud Execution on LambdaTest

All test cases were executed on LambdaTest Selenium Grid, ensuring scalability and cross-browser compatibility.
Each execution generated a unique session ID on LambdaTest.
Session IDs were shared with the LambdaTest team as certification proof.

🔑 Executed Test IDs (LambdaTest Cloud)

- APOUY-NPECU-ETBTS-YIDCT
- 8CYMB-9BFXA-A5VPO-VHSIG
- JWNUB-MRGOG-U6FGU-NBFM3

## 🖥️ **How to Run the Tests Locally**

Clone the repository:

- git clone https://github.com/pramesh01/Selenium-LambdaTest-Basic-Certification-Project.git
- cd Selenium-LambdaTest-Basic-Certification-Project


Install dependencies via Maven:

- mvn clean install

**Run tests locally:**

- mvn clean test

Alternative command to execute tests:

- mvn clean test -DskipTests=false

**For LambdaTest cloud execution, update your LambdaTest credentials in config.properties and run:**

- mvn test -Pcloud

## 📊 **Reports & Screenshots**

- ExtentReports are generated in the Reports/ directory.
- Failed test screenshots are auto-attached in the extent report.

## 📜 **Certification**

- This framework was submitted to LambdaTest as part of the Basic Level Certification.
- ✅ Successfully completed and certified by LambdaTest.

## 👨‍💻 **Author**
- Pramesh Kumar
- QA Automation | Selenium | Java | Docker | CI/CD | Cloud Testing