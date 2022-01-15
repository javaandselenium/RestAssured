package parasers;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class Deserlaization {
	@Test
	public void tc2() throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		Project pobj = mapper.readValue(new File("./emplyoeedetails.json"),Project.class);
		System.out.println(pobj.empAge);
		System.out.println(pobj.emplyeeName);
		System.out.println(pobj.location);
		System.out.println(pobj.empSalary);
	}

}
