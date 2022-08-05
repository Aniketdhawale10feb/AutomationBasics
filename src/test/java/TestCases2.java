import org.testng.annotations.Test;

public class TestCases2 {
    @Test(groups = "Regression")
    public void TC1(){
        System.out.println("This is TC 2 Test case 1");
    }
    @Test(groups = "Sanity")
    public void TC2(){
        System.out.println("This is TC 2 Test case 2");
    }
}
