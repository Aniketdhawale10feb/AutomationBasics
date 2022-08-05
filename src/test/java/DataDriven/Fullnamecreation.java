package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.event.ChangeEvent;
import java.net.http.WebSocket;
import java.sql.SQLOutput;
import java.util.List;

public class Fullnamecreation extends DataProvider {

    //WebDriver driver = new ChromeDriver();

    //  @Test(dataProvider = "names")
    public void FullName(String Firstname, String Lastname) {
        System.out.println(Firstname + Lastname);
    }

    @Test(dataProvider = "addition")
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }


}
