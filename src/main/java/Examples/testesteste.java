package Examples;

import org.testng.annotations.*;

public class testesteste {



    @BeforeMethod
    public void run1(){
        System.out.println("BeforeMethod");
    }


    @Test
    public void run3(){
        System.out.println("run3");
    }

    @Test
    public void run4(){
        System.out.println("run4");
    }

    @BeforeTest
    public void run11(){
        System.out.println("BeforeTest11");
    }

    @Test
    public void run5(){
        System.out.println("run5");
    }


    @AfterClass
    public void run6(){
        System.out.println("AfterClass");
    }

    @AfterMethod
    public void run7(){
        System.out.println("AfterMethod");
    }

    @AfterTest
    public void run8(){
        System.out.println("AfterTest");
    }

    @BeforeClass
    public void runnd(){
        System.out.println("Before Class");
    }
}
