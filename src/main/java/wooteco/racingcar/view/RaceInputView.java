package wooteco.racingcar.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceInputView {
    final String NAMES_MESSSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    final String TRIES_MESSAGE = "시도할 횟수는 몇 회인가요?";
    Scanner scanner = new Scanner(System.in);

    public List<String> readNames() {
        System.out.println(NAMES_MESSSAGE);
        String inputName = scanner.nextLine();
        String[] carArray = inputName.split(",");

        return new ArrayList<>(List.of(carArray));
    }

    public int readTries() {
        System.out.println(TRIES_MESSAGE);
        String inputTries = scanner.nextLine();

        return Integer.parseInt(inputTries);
    }
}
