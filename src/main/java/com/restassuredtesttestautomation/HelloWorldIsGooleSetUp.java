package com.restassuredtesttestautomation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matcher.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

/**
 * Created by Sarb on 12/20/2017.
 */
public class HelloWorldIsGooleSetUp {
    @Test
    public void isGoogleSetUp(){
//        RestAssured.useRelaxedHTTPSValidation();
        Response response = get("http://ergast.com/api/f1/2017/circuits.json");
        String jsonToString = response.asString();
//        System.out.println(jsonToString);
        JSONObject obj = new JSONObject(jsonToString);
        System.out.println(obj);
    }
}
