package Day_5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class BasicDataProviderExample
    {
        @DataProvider(name="org")
        public static Object[][] employeeData(){
            Object[][] object = new Object[3][3];

            object[0][0]="Manager";
            object[0][1]="Regan";
            object[0][2]=12000;

            object[1][0]="Employee";
            object[1][1]="John";
            object[1][2]=8000;

            object[2][0]="Employee";
            object[2][1]="Bharat";
            object[2][2]=3000;


            return object;
        }


        @Test(dataProvider="org")
        public void runforEachEmployee(String role, String empname, int salary)
        {
            System.out.println("******Emp Record***********");
            System.out.println(empname);
            System.out.println(role);
            System.out.println(salary);
        }
    }


