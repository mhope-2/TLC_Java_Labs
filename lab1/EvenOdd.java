package lab1;

import java.util.Random;

public class EvenOdd {

  public static void main (String[] args){
	Random rand = new Random();
      
        int randNum = rand.nextInt(101);

        String msg = (randNum % 2 == 0) ? "Even" : "Odd";
       
        System.out.println(randNum + " is: " + msg);
  }

}