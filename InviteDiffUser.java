package Userify;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class InviteDiffUser extends BaseRequest {

	
	@Test
	public void inviteDiffUser1() {
		


		Response response = requestSpecification
				.given()
				.put("invitation/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/email/1@email.com");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
	
		
	}
	

	@Test
	public void inviteDiffUser2() {
		


		Response response = requestSpecification
				.given()
				.put("invitation/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/email/2@email.com");
		
		response.prettyPrint();					
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		
		
	}
	
	@Test
	public void inviteDiffUser3() {
		


		Response response = requestSpecification
				.given()
				.put("invitation/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/email/3@email.com");
		
		response.prettyPrint();					
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		
		
	}
	
	
	@Test
	public void inviteDiffUser4() {
		


		Response response = requestSpecification
				.given()
				.put("invitation/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/email/4@email.com");
		
		response.prettyPrint();					
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		
		
	}	
	
	@Test
	public void inviteDiffUser5() {
		


		Response response = requestSpecification
				.given()
				.put("invitation/company_id/xFeU2Ni6yxQbHNs6is9BLT_company/email/5@email.com");
		
		response.prettyPrint();					
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		
		
	}	
	
	

}
