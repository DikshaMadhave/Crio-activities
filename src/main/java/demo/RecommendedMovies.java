package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecommendedMovies extends TestCases {

    ChromeDriver driver;
    
    public void testCase05()
    {
        this.driver = TestCases.testCases();
        System.out.println("Start Test case: testCase05");
        // Navigate to bookmyshow website  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Print the "Recommended Movies" image urls Using Locator "XPath" //*[text()='Recommended Movies']/../../../following-sibling::div//img
        WebElement recommendedMoviesElement = driver.findElementByXPath("//*[text()='Recommended Movies']/../../../following-sibling::div//img");
        int recommendedSize = driver.findElementsByXPath("//*[text()='Recommended Movies']/../../../following-sibling::div//img").size();
        for(int i=1; i<=recommendedSize; i++)
        {
            System.out.println(i +"  -  "+ recommendedMoviesElement.getAttribute("src"));
            System.out.println("\n");
        
        }

       // JavascriptExecutor.executeScript("arguments[0].scrollIntoView();",premiersList);
        // Find the premier list  Using Locator "XPath" //*[text()='Premieres']/../../../following-sibling::div//a
        List<WebElement> premiersList = driver.findElementsByXPath("//*[text()='Premieres']/../../../following-sibling::div//a");
        WebElement premiere = premiersList.get(1);

        // Print the name of the second item from the premier list Using Locator "XPath" //div[@class='sc-7o7nez-0 fyTNyu']
        String name = premiere.findElement(By.xpath("//div[@class='sc-7o7nez-0 fyTNyu']")).getText();
        System.out.println(name);

        // Print the language of the second item from the premier list Using Locator "XPath" //div[@class='sc-7o7nez-0 eeVqLW']
        String language = premiere.findElement(By.xpath("//div[@class='sc-7o7nez-0 eeVqLW']")).getText();
        System.out.println(language);
        System.out.println("end Test case: testCase05");
    }
}
