package basicmodule.thirdhometask.thirdpart.task4;

import java.util.Objects;

public class Participant implements Comparable<Participant> {
    private final String name;
    private Dog dog;

    Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(name, that.name) && Objects.equals(dog, that.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dog);
    }

    @Override
    public int compareTo(Participant o) {
        return this.dog.getAvgRating().compareTo(o.dog.getAvgRating());
    }

    @Override
    public String toString() {
        return name + ": "
                + dog.getNickName() + ", "
                + dog.getAvgRating();
    }
}

