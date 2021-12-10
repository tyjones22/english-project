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
    boolean younger = false;
    boolean old = false;
  
  
    if ( playerAge < 18)
     younger = true;
  
    else 
      old = true;
    
    int playerAgeTest;
   
  
   System.out.println(" You are a "+playerAge+" "+playerRace+" "+playerSex+". Enjoy.");
  
  
    if (younger)
      playerAgeTest= 0;
    else 
      playerAgeTest= 1;
    
    switch (playerAgeTest){
    
      case 1 : System.out.println("You made a Youtube, Facebook, and Tiktok account.\nYou end up watching a few games videos because they're popular "+
                       "and all of your friends watch them.");
        
    }
  
   
  
  
 
    
               }
    
    
  }
  
}
