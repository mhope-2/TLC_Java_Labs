package tdd_lab;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> printFibonacciNumbers(int n) {

        int firstNum = 0, secondNum = 1, counter;

        List<Integer> firstFibList = new java.util.ArrayList<>(List.of(0));
        List<Integer> secondFibList = new java.util.ArrayList<>(List.of(0, 1));

        if (n <= 1)
            return firstFibList;
        else if (n == 2){
            return secondFibList;
        }

        for (counter = 2; counter < n; counter++) {
            int next = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = next;
            secondFibList.add(secondNum);
        }
        return secondFibList;
    }

    @Test
    public void getFirstFibonacciNumbers(){
        assertEquals(printFibonacciNumbers(1), List.of(0));
    }

    @Test
    public void getFirstTwoFibonacciNumbers(){
        assertEquals(printFibonacciNumbers(2), List.of(0, 1));
    }

    @Test
    public void getFirstSevenFibonacciNumbers(){
        assertEquals(printFibonacciNumbers(7), List.of(0, 1, 1, 2,3,5,8));
    }
}
