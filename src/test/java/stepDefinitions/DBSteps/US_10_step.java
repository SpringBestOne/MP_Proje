package stepDefinitions.DBSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.WriteToTxt;

import java.util.HashMap;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class US_10_step  {
    String query;
    Object actualData;
    Object expectedData;
    @Given("connect to database")
    public void connectToDatabase() {

        DatabaseUtility.createConnection();

    }

    @When("Get appointment information of patient list from the table")
    public void getAppointmentInformationOfPatientListFromTheTable() {

        query="select * from public.appointment where patient_id=304181";

        System.out.println(DatabaseUtility.getColumnNames(query));

        actualData=new HashMap<>(DatabaseUtility.getRowMap(query));
        System.out.println("actualData = " + actualData);
        expectedData=new HashMap<>(DatabaseUtility.getRowMap(query));
        System.out.println("expectedData = " + expectedData);

        List<Object> patientInfo=getColumnData(query,"patient_id");
        patientInfo.add(getColumnData(query,"start_date"));
        patientInfo.add(getColumnData(query,"end_date"));
        patientInfo.add(getColumnData(query,"status"));

        System.out.println( patientInfo);
        String fileName="src/test/resources/testdata/Patients.txt";
        WriteToTxt.savePatients(fileName,patientInfo);


    }

    @Then("the verify query result")
    public void theVerifyQueryResult() {

        Assert.assertEquals(actualData,expectedData);

        DatabaseUtility.closeConnection();
    }
}
