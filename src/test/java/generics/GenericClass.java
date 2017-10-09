package generics;

import java.io.FileInputStream;
import java.util.Properties;

public class GenericClass {
	public static String filePath = "D:\\mobileautomationworkspace\\config.properties";
	
	public static String getProperties(String key)  {
		String value = "";
		
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			properties.load(fis);
			value = properties.getProperty(key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return value;
	}

}
