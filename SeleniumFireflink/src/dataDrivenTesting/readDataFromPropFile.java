package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromPropFile {

	public static void main(String[] args) throws IOException {
	 //step1 :Create FIS/FR object
	 FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
	 
	 //step2: create respective file type object
	 Properties prop = new Properties();
	 
	 prop.load(fis);
	 //step3:call read methods
	 String URL = prop.getProperty("url");
	 System.out.println(URL);

	}

}
