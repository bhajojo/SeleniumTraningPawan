package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGExample {

    public WebDriver wbDriver;
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
        functionClass rc= new functionClass();
        rc.verfiySummation(wbDriver);
        rc.verifyTable(wbDriver);
        rc.ListboxDemo(wbDriver);
        rc.verifyCheckBoxDemo(wbDriver);
        rc.verifyTableRecordFilter(wbDriver);
        rc.RadioButtonDemo(wbDriver);
    }



}
