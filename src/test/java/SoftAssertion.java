import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.print.DocFlavor;

public class SoftAssertion {

    // soft assertion is used to execute the complete test case even if one of the asstertion from the test case is failed

    @Test
    public void sat1(){
        SoftAssert softAssert= new SoftAssert();// here we have create the object of Soft assert class to access its functions

        System.out.println("sat1 condition 1 is executed");
        String a= "pune";
        String b= "nagar";
        softAssert.assertEquals(a,b);// here we  aretrying to compare two strings

        System.out.println("sat1 condition 2 is executed");
        int x= 10;
        int y= 20;
        softAssert.assertEquals(x,y,"This is interger comparison assertion");

        System.out.println("sat1 condition 3 is executed");
        softAssert.assertTrue(x>y);

        softAssert.assertAll();// this  function is mandatory to place here to finalise the end result of the test case
    }

    @Test
    public void sat2(){
        SoftAssert softassert = new SoftAssert();

        System.out.println("sat2 condition 1 is executed");
        softassert.assertTrue(10>20);

        System.out.println("sat2 condition 2 is executed");
        softassert.assertFalse(10>20);

        softassert.assertAll();
    }

}
