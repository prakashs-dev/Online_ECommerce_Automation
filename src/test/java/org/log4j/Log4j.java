package org.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	
	//    factory design pattern
	
	static Logger log = Logger.getLogger(Log4j.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure(".\\log4j\\log4j.properties");
		
		log.debug("Debug");
		
		log.fatal("fatal");
		
		log.warn("Warning");
		
		log.info("Information");
		
		log.error("Error");
		
	}
	

}
