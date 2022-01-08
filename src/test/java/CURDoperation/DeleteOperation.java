package CURDoperation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteOperation {
	@Test
	public void deleteOperation() {
		
		when()
		.delete("http://localhost:3000/posts/3400")
		
		.then().log().all();
		
	}

}
