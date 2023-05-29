package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAmazon extends TestCases {

    ChromeDriver driver;
    
    public void testCase01()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com/");    
        // Click on search box Using Locator "Name" q
        driver.findElementByName("q").click();
        // Type in amazon search bar Using Locator "Name" q
        driver.findElementByName("q").sendKeys("amazon");
        // Click on google search button Using Locator "XPath" (//input[@value='Google Search'])[1]
        driver.findElementByXPath("(//input[@value='Google Search'])[1]").click();
        // Validate locator using xpath //h3[text()='Amazon.in']
        boolean isDisplayed = driver.findElementByXPath("//h3[text()='Amazon.in']").isDisplayed();
        System.out.println(isDisplayed);
        System.out.println("Start Test case: testCase01");

    }
}
