package validation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() {
		
		when()
		.get("https://api.github.com/repos/javaandselenium/wasa2")
		
		.then().log().all()
		.assertThat().header("Content-Type","application/json; charset=utf-8")
		.assertThat().header("X-Frame-Options","deny")
		.assertThat().header("Access-Control-Allow-Origin","*");
		
		
		
	}

}
