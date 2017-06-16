package beans;

import org.springframework.stereotype.Component;

@Component
public class JsonOutputGenerator implements IOutputGenerator {

	public void generateOuput() {
		System.out.println("JSON OUTPUT Generator");
		
	}

}
