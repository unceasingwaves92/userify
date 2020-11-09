package Userify;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateCompany extends BaseRequest {
	
	
	@Test
	public void createCompany() {
		
		
		Response response = requestSpecification
				.given()
				.body("{\"name\" : \"Service based company\"}")
				.post("company");
				
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		String com_id = jsonPath.get("company_id");
		System.out.println(com_id);
		
				
	}
	

}
