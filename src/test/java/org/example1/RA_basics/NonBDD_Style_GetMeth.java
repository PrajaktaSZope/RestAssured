package org.example1.RA_basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDD_Style_GetMeth {
    RequestSpecification s;
    Response r;
    ValidatableResponse vr;

    @Test

    public void test_GET_Positive() {

        String pincode = "400605";
//GIVEN
        s = RestAssured.given();
        s.baseUri("https://api.zippopotam.us");
        s.basePath("/IN/"+pincode);
       //WHEN

    r=s.when().log().all().get();
        System.out.println(r.asString());

    //Then

    vr = r.then().log().all();
    vr.statusCode(200);

    }

    @Test

    public void test_GET_Negative() {

        String pincode = "40065";
//GIVEN
        s = RestAssured.given();
        s.baseUri("https://api.zippopotam.us");
        s.basePath("/IN/"+pincode);
        //WHEN

        r=s.when().log().all().get();
        System.out.println(r.asString());

        //Then

        vr = r.then().log().all();
        vr.statusCode(404);

    }

}
