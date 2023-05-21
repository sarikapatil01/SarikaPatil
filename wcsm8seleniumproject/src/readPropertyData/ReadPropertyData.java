package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		//provid the path of the property file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//Read the data form Property file
		Properties prop = new Properties();
		
		//make the property file to read
		prop.load(fis);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
	}

}
