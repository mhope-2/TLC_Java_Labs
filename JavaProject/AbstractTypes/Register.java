package JavaProject.AbstractTypes;

import java.util.List;
import java.util.stream.Collectors;

public class Register {

    private List<Nameable> nameables;

    public Register(List<Nameable> nameables) {
        this.nameables = nameables;
    }

    public List<Object> getRegister(){

        return this.nameables.stream()
                .map(nameable -> Nameable.toString(nameable, null))
                .collect(Collectors.toList());
    }
}
