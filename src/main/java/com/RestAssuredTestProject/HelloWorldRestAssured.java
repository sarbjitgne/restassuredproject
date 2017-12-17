package com.RestAssuredTestProject;

//

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
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
