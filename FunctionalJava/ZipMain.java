package FunctionalJava;

import java.util.ArrayList;
import java.util.List;

public class ZipMain {
    public static void main(String[] args) {
        ZipIntImp imp = new ZipIntImp();

        String string1[] = {"one", "two", "three"};
        String string2[] = {"four", "five", "six"};

        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();

        for(String string : string1)
            stringList1.add(string);

        for (String string : string2)
            stringList2.add(string);


        System.out.println(imp.Zip(stringList1, stringList2));


    }
}
