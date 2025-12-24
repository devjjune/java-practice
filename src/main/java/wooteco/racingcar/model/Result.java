package wooteco.racingcar.model;

import wooteco.racingcar.service.RaceService;
import wooteco.racingcar.view.RaceOutputView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Result {
    public void calculateWinner(Map<String, Integer> carPositions) {
        int maxScore = Collections.max(carPositions.values());
        List<String> winnersName = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : carPositions.entrySet()) {
            RaceService service = new RaceService();
            service.addIfMaxScore(entry, maxScore, winnersName);
        }

        RaceOutputView outputView = new RaceOutputView();
        outputView.printWinner(winnersName);
    }

    public void addIfMaxScore(
            Map.Entry<String, Integer> entry, int maxScore, List<String> winners) {
        if (entry.getValue() == maxScore) {
            winners.add(entry.getKey());
        }
    }
}
