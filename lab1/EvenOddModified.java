package lab1;

import java.util.Random;

public class EvenOddModified {

   public static void main (String[] args){
     Random rand = new Random();
     
     int randNum = rand.nextInt(101);

     if (randNum == 0){
         System.out.println(randNum + " - " + "frozen");
     } else if(randNum >= 1 && randNum <= 14){
         System.out.println(randNum + " - " + "cold");
     } else if (randNum >= 15 && randNum <= 24){
         System.out.println(randNum + " - " + "cool");
     } else if (randNum >= 24 && randNum <= 40){
         System.out.println(randNum + " - " + "warm");
     } else if (randNum >= 41 && randNum <= 60){
         System.out.println(randNum + " - " + "hot");
     } else if (randNum >= 61 && randNum <= 80){
         System.out.println(randNum + " - " + "very hot");
     } else if (randNum >= 81 && randNum <= 99){
         System.out.println(randNum + " - " + "extremely hot");
     } else if (randNum == 100){
           System.out.println(randNum + " - " + "boiling");
       }
  }

}