/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.DetailedGear;
import io.swagger.client.model.Fault;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GearsApi
 */
@Ignore
public class GearsApiTest {

    private final GearsApi api = new GearsApi();

    
    /**
     * Get Equipment
     *
     * Returns an equipment using its identifier.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGearByIdTest() throws Exception {
        String id = null;
        DetailedGear response = api.getGearById(id);

        // TODO: test validations
    }
    
}
