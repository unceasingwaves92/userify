package Userify;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateNewProject extends BaseRequest {
	
	
	@Test
	public void createNewProject() {
		
		
		Response response = requestSpecification
				.given()
				.body("{\"name\" : \"New Server 1\"}")
				.post("project/company_id/ddFe48q7ii8GP8X7SQM3PQ_company");
				
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		String project = jsonPath.get("project_id");
		System.out.println(project);
		
				
	}
	

}
