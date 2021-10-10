package JavaProject.AbstractTypes;

import JavaProject.Enums.Level;

public interface Nameable {

    static String toString(Nameable nameable) {
        return nameable.getName();
    }

    String getName();

    Level getLevel();
}
