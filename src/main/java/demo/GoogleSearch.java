package demo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch extends TestCases {

    ChromeDriver driver;
    public void testCase04()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase04");
        // Navigate to Google website  www.google.com
        driver.get("https://www.google.com/");
        // Enter the name in the search box Using Locator "Name" q
        driver.findElementByName("q").sendKeys("Diksha");
        // Click on the enter button  
        driver.findElementByName("q").sendKeys(Keys.ENTER);
        // Find the number of links with the name entered in the search box Using Locator "Partial Link Text" 
        int count = driver.findElementsByPartialLinkText("Diksha").size();
        // Print the size of the links  
        System.out.println(count);
        System.out.println("end Test case: testCase04");
    }
    
}
