package com.epam.logger.ass;
import  simpleinterest.*;
import  compoundinterest.*;
import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class App 
{
	private static final Logger logg= LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
        logg.info("\nPress 1 for Simple_Interest\n 2 for CompoundInterest:");
        int choosedoption=scanner.nextInt();
        logg.info("Enter the Amount");
        int amount=scanner.nextInt();
        logg.info("Enter the Period or Time of interest in Years:");
        float timeperiod=scanner.nextFloat();

        logg.info("Enter the Rate of Interest per annum:");
        float rateperannum=scanner.nextFloat();
        
        
        switch(choosedoption)
        {
        
        case 1: float simple_interest=SimpleInterest.calculateSimpleInterst(amount, timeperiod, rateperannum);
                logg.info("The simple interest for given amount is " +simple_interest);
                break;
                
                
        case 2: float compound_interest=CompoundInterest.CalculateCompoundInterest(amount, timeperiod, rateperannum);
        		logg.info("The coumpound interest for given amount is "+ compound_interest);
        		break;
        
        	     
        default: logg.info("Sorry you have entered an Invalid option");
                 break;
        
        }
    }
}
