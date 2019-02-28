/**
 * Jacob Lee
 * Birthday Project
 */
import java.util.Scanner;
public class BirthdayRunner {
 
  
  public static void main(String[] args) { 
    String ending = "";
    Scanner kb = new Scanner(System.in);
    System.out.println("Please put the month # in the first box and the day # in the second box");
    int month = kb.nextInt();
    int day = kb.nextInt();
    
    if(day == 1 || day == 21 || day == 31)
       ending = "st";
    else if(day == 2 || day == 22)
       ending = "nd";
    else if(day == 3 || day == 23)
       ending = "rd";
    else
       ending = "th";
    
    //Objects
    SignInfo sign = new SignInfo(month, day);
    MonthInfo info = new MonthInfo(month);
    
    String monthName = info.getMonthName();
    String statement = sign.AstroSign();
    String birthStone = info.BirthStone();
    String flower = info.Flower();
    
    //
   if(month==2 && (day <= 0 || day > 29))
     System.out.println("ERROR: INVALID DATE");
   else if((month == 4 || month == 6 || month == 9 || month == 11) && (day <= 0 || day > 30))
    System.out.println("ERROR: INVALID DATE");
   else if ((month <= 0 || month > 12) || (day < 0 || day >= 32))
     System.out.println("ERROR: INVALID DATE");
   else {
     System.out.println("Your birthday is " + monthName + " " + day + ending + ".  " + monthName + "'s birthstone is the " 
                          + birthStone + " and flower is the " + flower + ". \n" 
                          + statement + "."); 
     
   }
  }
  
  /* ADD YOUR CODE HERE */
  
}
