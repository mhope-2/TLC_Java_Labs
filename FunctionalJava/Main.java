package FunctionalJava;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> addition = arithmeticOps("add");
        System.out.println("sum of 5 and 3 = " + addition.apply("add"));

        Function<String, Integer> subtraction = arithmeticOps("subtract");
        System.out.println("difference between 5 and 3 = " + subtraction.apply("subtract"));

        Function<String, Integer> power = arithmeticOps("power");
        System.out.println("5 ^ 3 = " + power.apply("power"));
    }


    public static Function<String, Integer> arithmeticOps(String opName){

        int operand1 = 5, operand2 = 3;

        switch (opName){
            case "add":
                return (result -> operand1 + operand2);
            case "subtract":
                return (result -> operand1 - operand2);
            case "power":
                return (result -> (int) Math.pow(operand1, operand2));
            default:
                return (result ->  -1);
        }
    }


}
