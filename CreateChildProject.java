package Userify;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateChildProject extends BaseRequest {
	
	
	@Test
	public void createChildProject() {
		
		
		Response response = requestSpecification
				.given()
				.body("{\"name\" : \"Web Based Servers\"}")
				.post("project/company_id/ddFe48q7ii8GP8X7SQM3PQ_company/parent_project_id/wS9ETQBn9A8TvJyTadVqQB_project");
				
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		String chdProject = jsonPath.get("project_id");
		System.out.println(chdProject);
		
				
	}
	

}
