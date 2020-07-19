package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingLinks {

    @Test
    public void handleLinks()
    {
        System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver = new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/");
        wbDriver.manage().window().maximize();

        //Click on Button YEs
        wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();

        //Clikc on Links By Links TExt
        wbDriver.findElement(By.linkText("Input Forms")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.linkText("Date pickers")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.linkText("List Box")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.linkText("Others")).click();





    }
}
