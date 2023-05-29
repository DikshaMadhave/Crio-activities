package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    static ChromeDriver driver;
    public static ChromeDriver testCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(60).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void callMethods()
    {
        SearchAmazon searchAmazon = new SearchAmazon();
        searchAmazon.testCase01();

        Bookmyshowurl bookmyshowurl = new Bookmyshowurl();
        bookmyshowurl.testCase02();

        LinkedinPost linkedinPost = new LinkedinPost();
        linkedinPost.testCase03();

        GoogleSearch googleSearch = new GoogleSearch();
        googleSearch.testCase04();

        RecommendedMovies recommendedMovies = new RecommendedMovies();
        recommendedMovies.testCase05();

        LinkedinPhotoPost linkedinPhotoPost = new LinkedinPhotoPost();
        linkedinPhotoPost.testCase06();

        NestedFrames nestedFrames = new NestedFrames();
        nestedFrames.testCase07();

        
        W3school w3school = new W3school();
        w3school.testCase08();


        ImdbRating imdbRating = new ImdbRating();
        imdbRating.testCase09();


    }

}
