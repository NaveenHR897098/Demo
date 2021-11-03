package PropertyUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropetyUtil {
	public String getPropUtil(String filePath, String Key)
	{
		FileInputStream file;
		Properties properties = new Properties();
		try 
		{
			file = new FileInputStream(filePath);
			properties.load(file);
			//String Value = properties.getProperty("Key");
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		return properties.getProperty(Key);
	}

}
