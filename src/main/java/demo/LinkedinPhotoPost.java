package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinPhotoPost extends TestCases {

    ChromeDriver driver;
    public void testCase06()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase06");
        // Navigate to Linked in website  https://www.linkedin.com/home
        driver.get("https://www.linkedin.com/home");
        // Enter the email id to email textbox Using Locator "XPath" //input[@autocomplete="username"]
        driver.findElementByXPath("//input[@autocomplete='username']").sendKeys("abc@gmail.com");
        // Enter the password to the password field Using Locator "XPath" //input[@autocomplete="current-password"]
        driver.findElementByXPath("//input[@autocomplete='current-password']").sendKeys("abc123");
        // Click on the sign in button Using Locator "XPath" //*[@data-id='sign-in-form__submit-btn']
        driver.findElementByXPath("//*[@data-id='sign-in-form__submit-btn']").click();
        // Click on the photo option Using Locator "ID" //div[contains(@class,'share-box-feed-entry__closed')]//button[@aria-label='Add a photo']/span
        driver.findElementByXPath("//div[contains(@class,'share-box-feed-entry__closed')]//button[@aria-label='Add a photo']/span").click();
        // Click on done Using Locator "XPath" //*[text()='Done']
        driver.findElementByXPath("//*[text()='Done']").click();
        // Click on post button Using Locator "XPath" //*[text()='Post']
        driver.findElementByXPath("//*[text()='Post']").click();
        // Verify that "post successfl" message is displayed Using Locator "XPath" //*[text()='Post Successfull']
        boolean isDisplayed = driver.findElementByXPath("//*[text()='Post Successfull']").isDisplayed();
        System.out.println("Post is successfully displayed"+isDisplayed );
        System.out.println("end Test case: testCase06");

    }
    
}
