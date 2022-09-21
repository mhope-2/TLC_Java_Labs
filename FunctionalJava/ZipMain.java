package FunctionalJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZipMain {
    public static void main(String[] args) {
        ZipIntImp imp = new ZipIntImp();

        String[] string1 = {"one", "two", "three"};
        String[] string2 = {"four", "five", "six"};

        List<String> stringList1 = new ArrayList<>();

        Collections.addAll(stringList1, string1);

        List<String> stringList2 = new ArrayList<>(Arrays.asList(string2));


        System.out.println(imp.Zip(stringList1, stringList2));

    }
}
