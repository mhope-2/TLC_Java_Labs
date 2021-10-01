package lab1;

import java.util.Random;

public class RandPrint {
    public static void main(String[] args) {

            Random rand = new Random();
            int randNum = rand.nextInt(10);

            switch (randNum){
                case 0:
                    System.out.println( randNum + "   "+ "Zero");
                    break;
                case 1:
                    System.out.println( randNum + "   "+ "One");
                    break;
                case 2:
                    System.out.println( randNum + "   "+ "Two");
                    break;
                case 3:
                    System.out.println( randNum + "   "+ "Three");
                    break;
                case 4:
                    System.out.println( randNum + "   "+ "Four");
                    break;
                case 5:
                    System.out.println( randNum + "   "+ "Five");
                    break;
                case 6:
                    System.out.println(randNum + "   "+ "Six");
                    break;
                case 7:
                    System.out.println( randNum + "   "+ "Seven");
                    break;
                case 8:
                    System.out.println( randNum + "   "+ "Eight");
                    break;
                case 9:
                    System.out.println( randNum + "   "+ "Nine");
                    break;

            }
            }

        }
