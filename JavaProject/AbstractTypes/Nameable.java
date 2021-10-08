package JavaProject.AbstractTypes;

public interface Nameable {

    static String toString(Nameable nameable) {
        return nameable.getName();
    }

    public String getName();

}
