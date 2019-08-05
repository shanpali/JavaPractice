package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {
    @Test(dataProvider="seasonsAndNumberOfRaces")
    public void test_NumberOfCircuits_ShouldBe_DataDriven(String season, int numberOfRaces) {

        given().
                pathParam("raceSeason",season).
                when().
                get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
    }


    @Test
    public void test_ScenarioRetrieveFirstCircuitFor2017SeasonAndGetCountry_ShouldBeAustralia() {

        // First, retrieve the circuit ID for the first circuit of the 2017 season
        String circuitId = given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                extract().
                path("MRData.CircuitTable.Circuits.circuitId[0]");

        // Then, retrieve the information known for that circuit and verify it is located in Australia
        given().
                pathParam("circuitId",circuitId).
                when().
                get("http://ergast.com/api/f1/circuits/{circuitId}.json").
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.Location[0].country",equalTo("Australia"));
    }





    @DataProvider(name="seasonsAndNumberOfRaces")
    public Object[][] createTestDataRecords() {
        return new Object[][] {
                {"2017",20},
                {"2016",21},
                {"1966",9}
        };
    }

    @Test
    public void WeatherMessageBody()
    {
    baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/Hyderabad");

        // Retrieve the body of the Response
        ResponseBody body = response.getBody();

        // By using the ResponseBody.asString() method, we can convert the  body
        // into the string representation.
        System.out.println("Response Body is: " + body.asString());
    }

    @Test
    public void RegistrationSuccessful()
    {
        RestAssured.baseURI ="http://restapi.demoqa.com/customer";
        RequestSpecification request = RestAssured.given().log().all();

        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "Virsecnsadera"); // Cast
        requestParams.put("LastName", "Singh");
        requestParams.put("UserName", "63usxsersaf2d3d2011a");
        requestParams.put("Password", "passcsawsord1a");
        requestParams.put("Email",  "ed26dacsfsfa39@gmail.com");

        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        ResponseBody body = response.getBody().peek();

        // Deserialize the Response body into RegistrationSuccessResponse
        RegistrationSuccessResponse responseBody = body.as(RegistrationSuccessResponse.class);

        // Use the RegistrationSuccessResponse class instance to Assert the values of
        // Response.
        Assert.assertEquals("OPERATION_SUCCESS", responseBody.SuccessCode);
        Assert.assertEquals("Operation completed successfully", responseBody.Message);
    }


}
