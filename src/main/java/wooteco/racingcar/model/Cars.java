package wooteco.racingcar.model;

import java.util.*;

public class Cars {
    public List<Car> cars = new ArrayList<>();

    public void generateCars(String inputNames) {
        String[] names = inputNames.split(",");
        for (String name : names) {
            Car car = new Car(name);
            cars.add(car);
        }
    }
}
