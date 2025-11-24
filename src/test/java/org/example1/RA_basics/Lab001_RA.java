package org.example1.RA_basics;

import io.restassured.RestAssured;

public class Lab001_RA {

    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://api.postalpincode.in/pincode/1100605")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
