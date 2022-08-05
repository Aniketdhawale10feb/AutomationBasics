package DemoListners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ListnedTestCases {
    @Test(priority = 0)
    public void SuccessCase(){
        System.out.println("This is success cases");
    }

    @Test(priority = 1)
    public void FailCase(){
         Assert.assertEquals(2,3);
    }

    @Test(priority = 2)
    public void SkippedCase() throws SkipException {
        System.out.println("This is skipped case");
        throw new SkipException("The case is skipped");
    }

    @Test(dataProvider = "DTP",priority = 3)
    public void DtProvide(String s){
        System.out.println("data provided string is "+ s);
    }

    @DataProvider
    public Object[][] DTP(){
        return new Object[][]{{"s1", "s2"}};
    }
}
