import org.testng.SkipException;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class SkipTestCases {
    @Test(priority = 0,enabled = false,groups = "Regression")
    public void skipmethod1(){
        // We can skip this test case with enable= false method
        System.out.println("Test case executed from SkipTestCase class skipmethod1");
    }

    @Test(priority = 1,groups = "Sanity")
    public void SkipMethod2(){
        // We can skip this test case with throws new skip exception method
        System.out.println("Test case executed from SkipTestCase class skipmethod2");
        throw new SkipException("This case is intentionaly skipped");
    }
}
