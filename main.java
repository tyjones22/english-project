import java.util.*;

public class AltRightMain{
public static void main (String [] args)
  {
  
    Scanner k = new Scanner (System.in);
    System.out.println("Hello! Welcome to the Alt-Right Trail ( A simple parody of the Oregon Trail )");
    System.out.println("Generating your stats");
    
    
    String [] races = new String [] {"White","Black","Other Race"};
    String [] sex = new String [] {"Male","Female"};
   
    
    String playerRace= "";
    String playerSex="";
    
      Random rand= new Random();
      int whiteTest= rand.nextInt(4)+1;
      int blackTest= rand.nextInt(3)+1;
    
      if ( whiteTest < 4){
        playerRace = races[0];
        }
      else if ( blackTest==3){
        playerRace= races[1];
        }
      else
        playerRace= races[2];
    
      int sexTest = rand.nextInt(4);
    
      if ( sexTest < 4){
        playerSex = sex[0];
        }
      else {
        playerSex= sex[1];
        }
    
    int playerAge= rand.nextInt(13)+13;
    boolean young = false;
    boolean old = false;
  
  
    if ( playerAge < 18)
    young = true;
    
    else
    old = true;
  
  
    System.out.println(" You are a "+playerAge+" "+playerRace+" "+playerSex+". Enjoy.");
  
    if (young){
    System.out.println("You made a Youtube, Facebook, and Tiktok account.\nYou end up watching a few 
               }
    
    
  }
  
}
