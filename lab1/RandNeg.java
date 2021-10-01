package lab1;

import java.util.concurrent.ThreadLocalRandom;

public class RandNeg {
    public static void main(String[] args) {
        int rand = ThreadLocalRandom.current().nextInt(-3, 4);

    // using do/while
//        do {
//            System.out.println(rand);
//            break;
//        } while (rand != 0);

//        using while
        while (rand != 0){
            System.out.println(rand);
            break;
        }
    }
}
