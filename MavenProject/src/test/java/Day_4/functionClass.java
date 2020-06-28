package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class functionClass {

    public boolean verfiySummation(WebDriver wbDriver) {

        System.out.println("**********************************************************************");
        System.out.println("In verfify Input Box");
        System.out.println("**********************************************************************");
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

        return true;
    }

    public boolean verifyTable(WebDriver wbDriver)
    {
        System.out.println("**********************************************************************");
        System.out.println("In verify Table");
        System.out.println("**********************************************************************");
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/table-sort-search-demo.html");

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

        return true;

    }

    public boolean verifyTableRecordFilter(WebDriver wbDriver)
    {

        System.out.println("**********************************************************************");
        System.out.println("In verify Table Record Filter");
        System.out.println("**********************************************************************");
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/table-records-filter-demo.html");

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


        return true;

    }

    public boolean verifyCheckBoxDemo(WebDriver wbDriver)
    {

        System.out.println("**********************************************************************");
        System.out.println("In verify CheckBox Demo");
        System.out.println("**********************************************************************");
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // wbDriver.findElement(By.xpath("//*[@id='at-cv-lightbox-button-holder']/a[2]")).click();
        wbDriver.findElement(By.id("isAgeSelected")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ///
        if (wbDriver.findElements(By.id("txtAge")).size()!=0)
        {
            System.out.println("first validation passed");
        }
        else
        {
            System.out.println("first validation Failed");
        }

        //Click on Check All
        wbDriver.findElement(By.id("check1")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Verify the Button Text
        String btnText= wbDriver.findElement(By.id("check1")).getAttribute("value");

        if (btnText.equalsIgnoreCase("Uncheck All"))
        {
            System.out.println("second validation passed");
        }
        else
        {
            System.out.println("second validation Failed");
        }


        //Uncheck first element
        wbDriver.findElement(By.className("cb1-element")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }


    public boolean ListboxDemo(WebDriver wbDriver)
    {

        System.out.println("**********************************************************************");
        System.out.println("In verify DropDown Demo");
        System.out.println("**********************************************************************");
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

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

        return true;

    }

    public  boolean RadioButtonDemo(WebDriver wbDriver)
    {

        System.out.println("**********************************************************************");
        System.out.println("In verify Radio button Demo");
        System.out.println("**********************************************************************");
        wbDriver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

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
        return true;
    }
}

