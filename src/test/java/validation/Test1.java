package validation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc2() {
		when()
		.get("https://api.github.com/repos/javaandselenium/wasa2")
		.then().log().all()
		.assertThat().header("X-RateLimit-Resource","core")
		.assertThat().body(".owner.login",is("javaandselenium"))
	.assertThat().body(".owner.url",equalTo("https://api.github.com/users/javaandselenium"));
		//.assertThat().body(".owner.id",contains("7255"));
	}

}
