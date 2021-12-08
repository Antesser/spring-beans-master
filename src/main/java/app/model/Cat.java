package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    public Cat() {
    }

    public String toString() {
        return "I'm a Cat";
    }
}
