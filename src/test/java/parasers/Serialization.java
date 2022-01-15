package parasers;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Serialization {
	@Test
	public void demo() throws JsonGenerationException, JsonMappingException, IOException {
		
	Project p=new Project("John",30,78.90,"USA");
	ObjectMapper mapper=new ObjectMapper();
	mapper.writeValue(new File("./emplyoeedetails.json"),p);
	
		
		
	}

}
