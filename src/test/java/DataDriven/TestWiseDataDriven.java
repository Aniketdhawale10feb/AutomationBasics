package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestWiseDataDriven
//**************** Single data provider for all methods **************//
// Here we have 1st defined two test cases with different data requirement and the same are parameterised
// Now we need to pass the values in the respective methods, for that we have created Data provider methods which returns the object array (two dimensional).
// now to use the single data provider to pass the value  in all methods
// we have added if conditions in data provider, and we have check the method name using Method class and method.get name function
// Now to pass the value in respective method pass the same data provider in all required methods
{
    @Test(dataProvider = "search")
    void login(String Username, String Password) {
        System.out.println("The user name and password are " + Username + " and " + Password);
    }

    @Test(dataProvider = "search")
    void search(String productname1, String productname2) {
        System.out.println("The searched product name is " + productname1);
    }

    @DataProvider()
    public Object[][] search(Method method)
    {
        String MethodName = method.getName();
        if (MethodName.equalsIgnoreCase("Login") )
        {
            return new Object[][]{
                    {"a.dhawale", "Aniket@123"},
                    {"p.babar", "Babar@123"},
                    {"M.shinde", "Mrunal@123"}
            };
        } else if (MethodName.equalsIgnoreCase("search"))
        {
            return new Object[][]{
                    {"Samsung Mobile", "Samsung Charger"},
                    {"Apple Mobile", "Apple Charger"},
                    {"Nokia Mobile", "Nokia Charger"},
            };
        }
        return new Object[0][];
    }
}







