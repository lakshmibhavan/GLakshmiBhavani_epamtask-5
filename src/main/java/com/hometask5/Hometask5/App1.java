package com.hometask5.Hometask5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
public class App1 
{
	 private static final Logger LOGGER = (Logger) LogManager.getLogger(App1.class);
     public static void main( String[] args )
     {
     	Scanner sc = new Scanner(System.in);
     	String materialType = sc.next()+sc.nextLine();
     	double totalarea = sc.nextDouble();
     	if(materialType.equals("Standard Materials"))
		{
			LOGGER.info(1200*totalarea);
		}
		else if(materialType.equals("Above Standard Materials"))
		{
			LOGGER.info(1500*totalarea);
		}
		else if(materialType.equals("High Standard Materials"))
		{
		    LOGGER.info(1800*totalarea);
		}
		else if(materialType.equals("High Standard Materials and fully automated home"))
		{
			LOGGER.info(2500*totalarea);
		}
     	LOGGER.debug("This is debug!");
        LOGGER.warn("This is warn!");
        LOGGER.error("This is error!");
        LOGGER.fatal("This is fatal error");
     }
}
