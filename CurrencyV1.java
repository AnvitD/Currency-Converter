/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Anvit Dhamnekar 
 */

public class CurrencyV1 
{ 
    public static void main(String [ ] args) 
    { 
        // information about the programm
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        
        System.out.println("Starting budget(US Dollars):                 $6500");
        double budget = 6500;
        System.out.println();
        //Country 1 
        double pesosSpent = 7210.25;            
        double pesoExchangeRate = 0.049;     
        double dollarsSpentInMexico = pesosSpent * pesoExchangeRate;      
        double dollarsAfterMexico = budget - dollarsSpentInMexico; 

        
        System.out.println("Mexico"); 
        System.out.println("  Pesos Spent:" +   pesosSpent); 
        System.out.println("  US Dollar equivalent:"  + dollarsSpentInMexico);
        System.out.println("  US Dollar remaining:"   + dollarsAfterMexico);
        System.out.println();
        
        //Country 2 
        double budgetRemaining = dollarsAfterMexico; 
        double australianDollarSpent = 4496;            
        double australianDollarExchangeRate = 0.74;     
        double dollarsSpentInAustralia = australianDollarSpent * australianDollarExchangeRate;     
        double dollarsAfterAustralia = budgetRemaining - dollarsSpentInAustralia;
        
        
        System.out.println("Australia"); 
        System.out.println("  Australia Dollars Spent:" +  australianDollarSpent); 
        System.out.println("  US Dollar equivalent:"  + dollarsSpentInAustralia);
        System.out.println("  US Dollar remaining:"   + dollarsAfterAustralia);
        System.out.println();
        
        //Country 3 
        double budgetRemaining2 = dollarsAfterAustralia; 
        double georgianLariSpent = 5500;            
        double georgianLariExchangeRate = 0.32;     
        double dollarsSpentInGeorgia = georgianLariSpent * georgianLariExchangeRate;     
        double dollarsAfterGeorgia = budgetRemaining2 - dollarsSpentInGeorgia;
        
        
        System.out.println("Georgia"); 
        System.out.println("  Gerogian Lari Spent:" +   georgianLariSpent); 
        System.out.println("  US Dollar equivalent:"  + dollarsSpentInGeorgia);
        System.out.println("  US Dollar remaining:"   + dollarsAfterGeorgia);
        System.out.println();
        System.out.println();
        System.out.println("Remaining dollars:                           $1059.66");
        
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Sovenir Purchases");
        System.out.println("   (all values in US Dollars)"); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Sovenir 1 
        int cost1 = 6;
        int budgetSovenir1 = 150; 
        int totalItems1 = 15;
        int fundsRemaining1 = budgetSovenir1 - ( cost1 * totalItems1); 
        
        System.out.println("Sovenir 1"); 
        System.out.println("    Cost per item : $" + cost1); 
        System.out.println("    Budget: " + budgetSovenir1); 
        System.out.println("    Total items purchased: " + totalItems1); 
        System.out.println("    Funds remaining: $" + fundsRemaining1); 
        System.out.println(); 
        
        //Sovenir 2 
        int cost2 = 9;
        int budgetSovenir2 = 100; 
        int totalItems2 = 8;
        int fundsRemaining2 = budgetSovenir2 - ( cost2 * totalItems2); 
        
        System.out.println("Sovenir 2"); 
        System.out.println("    Cost per item: $" + cost2); 
        System.out.println("    Budget: " + budgetSovenir2); 
        System.out.println("    Total items purchased: " + totalItems2); 
        System.out.println("    Funds remaining: $" + fundsRemaining2); 
        System.out.println(); 
        
        //Sovenir 3 
        int cost3 = 2;
        int budgetSovenir3 = 200; 
        int totalItems3 = 52;
        int fundsRemaining3 = budgetSovenir3 - ( cost3 * totalItems3); 
        
        System.out.println("Sovenir 3"); 
        System.out.println("    Cost per item: $" + cost3); 
        System.out.println("    Budget: " + budgetSovenir3); 
        System.out.println("    Total items purchased: " + totalItems3); 
        System.out.println("    Funds remaining: $" + fundsRemaining3); 
        System.out.println(); 
    }
}