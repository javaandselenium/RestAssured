package CURDOperationOnGithub;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetOperation {
@Test
public void getOperation() {
	
	when()
	.get("https://api.github.com/repos/javaandselenium/wasa2")
	
	.then().log().all();
	
}
}
