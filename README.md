# DistilledQATask
**Total Test Cases- 14. Passed=14    Failed=0.**
This project is a Page-Object Model created for Distilled QA position task.
#**Structure**
The basic project structure comprises of three page classes and three test classes. The three classes- HomePage.java, CountyResultPage.java and KeywordFilteredPage.java consists of test code from each of them respectively.
The three page classes contain the Object Repository andf the test methods for the respective pages. The three test classes comprise of the tests and call the methods defined in the page classes.
Apart from these six classes, we have the testng.xml file which comprises of all the configurations for running the tests and listeners for extent report generation.We have the pom.xml for all the maven dependency definitions.

HompePageTest-
1. Test Case1- homePageTitleTest- This test case is for validating the title of the daft.ie homepage.
2. Test Case2- provideConsentClickTest- This test case is for clicking on the 'Agree' button for the data policy.
3. Test Case3- enterSearchLocation- This test case is for clicking on the search box in the home-page and entering the text-" Dublin(county)" for filtering county specific adverts.
4. Test Case4- islistBoxDisplayed- This test case is to check is the list box suggesting the county names is displayed after typing in the county name..
5. Test Case5- listBoxClick- This test case is for clicking on the listbox after typing in the county name.

CountyResultPageTest-
6. Test Case6- countyResult- This test case is to verify the search results of the county name entered.
7. Test Case7- testCountySearchResultsCount- this test case is for counting the number of adverts from the search results for Dublin County.
8. Test Case8- scrollToSearchResults- This test case is for viewing the test results and scrolling down the page.
9. Test Case9- scrollToTop- this test case is for scrolling to the top of the webpage to see and click the Filter icon.
10. Test Case10- scrollToBottom- This test case is for scrolling to the bottom of the filter panel to be able to enter the "garage" text in the keyword input box.
11. Test Case11- applyKeywordFilter- This test case is for entering the "garage" text in the keyword input box and then click on the "ShowResultButton".

KeywordFilteredPageTest.java

12. Test Case12- keywordFilteredResult- This test case is to verify if the results are displayed after applying the filter "garage".
13. Test Case13 clickOnKeywordResults- This test case is to click and open any result from the filtered results containg the word "garage".
14. Test Case14- isGaragePresentInAdvert- this test case is to verify if the word "garage" is present in the advert description and if not assertion would fail.

**Report Generation**-
For report generation, we have two reports- Extent report and the testng report. A snippet of the Extent report is as follows-

![image](https://github.com/ankit0509-tech/DistilledQATask/assets/85782356/445993d7-ab8f-4a57-84ca-b7188af01dff)


**CI/CD**
The CI-CD pipeline is configured in the .yml file under workflows folder.

Running the Project-
1.Clone the repository
2.Set up the project in your local editor.
3. Run the testng.xml file and for reports view the test-output folder.
