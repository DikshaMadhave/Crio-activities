package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class W3school extends TestCases {
    
    ChromeDriver driver;

    public void testCase08()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase08");
        // Navigate to W3school site  https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        // Switch to the result frame Using Locator "XPath" //iframe[@id='iframeResult']
        driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
        // Click on the try it button Using Locator "XPath" //button[text()='Try it']
        driver.findElementByXPath("//button[@onclick='myFunction()']").click();
        // Switch to the alert  
        // Get the text of the alert  
        String currentText = driver.switchTo().alert().getText();
        System.out.println(currentText);
        // Enter the new text to the alert 
        driver.switchTo().alert().sendKeys("Diksha");
        // Click on ok  
        driver.switchTo().alert().accept();
        // Verify that entered text is printed Using Locator "XPath" //body[@contenteditable='false']//p[@id='demo']
        String newText = driver.findElementByXPath("//body[@contenteditable='false']//p[@id='demo']").getText();
        System.out.println(newText);
        if(newText.contains("Diksha"))
        {
            System.out.println("Text matches to the entered text");
        }
        System.out.println("end Test case: testCase08");

    }
    
}
