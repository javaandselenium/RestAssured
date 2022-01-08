package CURDOperationOnGithub;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteOpertaion {
	@Test
	public void deleteOperation() {
		
		given()
		.auth().oauth2("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")
		
		.when()
		.delete("https://api.github.com/repos/javaandselenium/demoapitest")
		
		.then().log().all();
		
		
	}

}
