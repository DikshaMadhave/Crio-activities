package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshowurl extends TestCases {

    ChromeDriver driver;

    public void testCase02()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase02");

        // Navigate to URL  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Locate the locator for hyperlink by using  Using Locator "Tag Name" a
        //driver.findElementByTagName("a");
        // Get count of the hyperlinks Using Locator "Tag Name" a
        int count = driver.findElementsByTagName("a").size();
        System.out.println(count);
        System.out.println("End Test case: testCase02");
    }
    
}
