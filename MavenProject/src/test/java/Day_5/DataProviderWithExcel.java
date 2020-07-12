package Day_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderWithExcel {
        public WebDriver driver;
        public WebDriverWait wait;
        String appURL = "https://www.linkedin.com/";

        //Locators
        private By byEmail = By.id("session_key-login");
        private By byPassword = By.id("session_password-login");
        private By bySubmit = By.id("signin");
        private By byError = By.id("global-alert-queue");

        @BeforeClass
        public void testSetup() {
            System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 5);
        }


        @Test(dataProvider="empLogin")
        public void VerifyInvalidLogin(String userName, String password) {
            driver.navigate().to(appURL);
            System.out.println("UserName:"+userName);
            System.out.println("Password:"+password);
        }

        @DataProvider(name="empLogin")
        public Object[][] loginData() {
            Object[][] arrayObject = getExcelData("D:/Training/SeleniumTraining_Pawan/MavenProject/src/test/java/Day_5/sampledoc.xls","Sheet2");
            return arrayObject;
        }


        public String[][] getExcelData(String fileName, String sheetName) {
            String[][] arrayExcelData = null;
            try {
                FileInputStream fs = new FileInputStream(fileName);
                Workbook wb = Workbook.getWorkbook(fs);
                Sheet sh = wb.getSheet(sheetName);

                int totalNoOfCols = sh.getColumns();
                int totalNoOfRows = sh.getRows();

                arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

                for (int i= 1 ; i < totalNoOfRows; i++) {

                    for (int j=0; j < totalNoOfCols; j++) {
                        arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                e.printStackTrace();
            } catch (BiffException e) {
                e.printStackTrace();
            }
            return arrayExcelData;
        }

        @Test
        public void tearDown() {
            driver.quit();
        }
    }

