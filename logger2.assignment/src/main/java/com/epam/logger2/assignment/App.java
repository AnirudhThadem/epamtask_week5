package com.epam.logger2.assignment;

import org.apache.logging.log4j.Logger;

import java.util.*;
import constructioncost.*;

import org.apache.logging.log4j.LogManager;

public class App 
{ 
	private static final Logger logg= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
        logg.info( "Please choose the standard of material you want from the below options " );
        logg.info("\n1) STANDARD MATERIALS- 1200INR per sq.ft\n2) ABOVE STANDARD MATERIALS - 1500INR per sq.ft\n3) HIGH STANDARD MATERIALS - - 1800INR per sq.ft \n4) HIGH STANDARD MATERIALS AND FULLY AUTOMATED HOME - 2500INR per sq.ft\n");
        
        int choosedoption=scanner.nextInt();
        float area=0;
        if(choosedoption>0 && choosedoption<=4) {
        logg.info("Enter the total area of house in sq.ft:");
         area=scanner.nextInt();
        }
        
        float totalcost=0;
        boolean flag=false;
        switch(choosedoption)
        {
        
        case 1: totalcost=CostOfConstruction.getConstructionCost(1200,area);
                break;
               
        case 2: totalcost=CostOfConstruction.getConstructionCost(1500,area);
                break;
                
        case 3: totalcost=CostOfConstruction.getConstructionCost(1800,area);
                break;
                
        case 4: totalcost=CostOfConstruction.getConstructionCost(2500,area);
                break;
                 
        default :logg.info("You have entered an invalid option ");
                 flag=true;
                 break;
        
        
        
        
        }
        
        if(!flag)
        {
        logg.info("The Estimated cost for construction of house  is  "+totalcost);
        }
    }
}
