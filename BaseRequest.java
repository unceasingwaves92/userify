package Userify;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseRequest {
	
	public static RequestSpecification requestSpecification;

	
	
	@BeforeSuite
	public void initialize() {
		
		RestAssured.baseURI="https://api.userify.com/api/userify/";
		
		RestAssured.authentication=RestAssured.preemptive().basic("karthiktest", "test49test49");
		
		requestSpecification = RestAssured
				
				.given()
				.log()
				.all()
				.contentType(ContentType.JSON);
		
	}

}



