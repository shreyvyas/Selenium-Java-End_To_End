package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;
	
	private static void loadProperties() throws IOException {
		
		String env = System.getProperty("env");
		
		try {
			
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\selenium-java-E2E\\Resources\\Properties\\" + env + "Config.properties");
			properties = new Properties();
			properties.load(file);			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperties(String key) throws IOException {		
			
			loadProperties();
			
			return properties.getProperty(key);		
		
	}
	
	

}
