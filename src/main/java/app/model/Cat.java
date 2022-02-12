package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    private final String animals;

    public Cat(String animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
