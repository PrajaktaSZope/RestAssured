package Update_Patch_Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Put_NonBDD {

    @Test
    public void test_NonBDD_Put(){
        
        String token = "OHTJ7uhUMOJud7nM";
        String bookingid = "129";
        String payloadPUT="{\n" +
                "    \"roomid\": 129,\n" +
                "    \"firstname\": \"Praj\",\n" +
                "    \"lastname\": \"Bhagat\",\n" +
                "    \"depositpaid\": true,\n" +
                "    \"email\": \"test1@email.com\",\n" +
                "    \"phone\": \"07123456789\",\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2026-03-06\",\n" +
                "        \"checkout\": \"2026-03-07\"\n" +
                "    }\n" +
                "}";

        RequestSpecification r;
        Response response;
        ValidatableResponse vr;

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.baseUri("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payloadPUT).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);



    }

}
