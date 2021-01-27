package com.dblogs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
 
public class Log4jJDBCExample
{
	 static Logger logger = Logger.getLogger(Log4jJDBCExample.class.getName());  
     
	    public static void main(String[] args) {  
	    	PropertyConfigurator.configure("src/main/resources/log4j.properties");  
	        logger.debug("Sample debug message");  
	        logger.info("Sample info message");  
	        logger.warn("Sample warn message");  
	        logger.error("Sample error message");  
	        logger.fatal("Sample fatal message");  
	    }  
}