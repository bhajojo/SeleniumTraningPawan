package Day_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Calendar;

public class RunnerClass {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver = new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/");
        wbDriver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Call Verify Summation
        functionClass callFunction = new functionClass();
        callFunction.verfiySummation(wbDriver);

        //Call verify Table
        callFunction.verifyTable(wbDriver);

        //call Table records filter
        callFunction.verifyTableRecordFilter(wbDriver);

        //Call checkbox Demo
        callFunction.verifyCheckBoxDemo(wbDriver);

        //Call ListBox Demo
        callFunction.ListboxDemo(wbDriver);

        //Call RadiButtonsDemo
        callFunction.RadioButtonDemo(wbDriver);


    }

}
