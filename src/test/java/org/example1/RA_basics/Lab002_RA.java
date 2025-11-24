package org.example1.RA_basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab002_RA {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the pincode:   ");
        String pincode = sc.next();


        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }
}
