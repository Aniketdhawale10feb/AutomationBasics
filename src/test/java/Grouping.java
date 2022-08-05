import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

    // To execute theis class please excute the Grouping XML from out put folder
    // There you can configure the groups that you want to execute

    @Test(groups = {"Regression"})
    public void t1(){
        System.out.println("Regression test case 1 ");
    }

    @Test(groups = {"Regression"})
    public void t2(){
        System.out.println("Regression test case 2 ");
    }

    @Test(groups = {"Sanity"})
    public void t3(){
        System.out.println("Sanity test case 1");
    }

    @Test(groups = {"Sanity"})
    public void t4(){
        System.out.println("Sanity test case 2");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void t5() {
        System.out.println("Sanity and regression test case 1");
    }
}
