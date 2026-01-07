package Update_Patch_Delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Update {

    String payload = "";
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_NonBDD_Update(){

        r=RestAssured.given();



    }



}
