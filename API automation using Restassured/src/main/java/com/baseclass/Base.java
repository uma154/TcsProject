package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Base {
	public static Properties properties;
	public static Logger logger;
	public static String uri;
	public static final String logBasePath = "./target//Log File//";
	
//	PrintStream log = new PrintStream(new File("./Log File/Log.txt"));
	public static void BaseSetup() throws IOException
	{
		
	properties = new Properties();
	
		FileInputStream file = new FileInputStream("./src/test/resources/ConfigProperties/config.property");
		properties.load(file);
		
		logger = Logger.getLogger("RestAssuredFramework");
		PropertyConfigurator.configure("./src/test/resources/Log4jProperties/log4j.property");
		uri = properties.getProperty("baseuri");
	}
}
