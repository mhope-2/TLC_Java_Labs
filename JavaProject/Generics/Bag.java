package JavaProject.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Iterable<T> {
    private List<T> elements = new ArrayList<>();

    public void add(T el){
        elements.add(el);
    }

    public void remove(T el){
        elements.remove(el);
    }

    public void clear(T el){
        elements.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
