package wooteco.racingcar.model;

import java.util.*;

public class Cars {
    public List<String> cars = new ArrayList<>();

    public List<String> parseInputName(String inputNames) {
        String[] names = inputNames.split(",");
        cars.addAll(Arrays.asList(names));

        return cars;
    }
}
