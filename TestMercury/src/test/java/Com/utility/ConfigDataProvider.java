package Com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public ConfigDataProvider()
	{
		File src=new File("D:\\Automation\\TestMercury\\Config\\Config.Properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getURL()
	{
		return pro.getProperty("url");
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
}