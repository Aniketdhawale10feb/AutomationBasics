import jdk.jfr.Enabled;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import javax.swing.*;

public class Assertion {

    @Test(groups = {"Regression"})
    public void t1(){
        System.out.println("Hard assertion Test case no 1");
        String a = "Aniket";
        String b = "Aniket";
        // here we are comparing a string with b using assertion
        // if results are true test case will pass other wise it will fail
        Assert.assertEquals(a,b);
    }

    @Test(groups = {"Regression"})
    public void t2(){
        System.out.println("Hard Assertion test case no 2");
        int a= 10;
        int b= 10;
        // here we are comparing a ineteger with b using assertion
        Assert.assertEquals(a,b);
    }

    @Test(groups = {"Sanity"})
    public void t3(){
        System.out.println("Hard Assertion test case no 3");
        int a= 10;
        int b= 20;
        // here we are checking the condition inside the assertion is true of false
        // if the same is true test case will pass  otherwise it will fail
        Assert.assertTrue(b > a);
    }

    @Test(groups = {"Sanity"})
    public void t4(){
        System.out.println("Hard Assertion test case no 4");
        int a= 10;
        int b= 20;
        // here we are checking the condition inside the assertion is false or not.(a > b)
        // if the same is false test case will pass otherwise it will fail
        Assert.assertFalse( a > b,"This is as display message for theis condition");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void t5() {
        System.out.println("Hard Assertion test case no 5");
    }


}
