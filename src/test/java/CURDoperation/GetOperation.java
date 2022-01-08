package CURDoperation;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetOperation {
	@Test
	public void getOperation() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all();
	}
	

}
