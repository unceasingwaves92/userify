package Userify;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetProjectRoles extends BaseRequest {
	
	
	@Test
	public void getProjectRoles() {
		
		
		Response response = requestSpecification
				.given()
				.get("role/company_id/ddFe48q7ii8GP8X7SQM3PQ_company/project_id/xYkK99D75dSRdR2F4wi3kQ_project/role/linux_root")
				.then()
				.assertThat()
				.statusCode(200)
				.body("active[0]", Matchers.equalTo("view_project_creds"))// -> String = EqualTo or ContainString
				.extract()
				.response()
				;
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		List<String> active = jsonPath.getList("active");
	//	System.out.println(active);
		for (String eachID: active)
		{
			System.out.println(eachID);
		}
		
				
	}
	

}
