package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CsvOutputGenerator;
import beans.IOutputGenerator;
import beans.JsonOutputGenerator;
import config.SpringConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext =  new AnnotationConfigApplicationContext(SpringConfig.class);
        
        IOutputGenerator output = (CsvOutputGenerator)appContext.getBean(CsvOutputGenerator.class);
        IOutputGenerator output1 = (JsonOutputGenerator)appContext.getBean(JsonOutputGenerator.class);
        output.generateOuput();
        output1.generateOuput();
        
        
    }
}
