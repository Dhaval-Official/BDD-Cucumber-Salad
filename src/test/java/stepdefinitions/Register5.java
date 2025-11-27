package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.Map;

public class Register5 {

    @Given("User enters below details into fields at once")
    public void user_enters_below_details_into_fields_at_once(DataTable table) {

        Map<String,String> map =  table.asMap(String.class, String.class);
        System.out.println("FName is "+map.get("fName"));
        System.out.println("LName is "+map.get("lName"));
        System.out.println("email is "+map.get("email"));
        System.out.println("Mobile is "+map.get("mobile"));
        System.out.println("password is "+map.get("pass"));

    }

}
