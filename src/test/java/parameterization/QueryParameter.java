package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParameter {
@Test
public void queryParameters() {
	
	given()
	.auth().oauth2("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")
	.queryParam("q","javaselenium")
	.queryParam("order","asc")
	
	.when()
	.get("https://api.github.com/search/users")
	
	.then().log().all();
	
}
}
