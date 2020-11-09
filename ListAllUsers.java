package Userify;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ListAllUsers extends BaseRequest {

	
	@Test
	public void listAllUsers() {
		


		Response response = requestSpecification
				.given()
				.get("users/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/usergroup/company_admins")
				.then()
				.assertThat()
				.statusCode(200)
				.body("inactive.umiQBb3xP9SKy4ytNmgUuG_user.username", Matchers.equalTo("service1"))// -> String = EqualTo or ContainString
				.extract()
				.response()
				;
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		JsonPath jsonPath = response.jsonPath();
		
		String active = jsonPath.get("inactive.umiQBb3xP9SKy4ytNmgUuG_user.username");
		System.out.println(active);
		
	}
	

}
