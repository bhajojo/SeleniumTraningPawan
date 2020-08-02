package Day_7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingException {

    protected WebDriver driver;
    @Test
    public void ImplicitWaitExample() throws InterruptedException
    {
        System.setProperty ("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        String eTitle = "Demo Guru99 Page";
        String aTitle = "" ;
        // launch Chrome and redirect it to the Base URL
        driver.get("http://demo.guru99.com/test/guru99home/" );
        //Maximizes the browser window
        driver.manage().window().maximize() ;
        //get the actual value of the title
        aTitle = driver.getTitle();
        //compare the actual title with the expected title
        if (aTitle.equals(eTitle))
        {
            System.out.println( "Test Passed") ;
        }
        else {
            System.out.println( "Test Failed" );
        }


        //driver.findElement(By.xpath("//a[contains(.,'Books to Read')]")).click();

        try {
            driver.findElement(By.xpath("//a[contains(.,'Books to Read')]")).click();
            //close browser
            driver.close();
        }catch (ElementClickInterceptedException e)
        {
            System.out.println("Inside Element Intercepted excecption");
            WebElement ele = driver.findElement(By.xpath("//a[contains(.,'Books to Read')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].click()", ele);
            //close~ browser
//            driver.close() ;
//
        }
    }
}

