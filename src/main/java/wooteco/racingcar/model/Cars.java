package wooteco.racingcar.model;

import java.util.*;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputNames) {
        this.cars = initCars(inputNames);
    }

    public void moveCars(NumberGenerator numberGenerator) {
        for (Car car : cars) {
            car.movePosition(numberGenerator);
        }
    }

    public List<String> calculateWinners() {
        int maxPosition = calculateMaxPosition();
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private List<Car> initCars(String inputNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = inputNames.split(",");
        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private int calculateMaxPosition() {
        int max = 0;
        for (Car car : cars) {
            if (car.getPosition() > max) {
                max = car.getPosition();
            }
        }
        return max;
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
