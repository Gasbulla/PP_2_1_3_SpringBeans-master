package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.security.PrivateKey;

@Component
public class Dog extends Animal {

    private final String animals;

    public Dog(String animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
