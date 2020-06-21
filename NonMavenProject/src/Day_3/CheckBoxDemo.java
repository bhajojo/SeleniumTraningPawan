package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxDemo {

    public static  void main( String args[]){
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();
        wbDriver.findElement(By.id("isAgeSelected")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ///
        if (wbDriver.findElements(By.id("txtAge")).size()!=0)
        {
            System.out.println("first validation passed");
        }
        else
        {
            System.out.println("first validation Failed");
        }

        //Click on Check All
        wbDriver.findElement(By.id("check1")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Verify the Button Text
        String btnText= wbDriver.findElement(By.id("check1")).getAttribute("value");

        if (btnText.equalsIgnoreCase("Uncheck All"))
        {
            System.out.println("second validation passed");
        }
        else
        {
            System.out.println("second validation Failed");
        }


        //Uncheck first element
        wbDriver.findElement(By.className("cb1-element")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wbDriver.close();

    }
}
