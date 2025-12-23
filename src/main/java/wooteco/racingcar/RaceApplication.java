package wooteco.racingcar;

import wooteco.racingcar.controller.RaceController;

public class RaceApplication {
    public static void main(String[] args) {
        RaceController controller = new RaceController();
        controller.run();
    }
}
