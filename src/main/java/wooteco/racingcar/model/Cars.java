package wooteco.racingcar.model;

import java.util.*;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputNames) {
        this.cars = initCars(inputNames);
    }

    private List<Car> initCars(String inputNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = inputNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public void moveCars(NumberGenerator numberGenerator) {
        for (Car car : cars) {
            car.movePosition(numberGenerator);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
