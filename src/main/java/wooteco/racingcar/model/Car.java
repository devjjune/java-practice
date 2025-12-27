package wooteco.racingcar.model;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void movePosition(NumberGenerator numberGenerator) {
        if (numberGenerator.generate() >= 4) {
            position ++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
