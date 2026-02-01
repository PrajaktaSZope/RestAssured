package Restassured_Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_testNg {
    @Parameters("browser")
    @Test
    public void demo1(String browser){
        System.out.println("Hi I am Demo");
        System.out.println("You are running this Parameter");


    }
}
