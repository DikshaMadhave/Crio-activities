package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinPost extends TestCases {

    ChromeDriver driver;

    public void testCase03()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase03");
        // Navigate to Linked in website  https://www.linkedin.com/home
        driver.get("https://www.linkedin.com/home");
        // Enter the email id to email textbox Using Locator "XPath" //input[@autocomplete='username']
        driver.findElementByXPath("//input[@autocomplete='username']").sendKeys("abc@gmail.com");
        // Enter the password to the password field Using Locator "XPath" //input[@autocomplete='current-password']
        driver.findElementByXPath("//input[@autocomplete='current-password']").sendKeys("abc123");
        // Click on the sign in button Using Locator "XPath" //*[@data-id='sign-in-form__submit-btn']
        driver.findElementByXPath("//*[@data-id='sign-in-form__submit-btn']").click();
        // Print the count of "Whos viewd your profile" using Locator "Xpath" //*[contains(text(),'viewed your profile')]/../../following-sibling::div/span/strong
        System.out.println("Whos viewd your profile "+ driver.findElementByXPath("//*[contains(text(),'viewed your profile')]/../../following-sibling::div/span/strong"));
        // Print the count of " Impression of your post" using Locator "Xpath" //*[text()='Impressions of your post']/../../following-sibling::div/span/strong
        System.out.println("Impressions of your post"+ driver.findElementByXPath("//*[text()='Impressions of your post']/../../following-sibling::div/span/strong"));
        // Click on Start a post button Using Locator "XPath" //span[text()='Start a post']
        driver.findElementByXPath("//span[text()='Start a post']").click();
        // Click on dropdown to change post visibility option Using Locator "XPath" //button[contains(@aria-label,'Post visibility options')]
        driver.findElementByXPath("//button[contains(@aria-label,'Post visibility options')]").click();
        // Select connections only options Using Locator "ID" CONNECTIONS_ONLY
        driver.findElementById("CONNECTIONS_ONLY").click();
        // Click on save button Using Locator "XPath" //div[@class='share-box-footer__main-actions']/button/span[text()='Save']
        driver.findElementByXPath("//div[@class='share-box-footer__main-actions']/button/span[text()='Save']").click();
        // Type message in textbox  Using Locator "XPath" //div[@role='textbox']
        driver.findElementByXPath("//div[@role='textbox']").sendKeys("Test post");
        // Click on post button Using Locator "XPath" //*[text()='Post']
        driver.findElementByXPath("//*[text()='Post']").click();
        // Verify that "post successfl" message is displayed Using Locator "XPath" //*[text()='Post Successfull']
        boolean isDisplayed = driver.findElementByXPath("//*[text()='Post Successfull']").isDisplayed();
        System.out.println("Post is successfully displayed"+isDisplayed );
        // Click on View post to view Using Locator "XPath" //*[text()='View Post']
        driver.findElementByXPath("//*[text()='View Post']").click();
        System.out.println("end Test case: testCase03");
    }
    
}
