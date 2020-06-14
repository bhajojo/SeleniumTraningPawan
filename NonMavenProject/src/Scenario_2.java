import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Scenario_2 {

    public static  void main( String args[]){
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.xpath("//*[@id=\"example_filter\"]/label/input")).sendKeys("Gree");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(wbDriver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
        System.out.println(wbDriver.findElements(By.xpath("//table[@id='example']//tbody//td")).size());

        System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[1]")).getText());

        System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[1]")).getText());


        System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText());

        System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText());


        wbDriver.close();

    }
}
