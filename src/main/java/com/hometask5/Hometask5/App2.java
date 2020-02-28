package com.hometask5.Hometask5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


/**
 * Hello world!
 *
 */
public class App2 
{
        private static final Logger LOGGER = (Logger) LogManager.getLogger(App2.class);
        public static void main( String[] args )
        {
        	//simple interest
        	Scanner sc = new Scanner(System.in);
        	int SI,p,t,r;
        	p= sc.nextInt();
        	t = sc.nextInt();
        	r = sc.nextInt();
        	SI = (int) (p*t*r)/100;
        	LOGGER.debug(SI);
        	LOGGER.debug("This is debug!");
           LOGGER.info("This is info");
           LOGGER.warn("This is warn!");
           LOGGER.error("This is error!");
           LOGGER.fatal("This is fatal error");
        }
    }
