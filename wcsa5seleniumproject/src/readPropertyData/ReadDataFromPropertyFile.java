package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//read the data from property file
		FileInputStream fis = new FileInputStream("./data/config.properties");
        //create object of properties class
		Properties prop = new Properties();
		//read the file ready to read
		prop.load(fis);
		
		String data = prop.getProperty("Url");
		System.out.println(data);
	}

}
