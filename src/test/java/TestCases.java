import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TestCases {

    @Test(priority = 1,groups = "Regression")
    void test1(){
        System.out.println("This is test no 1");
    }

    @Test(priority = 2,groups = "Sanity")
    void test2(){
        System.out.println("This is test no 2");
    }

}
