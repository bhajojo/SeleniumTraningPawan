package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {

    public static  void main( String args[]){

        //Set the System Property
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");

        //Instantiate a intance of interface Webdriver

       // WebDriver webDriver = new WebDriver();
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();

        //Click on Checkbox male
        wbDriver.findElement(By.cssSelector("div:nth-child(4) > div.panel-body > label:nth-child(2) > input[type=radio]")).click();

        //Click on Get checked value button
        wbDriver.findElement(By.cssSelector("#buttoncheck")).click();

        String selText1= wbDriver.findElement(By.cssSelector("div:nth-child(4) > div.panel-body > p.radiobutton")).getText();

        if (selText1.contains("Female"))
        {
            System.out.println("Validation Passed");
        }
        else
        {
            System.out.println("Validation Failed");
        }


        wbDriver.findElement(By.cssSelector("div:nth-child(4) > div.panel-body > label:nth-child(3) > input[type=radio]")).click();
        wbDriver.findElement(By.cssSelector("#buttoncheck")).click();


        String selText= wbDriver.findElement(By.cssSelector("div:nth-child(4) > div.panel-body > p.radiobutton")).getText();
        if (selText.contains("Female"))
        {
            System.out.println("Validation Passed");
        }
        else
        {
            System.out.println("Validation Failed");
        }

        //Click on Check All
        wbDriver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(2) > input[type=radio]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.close();

    }
}
