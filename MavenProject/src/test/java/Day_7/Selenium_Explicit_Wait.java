package Day_7;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.Test;
public class Selenium_Explicit_Wait {


        protected WebDriver driver;
        @Test
        public void explicitWaits() throws InterruptedException
        {
            System.setProperty ("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe" );
            driver = new ChromeDriver();
            WebDriverWait wait=new WebDriverWait(driver, 20);
            String eTitle = "Demo Guru99 Page";
            String aTitle = "" ;
            // launch Chrome and redirect it to the Base URL
            driver.get("http://demo.guru99.com/test/guru99home/" );
            //Maximizes the browser window
            driver.manage().window().maximize() ;
            //get the actual value of the title
            aTitle = driver.getTitle();
            //compare the actual title with the expected title
            if (aTitle.contentEquals(eTitle))
            {
                System.out.println( "Test Passed") ;
            }
            else {
                System.out.println( "Test Failed" );
            }
            WebElement guru99seleniumlink;
            guru99seleniumlink= wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//a[contains(.,'Books to Read')]")));

            //Object element = driver.Xpath("//a[contains(.,'Books to Read')]");
            WebElement ele = driver.findElement(By.xpath("//a[contains(.,'Books to Read')]"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].click()", ele);
        }

    }
