import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnAnnotation {
    @Test
    void openbrowser(){
        System.out.println("Browser is open");
    }

    @Test(dependsOnMethods = "openbrowser")// here we have used dedepds on method under @tets annotataion to create a dependancy of enterURL method on openbrowser menthod
    void enterURL (){
        System.out.println("URL is entered");
    }

    @Test(dependsOnMethods = "enterURL")
    void login(){
        Assert.fail("intentionally failed");// here we have intentionally failed the method to check the other dependant methods will be skipped or not here in this case we have failed login method due to which send email and logout methods got skipped
        System.out.println("User is logged in ");
    }

    @Test(dependsOnMethods = "login")
    void sendemail(){
        System.out.println("EMAIL IS SENT");
    }

    @Test(dependsOnMethods = {"login", "enterURL"})
    void logout(){
        System.out.println("Browser is logged out");
    }
}
