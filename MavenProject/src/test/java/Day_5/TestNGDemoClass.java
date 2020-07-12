package Day_5;

import org.testng.annotations.*;

public class TestNGDemoClass {

    @BeforeClass
    public void TestBeforeClass()
    {
        System.out.println("In method Before CLass");
    }

    @BeforeMethod
    public void TestBeforeTest()
    {
        System.out.println("In method Before Method");
    }

    @Test(priority=1)
    public void TestdemoExecution()
    {
        System.out.println("This is Test NG Demo: 1");
    }

    @Test(priority=2)
    public void TestdemoExecution1()
    {
        System.out.println("This is Test NG Demo:2 ");
    }

    @Test(priority=3)
    public void TestdemoExecution4()
    {
        System.out.println("This is Test NG Demo:3");
    }

    @Test(priority=4)
    public void TestdemoExecution3()
    {
        System.out.println("This is Test NG Demo:4");
    }


    @Test(priority=5)
    public void TestdemoExecution6()
    {
        System.out.println("This is Test NG Demo:5");
    }


    @AfterClass
    public void TestAfterClass()
    {
        System.out.println("In method After CLass");
    }

    @AfterMethod
    public void TestAfterTest()
    {
        System.out.println("In method after Method");
    }


}
