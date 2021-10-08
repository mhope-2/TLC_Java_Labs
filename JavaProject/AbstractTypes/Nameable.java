package JavaProject.AbstractTypes;

public interface Nameable {

    static Object toString(Nameable nameable, Object o) {
        return nameable.getName();
    }

    public String getName();

}
