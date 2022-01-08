package CURDOperationOnGithub;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchOperation {
	@Test
	public void patchOperation() {
		JSONObject jobj=new JSONObject();
		jobj.put("private",false);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		.when()
		.patch("https://api.github.com/repos/javaandselenium/demoapitest")
		
		.then().log().all();
		
	}

}
