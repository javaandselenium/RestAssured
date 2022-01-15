package parameterization;
import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class GetOperation {

	@Test
	public void pathParameter() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		given()
		.auth().oauth2("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")
		.pathParam("ownerName",p.getProperty("ownername"))
		.pathParam("repoName",p.getProperty("reponame"))
		
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		
	.then().log().all();
		
		
	}
	
}
