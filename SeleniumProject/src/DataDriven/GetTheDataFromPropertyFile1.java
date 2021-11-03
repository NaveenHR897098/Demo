package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetTheDataFromPropertyFile1 {

	public static void main(String[] args) throws IOException {
		String filePath="./resource/config.properties";
		FileInputStream file = new FileInputStream(filePath); 
		Properties proper = new Properties();
		proper.load(file);
		String Url = proper.getProperty("url");
		String name = proper.getProperty("username");
		String pass = proper.getProperty("password");
		System.out.println(Url);
		System.out.println(name);
		System.out.println(pass);

	}

}

