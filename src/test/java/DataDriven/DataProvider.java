package DataDriven;

import org.testng.ITestContext;

import java.lang.reflect.Method;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "names")

    public Object[][] datprovider(ITestContext context) {
        String TestCase = context.getName();
        if ("fullname".equalsIgnoreCase(TestCase)) {
            return new Object[][]{
                    {"Aniket", "Dhawale"},
                    {"Prashant", "Babar"}
            };
        }else {
        return new Object[0][];
    }
    }

    @org.testng.annotations.DataProvider(name="addition")
    public Object[][] addition(Method method){
        if ("addition".equalsIgnoreCase(method.getName()))
        {
            return new Object[][]{
                    {2,3},
                    {4,5}
            };
        }

        return new Object[0][];
    }
}






