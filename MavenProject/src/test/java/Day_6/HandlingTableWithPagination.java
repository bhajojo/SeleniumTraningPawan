package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingTableWithPagination {

    @Test
    public void handleTableWithPagination()
    {
        System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver = new ChromeDriver();
        wbDriver.get("https://money.rediff.com/mutual-funds");
        wbDriver.manage().window().maximize();

        List<WebElement> ListElement = wbDriver.findElements(By.xpath(("//*[@id=\"MFSearch\"]/table/tbody/tr/td[1]/table//tr")));
        System.out.println(ListElement.get(0).getText());
        System.out.println(ListElement.size());

        for (int iCounter = 1 ; iCounter <=ListElement.size()-1 ; iCounter++)
        {
            System.out.println(wbDriver.findElement(By.xpath(("//*[@id=\"MFSearch\"]/table/tbody/tr/td[1]/table//tr["+iCounter+"]//td[1]//a"))).getText());
        }
    }

}
