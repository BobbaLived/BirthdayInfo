/**
 * Auto Generated Java Class.
 */
public class MonthInfo {
  private int month;
  
  public MonthInfo(int monthInt) { 
    month=monthInt;
  }
  
  
  public String BirthStone()
  {
    //Find the BirthStone of the month and return it from this method
    String birthStone="";
    if (month ==1)
      birthStone = "Garnet";
    else if (month == 2)
      birthStone = "Amethyst";
    else if (month == 3)
      birthStone = "Aquamarine";
    else if (month == 4)
      birthStone = "Diamond";
    else if (month == 5)
      birthStone = "Emerald";
    else if (month == 6)
      birthStone = "Pearl";
    else if (month == 7)
      birthStone = "Ruby";
    else if (month == 8)
      birthStone = "Peridot";
    else if (month == 9)
      birthStone = "Sapphire";
    else if (month == 10)
      birthStone = "Opal";
    else if (month == 11)
      birthStone = "Topaz";
    else if (month == 12)
      birthStone = "Turqoise";
    
    return birthStone;
  }
  ////////////////////////////////////////////
  public String Flower() {
    String flower="";
    if (month ==1)
      flower = "Carnation";
    else if (month == 2)
      flower = "Violet";
    else if (month == 3)
      flower = "Jonquil";
    else if (month == 4)
      flower = "Sweet Pea";
    else if (month == 5)
      flower = "Lily of the Valley";
    else if (month == 6)
      flower = "Rose";
    else if (month == 7)
      flower = "Larkspur";
    else if (month == 8)
      flower = "Gladiolus";
    else if (month == 9)
      flower = "Aster";
    else if (month == 10)
      flower = "Calendula";
    else if (month == 11)
      flower = "Chrysanthemum";
    else if (month == 12)
      flower = "Narcissus";
    
    return flower;
  }
  
  //////////////////////////////////////////////
   public String getMonthName()
   {
     String monthName= "";
     //using month number to get name
     if(month==1)
       monthName="January";
     if(month==2)
       monthName="Febuary";
     if(month==3)
       monthName="March";
     if(month==4)
       monthName="April";
     if(month==5)
       monthName="May";
     if(month==6)
       monthName="June";
     if(month==7)
       monthName="July";
     if(month==8)
       monthName="August";
     if(month==9)
       monthName="September";
     if(month==10)
       monthName="October";
     if(month==11)
       monthName="November";
     if(month==12)
       monthName="December";
     
     return monthName;
   }
   
    
  
}
