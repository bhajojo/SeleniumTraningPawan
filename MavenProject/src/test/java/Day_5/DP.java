package Day_5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DP
{
    @DataProvider (name = "customer")
    public Object[][] dpMethod(){
        return new Object[][] {{"Customer1"}, {"Customer2"} , {"Customer3"}};
    }

    @DataProvider (name = "Supplier")
    public Object[][] dpMethod1(){
        return new Object[][] {{"Value Passed"}, {"Value Failed"} , {"Value Done"}};
    }

    @DataProvider (name = "purchaseOrder")
    public Object[][] dpMethod2(){
        return new Object[][] {{"Value Passed"}, {"Value Failed"} , {"Value Done"}};
    }

}
