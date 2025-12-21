package wooteco.calculator.controller;

import wooteco.calculator.service.Service;
import wooteco.calculator.view.InputView;

public class Controller {
    public void run() {
        String input = InputView.readInput();

        Service service = new Service();
        int result = service.parseInput(input);

    }
}
