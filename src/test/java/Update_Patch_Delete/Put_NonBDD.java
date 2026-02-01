package Update_Patch_Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Put_NonBDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_NonBDD_Put(){

        String payloadPUT="{\n" +
                "    \"firstname\": \"casey\",\n" +
                "    \"lastname\": \"Jordon\",\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2026-03-06\",\n" +
                "        \"checkout\": \"2026-03-07\"\n" +
                "    }\n" +
                "}";
        String token = "a6a16b87fc35b3b";
        String bookingid = "5";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payloadPUT).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(403);

    }

}
