import java.util.*;

public class Main{

  {
  
    Scanner k = new Scanner (System.in);
    System.out.println("Hello! Welcome to the Alt-Right Trail ( A simple parody of the Oregon Trail )");
    System.out.println("Generating your stats");
    
    
    String [] races = new String {"White","Black","Other"};
    String [] sex = new String {"Male","Female"};
    String [] races = new String {"White","Black","Other"};
    
    String playerRace= "";
    
      Random rand= new Random();
      int whiteTest= rand.NextInt(4)+1;
      int blackTest= rand.NextInt(3)+1;
    
      if ( whiteTest < 4){
        playerRace = races[0];
        }
      else if ( blackTest==3){
        playerRace= races[1];
        }
      else
        playerRace= races[2];
    
      int sexTest = rand.NextInt(4)
    
    
  }
  
}
