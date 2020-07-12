package Day_5;

import Day_4.functionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNgAdvanceExample {

    public WebDriver wbDriver;

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("In beforeSuite");
    }


    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("In AfterSuite");
    }
    @BeforeClass
    public void setWEbdriver()
    {
        System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
        wbDriver = new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/");
        wbDriver.manage().window().maximize();
    }

    @Test
    public void runTest()
    {
       System.out.println("In the test method");
    }

    @AfterClass
    public void closeWEbdriver()
    {
       wbDriver.close();
    }

}
