/**
 * Auto Generated Java Class.
 */
public class SignInfo {
  private int month;
  private int day;
  
  public SignInfo(int aMonth, int aDay) { 
    month = aMonth;
    day = aDay;
  }
  
  public String AstroSign() {
    String astroSign = "";
    String horoscope = "";
    
    if ((month == 1 && (day > 0 && day <=19)) || (month == 12 && day > 21)) {
      astroSign = "Capricorn";
      horoscope = "you are a naturally good indenter.  Your code is very easy to read";
    }
        
    else if ((month == 1 && day >=20) || (month == 2 && (day > 0 && day <=18))) {
      astroSign = "Aquarius";
      horoscope = "you are a System class user.  Println";
    }
    
    else if ((month == 2 && day > 18) || (month == 3 && (day > 0 && day <=20))) {
      astroSign = "Pisces";
      horoscope = "you are easily frusterated by error codes that don't give the correct line numbers";
    }
    
    else if ((month == 3 && day > 20) || (month == 4 && (day > 0 && day <= 19))) {
      astroSign = "Aries";
      horoscope = "you are a big fan of Python since you hate curly brackets";
    }
    
    else if ((month == 4 && day > 19) || (month == 5 && (day < 0 && day <= 20))) {
      astroSign = "Taurus";
      horoscope = "you are a natural hater of people who don't comment their code";
    }
    
    else if ((month == 5 && day > 20) || (month == 6 && (day > 0 && day <= 20))) {
      astroSign = "Gemini";
      horoscope = "you are easily bothered by people who don't know how to do double division";
    }
    
    else if ((month == 6 && day >= 21) || (month == 7 && (day  > 0 && day <=22))) {
      astroSign = "Cancer";
      horoscope = "you love when people have one comment per line of code";
    }
    
    else if ((month == 7 && day > 22) || (month == 8 && (day > 0 && day <= 22))) {
      astroSign = "Leo";
      horoscope = "you despise people who try to copy your code with no idea of what it means";
    }
    
    else if ((month == 8 && day > 22) || (month == 9 && (day > 0 && day <= 22))) { 
      astroSign = "Virgo";
      horoscope = "you most likely hate people who talk to themselves when coding...";
    }
    
    else if ((month == 9 && day > 22) || (month == 10 && (day > 0 && day <= 22))) {
      astroSign = "Libra";
      horoscope = "you are disgusted by Dr. Java never remembering to keep the Eclipse compiler on...";
    }
    
    else if ((month == 10 && day > 22) || (month == 11 && (day > 0 && day <= 21))) {
      astroSign = "Scorpio";
      horoscope = "you wish Dr. Java had a dark mode to ease the pain on your eyes of looking at so many strings";
    }
    
    else if ((month == 11 && day > 21) || (month == 12 && (day > 0 && day <= 21))) {
      astroSign = "Sagittarius";
      horoscope = "since you are the last astro sign of the year, you study the JavaDocs for fun... werid...";
    }
    String statement = "Your astrosign is " + astroSign + " and your horoscope is " + horoscope;
    return statement;
               
   
  }
  
}
