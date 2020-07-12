package Day_5;
import org.testng.annotations.Test;
public class InheritedDataProvider {

       @Test (dataProvider = "Supplier", dataProviderClass = DP.class)
        public void myTest (String val) {
            System.out.println("Current Status : " + val);
        }
    }

