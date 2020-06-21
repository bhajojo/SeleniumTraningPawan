package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Scenario_1 {

    public static  void main( String args[]){
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();
        wbDriver.findElement(By.partialLinkText("Input Forms")).click();
        wbDriver.findElement(By.partialLinkText("Simple Form Demo")).click();

        wbDriver.findElement(By.id("sum1")).sendKeys("19");
        wbDriver.findElement(By.id("sum2")).sendKeys("20");
        wbDriver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        System.out.println(wbDriver.findElement(By.cssSelector("#displayvalue")).getText());


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.close();

    }
}
