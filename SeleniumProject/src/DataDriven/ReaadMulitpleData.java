package DataDriven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class ReaadMulitpleData 
{
	public static void main(String[] args) throws IOException 
	{
		String filePath="./resource/prp.properties";
		FileInputStream file = new FileInputStream(filePath); 
		Properties proper = new Properties();
		proper.load(file);
		 Set<Object> keyset = proper.keySet();
		 for(Object key:keyset)
		 {
			 System.out.println(key);
			 System.out.println(proper.get(key));
		 }
	}
}
