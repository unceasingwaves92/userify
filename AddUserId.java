package Userify;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AddUserId extends BaseRequest {

	
	@Test
	public void addUserId() {
		


		Response response = requestSpecification
				.given()
				.body("{ }")
				.put("usergroup/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/usergroup/company_admins/user_id/cZ3SU2Bm3xRVASaR3HRMuV_user");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
	
		
	}
	

}
