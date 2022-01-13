package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog extends Animal {
    public Dog() {
    }

    public String toString() {
        return "I'm a Dog";
    }
}
