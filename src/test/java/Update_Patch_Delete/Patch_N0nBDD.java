package Update_Patch_Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Patch_N0nBDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test

    public void test_Patch_meth(){


        String token = "a6a16b87fc35b3b";
        String bookingid = "111";
    String payloadPATCH = "{\n" +
            "  \"firstname\": \"lucky\",\n" +
            "  \"lastname\": \"Dean\"\n" +
            "}";

        r = RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payloadPATCH).log().all();
        //r.auth().preemptive().basic("admin", "password123");


         response = r.when().log().all().patch();

        vr= response.then().log().all();
        vr.statusCode(200);

    }
}
