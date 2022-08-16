package PracriceClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.naming.Name;
import java.lang.reflect.Method;

public class DataProviderPractice
{

    @Test(dataProvider = "DTP")
    public void Test1(String Name)
    {
        System.out.println(Name);
    }

    @DataProvider(name ="DTP")
    public Object [][] DTP(Method method)
    {
        if(method.getName().equalsIgnoreCase("Test1"))
        return new Object[][]
                {
                {"ANiket"}, {"ANkush"},{"Dhawale"}
                };
        return new Object[0][];
    }

}

