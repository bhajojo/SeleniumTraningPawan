package Day_5;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsExample {


        @BeforeGroups
        public void beforeGroups() {
            System.out.println("before Group");
        }
        @BeforeClass
        public void setUp() {
            // code that will be invoked when this test is instantiated
        }

        @Test(groups = { "slow" })
        public void aSlowTest3() {
        System.out.println("Slow test1");
    }


        @Test(groups = { "fast" })
        public void aFastTest() {
            System.out.println("Fast test");
        }

        @Test(groups = { "fast" })
        public void aFastTest1() {
            System.out.println("Fast test 1");
        }

        @Test(groups = { "slow" })
        public void aSlowTest() {
            System.out.println("Slow test");
        }

        @Test(groups = { "slow" })
        public void aSlowTest1() {
            System.out.println("Slow test1");
        }
        @AfterGroups
        public void AfterGroups() {
            System.out.println("After Group");
        }


        @Test(groups = { "fast" })
        public void aFastTest2() {
            System.out.println("Fast test 2");
        }

        @Test(groups = { "fast" })
        public void aFastTest3() {
            System.out.println("Fast test 3");
        }

    }

