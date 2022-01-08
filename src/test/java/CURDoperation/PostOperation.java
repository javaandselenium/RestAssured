package CURDoperation;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostOperation {
@Test
public void postOperation() {
	JSONObject jobj=new JSONObject();
	jobj.put("id",3400);
	jobj.put("title","apiustest");
	
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	
	.when()
	.post("http://localhost:3000/posts")
	
	.then()
	.log().all();
	
}
}
