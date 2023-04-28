import java.util.*;
class Main { 
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
      while(true){
      try{quartsNeeded = Integer.parseInt(input.next());}
        catch (NumberFormatException e) {
                System.out.println("Nonnumeric ID");}
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
     
   }
}
}

