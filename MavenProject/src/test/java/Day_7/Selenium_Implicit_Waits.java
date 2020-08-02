package Day_7;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Implicit_Waits {

        protected WebDriver driver;
        @Test
        public void ImplicitWaitExample() throws InterruptedException
        {
            System.setProperty ("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe" );
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
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
            //close browser
            driver.close();
        }
    }

