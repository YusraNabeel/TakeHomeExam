package PracticeTakeHome;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main (String[] args) {
		String filePath = "C:\\Users\\labadmin\\eclipse-workspace\\TakeHomeExam\\Data\\list1.properties";
		
		if (doesfileExist(filePath)) {
			System.out.println("File exists");
			Properties prop = new Properties();
			FileInputStream fs = null;
			
			try {
				fs = new FileInputStream(filePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				prop.load(fs);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Apple");
			System.out.println(prop.getProperty("Apple"));
			System.out.println(prop.getProperty("apple"));
			System.out.println("Table");
			System.out.println(prop.getProperty("Table"));
			System.out.println(prop.getProperty("table"));
			System.out.println("Orange");
			System.out.println(prop.getProperty("Orange"));
			}
			else {
				System.out.println("File does not exist");
			}
		}
		private static boolean doesfileExist(String filePath) {
			return true;
	}
}
