package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicDataDriven

        //**************** New Data provider for each methods **************//

// Here we have 1st defined two test cases with different data requirement and the same are parameterised
// Now we need to pass the values in the respective methods, for that we have created Data provider methods which returns the object array (two dimensional).
// Now to pass the value in respective method we will define the respective data provider in required test case.

{
    @Test(dataProvider = "dataproviderlogin")
    void login (String Username, String Password){
        System.out.println("The user name and password are " +Username+" and "+Password);
    }
    @Test(dataProvider = "dataprovidersearch")
    void search (String productname1, String productname2 ){
        System.out.println("The searched product name is " +productname1);
    }

    @DataProvider
    Object[][] dataproviderlogin() {
        return new Object[][]{
                {"a.dhawale", "Aniket@123"},
                {"p.babar", "Babar@123"},
                {"M.shinde", "Mrunal@123"}
        };
    }
    @DataProvider
    Object[][] dataprovidersearch() {
        return new Object[][]{
                {"Samsung Mobile", "Samsung Charger"}
        };
    }

}
