package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingListsMultipleSelect {

    @Test
    public void handleListElements()
    {
        System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver = new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/");
        wbDriver.manage().window().maximize();

        //Click on Button YEs
        wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();

        //
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        WebElement dropElement = wbDriver.findElement(By.id("multi-select"));

        Select dropdown = new Select(dropElement);

        dropdown.selectByIndex(1);

        dropdown.selectByValue("Florida");

        dropdown.selectByValue("Washington");

        //click on button

        wbDriver.findElement(By.id("printAll")).click();




    }
}
