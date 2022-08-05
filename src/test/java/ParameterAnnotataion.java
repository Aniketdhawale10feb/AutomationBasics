import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotataion {

    // 1st we will create some parameterised methods
    // then we will create a Test NG XML "Parameters XML" to define the values in created parameters, in our case UserName, PassWord, ProductName
    // Then we have to creat same parameters mentioned in methods in XML file
    // After that we have used @Paratemer annotation to pass the value of parameters from xml file to respective tets
    @Test
    @Parameters({"UserName", "PassWord"})
    void login(String UserName, String PassWord ){
        System.out.println("User name is "+UserName);
        System.out.println("Password is "+ PassWord);
    }


    @Test(dependsOnMethods = "login")
    @Parameters("ProductName")
    void Product(String ProductName){
        System.out.println("The product that i want to search is " +ProductName);
    }


}
