package stepDefinitions.APISteps;

import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.Authentication;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US_10_step extends Authentication {
    Response response;
    String url;
    @Given("set the path params for doc login")
    public void setThePathParamsForDocLogin() {
        //https://www.medunna.com/api/appointments/304415
    //spec.pathParams("first","appointments","second",304415);
        url="https://www.medunna.com/api/appointments/304415";
    }

    @When("User Doc send GET Request")
    public void userDocSendGETRequest() {
        response=given().headers("Authorization","Bearer "+generateToken()).when().get(url);


    }

    @Then("User Doc can see their appointments list and time slots on My Appointments")
    public void userDocCanSeeTheirAppointmentsListAndTimeSlotsOnMyAppointments() {
        response.prettyPrint();
    }

    @And("User Doc can see patient id, start date, end date, status")
    public void userDocCanSeePatientIdStartDateEndDateStatus() {
        /*
        {
    "createdBy": "patient.zeynep",
    "createdDate": "2022-11-16T18:38:23.215422Z",
    "id": 304415,
    "startDate": "2022-11-16T00:00:00Z",
    "endDate": "2022-11-16T01:00:00Z",
    "status": "PENDING",
         */
        JsonPath json=response.jsonPath();
        assertEquals("2022-11-16T00:00:00Z",json.getString("startDate"));
        assertEquals("2022-11-16T01:00:00Z",json.getString("endDate"));
        assertEquals("PENDING",json.getString("status"));
    }
}
