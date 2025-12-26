package wooteco.racingcar.model;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    private void movePosition(NumberGenerator numberGenerator) {
        int score = numberGenerator.generate();
        if (score >= 4) {
            this.position ++;
        }
    }
}
