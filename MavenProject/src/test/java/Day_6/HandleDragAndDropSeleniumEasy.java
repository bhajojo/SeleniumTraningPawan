package Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandleDragAndDropSeleniumEasy {

    @Test
    public void HandleDragAndDrop()
    {

    System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        String URL = "https://www.seleniumeasy.com/test/drag-and-drop-demo.html";

        driver.get(URL);

        // It is always advisable to Maximize the window before performing DragNDrop action
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        //Actions class method to drag and drop
        Actions builder = new Actions(driver);

        WebElement from = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));

        WebElement to = driver.findElement(By.id("mydropzone"));
        //Perform drag and drop
        builder.dragAndDrop(from, to).perform();

        //verify text changed in to 'Drop here' box
//        String textTo = to.getText();

//        if(textTo.equals("Dropped!")) {
//            System.out.println("PASS: Source is dropped to target as expected");
//        }else {
//            System.out.println("FAIL: Source couldn't be dropped to target as expected");
//        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.close();

    }
}

