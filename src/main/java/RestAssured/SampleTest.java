package RestAssured;

import org.testng.annotations.Test;

public class SampleTest {
    @Test(description = "login")
    public void login(){ }

    @Test(description = "search test", dependsOnMethods = "login")
    public void search(){ }

    @Test(description = "select test", dependsOnMethods = "search")
    public void select(){ }

    @Test(description = "book test", dependsOnMethods = "select")
    public void book(){ }

    @Test(description = "logout test", dependsOnMethods = "book")
    public void logout(){ }
}
