package FunctionalJava;

import java.util.function.Function;

public class Currying {
    public static void main(String[] args) {
        Function<Integer, Integer> curryAddition = curryAdd(12);
        System.out.println( curryAddition.apply(180));
    }

    public static Function<Integer, Integer> curryAdd(Integer number){
        return ((arg)-> number + arg);
    }

}
