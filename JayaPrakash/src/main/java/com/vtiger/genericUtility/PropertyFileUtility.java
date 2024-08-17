package com.vtiger.genericUtility;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public String readStringDataFromPf(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(Iconstantpaths.Propertyfilepath);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}

}
