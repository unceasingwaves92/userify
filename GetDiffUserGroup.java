package Userify;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetDiffUserGroup extends BaseRequest {
	
	
	@Test
	public void getDiffUserGroup() {
		
		
		Response response = requestSpecification
				.given()
				.get("users/company_id/ddFe48q7ii8GP8X7SQM3PQ_company/usergroup/company_admins")
				.then()
				.assertThat()
				.statusCode(200)
				.body("active.cZ3SU2Bm3xRVASaR3HRMuV_user.username", Matchers.equalTo("karthiktest"))// -> String = EqualTo or ContainString
				.extract()
				.response()
				;
				
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getContentType());
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		String active = jsonPath.get("active.cZ3SU2Bm3xRVASaR3HRMuV_user.username");
		System.out.println(active);
	
		
				
	}
	

}
