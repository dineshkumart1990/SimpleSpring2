package beans;

import org.springframework.stereotype.Component;

@Component
public class CsvOutputGenerator implements IOutputGenerator {

	public void generateOuput() {
		System.out.println("CSV Output Generator");
		
	}
	
}
