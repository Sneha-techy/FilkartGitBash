package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {
	public  String readDataFromCommData(String Key) throws Throwable {
FileInputStream fis=new FileInputStream("./src/main/resources/commodata.properties");
Properties prop =new Properties();
prop.load(fis);
String value = prop.getProperty(Key);
return value;
}
}