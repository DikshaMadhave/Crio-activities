package demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames extends TestCases {

    ChromeDriver driver;
    public  void testCase07(){
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase07");

        // Navigate to the link  https://the-internet.herokuapp.com/nested_frames
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        System.out.println("Frame site loaded");
        // Navigate to the top frame Using Locator "Name" frame-top
        WebElement topFrame = driver.findElementByName("frame-top");
        driver.switchTo().frame(topFrame);

        // Get the size of all child frame  Using Locator "Tag Name" frame
        int frameSize = driver.findElementsByTagName("frame").size();

        // Switch to the child frame  
        // Print the text of the child frame  Using Locator "Tag Name" body
        // Switch to the parent frame  
        // Repeat the steps for all the child frame  
        for(int i =0; i<frameSize; i++)
        {
            driver.switchTo().frame(i);
            System.out.println(driver.findElementByTagName("body").getText());
            driver.switchTo().parentFrame();
        }

        // Switch to the default frame  
        driver.switchTo().defaultContent();
        // Switch to the bottom frame Using Locator "Name" frame-bottom
        driver.switchTo().frame(driver.findElementByName("frame-bottom"));
        // Print the text of the bottom frame Using Locator "Tag Name" //body
        System.out.println(driver.findElementByTagName("body").getText());
        // Switch to the default frame  
        driver.switchTo().defaultContent();
    
        System.out.println("end Test case: testCase07");
    }
    
}
