import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

    public static void main (String args[])
    {
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");

        //Instantiate a intance of interface Webdriver

        // WebDriver webDriver = new WebDriver();
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        wbDriver.close();

    }
}
