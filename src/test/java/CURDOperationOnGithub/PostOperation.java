package CURDOperationOnGithub;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class PostOperation {
	@Test
	public void postOperation() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","demoapitest");
		jobj.put("description","demo repro");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		.when()
		.post("https://api.github.com/user/repos")
		
		.then().log().all();
		
	}

}
