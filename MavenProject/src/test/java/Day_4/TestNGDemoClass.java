package Day_4;

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
        System.out.println("In method Before Test");
    }

    @Test()
    public void TestdemoExecution()
    {
        System.out.println("This is Test NG Demo: 1");
    }

    @Test()
    public void TestdemoExecution1()
    {
        System.out.println("This is Test NG Demo:2 ");
    }

    @Test()
    public void TestdemoExecution3()
    {
        System.out.println("This is Test NG Demo:3");
    }


    @AfterClass
    public void TestAfterClass()
    {
        System.out.println("In method After CLass");
    }

    @AfterMethod
    public void TestAfterTest()
    {
        System.out.println("In method after Test");
    }


}
