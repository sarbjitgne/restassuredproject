package com.RestAssuredTestProject;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by Sarb on 12/7/2017.
 */

public class HelloWorldRestAssured {
    @Test
    public void makeSureGoogleIsSetUp(){
        given().
         when().
                get

        //        get("/lotto").then().body("lotto.lottoId", equalTo(5));
    }

}
