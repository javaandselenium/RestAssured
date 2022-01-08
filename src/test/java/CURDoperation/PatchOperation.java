package CURDoperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PatchOperation {
	@Test
	public void patchOperation() {
		JSONObject jobj=new JSONObject();
		jobj.put("title","apidemo");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		
		.when()
		.patch("http://localhost:3000/posts/3400")
		
		.then().log().all();
		
	}

}
