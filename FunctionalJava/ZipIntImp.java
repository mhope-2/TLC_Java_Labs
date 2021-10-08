package FunctionalJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ZipIntImp implements ZipInt {

    @Override
    public List<List<String>> Zip(List<String> list1, List<String> list2) {
        List<List<String>> convolutedList = new ArrayList<>();

        ListIterator<String> iterator1 = list1.listIterator();
        ListIterator<String> iterator2 = list2.listIterator();


        for(int i = 0; i< list1.size(); i++){
                List<String> stringList = makeListOfStrings(list1.get(i), list2.get(i));
                convolutedList.add(stringList);
        }

        return convolutedList;
    }

    public List<String> makeListOfStrings(String str1, String str2){
        List<String> stringList = new ArrayList<>();
        stringList.add(str1);
        stringList.add(str2);

        return stringList;
    }
}

//    static BiFunction<List<String>,List<String>, List<String>> zip = (firstList, secondList)
//            ->
//    {
//        List<String> times = new ArrayList<>();
//        times.addAll(firstList);
//        times.addAll(secondList);
//        return times;
//    };
//
//    Collection apply = zip.apply(List.of("One", "Two", "Theree"), List.of("Seven", "Eight"));
//        System.out.println(apply);


