package DataDriven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataUse2 extends DataProvider
{

    @Test(dataProvider = "addition")
    void addition (int a, int b)
    {
        int c= a+b;
        System.out.println("The addition is "+c);
    }


    @Parameters({"Name","Sirname"})
    @Test
    void createFullName(String Name, String Sirname){
        String Fullname=Name+" "+Sirname;
        System.out.println(Fullname);
    }
}

