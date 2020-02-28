package com.hometask5.Hometask5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
public class App 
{
	 private static final Logger LOGGER = (Logger) LogManager.getLogger(App.class);
     public static void main( String[] args )
     {
     	Scanner sc = new Scanner(System.in);
    	int CI,p,t,r,n;
    	p= sc.nextInt();
    	t = sc.nextInt();
    	r = sc.nextInt();
    	n = sc.nextInt();
    	CI = (int) (p * Math.pow(1 + (r / n), n * t))-p;;
    	LOGGER.debug(CI);
    	LOGGER.debug("This is debug!");
       LOGGER.info("This is info");
       LOGGER.warn("This is warn!");
       LOGGER.error("This is error!");
       LOGGER.fatal("This is fatal error");
}
}
