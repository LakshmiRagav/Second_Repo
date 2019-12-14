package com.amazon.shopping;
import java.io.FileInputStream;
import java.util.Properties;



public class Basetest {
	
	public static Properties p;
	public static FileInputStream fis;
	
	public static void init() throws Exception
	{
		fis=new FileInputStream(projectPath+"//test.properties");
		p=new Properties();
		p.load(fis);
		
		fis=new FileInputStream(projectPath+"//environment.properties");
		prop=new Properties();
		prop.load(fis);
		String e = prop.getProperty("env");
		System.out.println(e);
		
		fis=new FileInputStream(projectPath+"//"+e+".properties");
		envprop=new Properties();
		envprop.load(fis);
		String val = envprop.getProperty("amazonurl");
		System.out.println(val);
		
	}
	


	public static void main(String[] args) {
			}

}
