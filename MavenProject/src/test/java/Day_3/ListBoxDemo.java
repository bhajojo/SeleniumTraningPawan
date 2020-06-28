package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxDemo {

    public static  void main( String args[]){

        //Set the System Property
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");

        //Instantiate a intance of interface Webdriver

        // WebDriver webDriver = new WebDriver();
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();

        //Click on List box
        wbDriver.findElement(By.cssSelector("#select-demo")).click();

        //Select Tuesday
        wbDriver.findElement(By.cssSelector("#select-demo > option:nth-child(4)")).click();

        String selText1= wbDriver.findElement(By.cssSelector("div:nth-child(4) > div.panel-body > p.selected-value")).getText();

        if (selText1.contains("Monday"))
        {
            System.out.println("Validation Passed");
        }
        else
        {
            System.out.println("Validation Failed");
        }


        wbDriver.findElement(By.cssSelector("#multi-select > option:nth-child(1)")).click();
        wbDriver.findElement(By.cssSelector("#multi-select > option:nth-child(2)")).click();
        wbDriver.findElement(By.cssSelector("#multi-select > option:nth-child(4)")).click();
        wbDriver.findElement(By.cssSelector("#printAll")).click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wbDriver.close();

    }
}
