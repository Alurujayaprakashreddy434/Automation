package com.vtiger.genericUtility1;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public 	String readDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.propertfilepath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
}
}