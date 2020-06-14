import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Scenario_3 {

    public static  void main( String args[]){
        System.setProperty("webdriver.chrome.driver","D:/Training/chromedriver_win32/chromedriver.exe");
        WebDriver wbDriver= new ChromeDriver();
        wbDriver.get("https://www.seleniumeasy.com/test/table-records-filter-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wbDriver.findElement(By.xpath("//div[@class='btn-group']//button[1]")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(wbDriver.findElement(By.xpath("//table//tr[1]//td[3]")).getText());
        System.out.println(wbDriver.findElement(By.xpath("//table//tr[2]//td[3]")).getText());

        //System.out.println(wbDriver.findElement(By.xpath("//table//tr[5]//td[3]")).getText());


        //System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText());

        //System.out.println(wbDriver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText());


        wbDriver.close();

    }
}
