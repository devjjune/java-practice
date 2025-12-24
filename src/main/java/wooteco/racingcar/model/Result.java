package wooteco.racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Result {
    public List<String> winnersName = new ArrayList<>();

    public List<String> calculateWinner(Map<String, Integer> carFinalPositions) {
        int maxScore = Collections.max(carFinalPositions.values());

        for (Map.Entry<String, Integer> entry : carFinalPositions.entrySet()) {
            addIfMaxScore(entry, maxScore, winnersName);
        }

        return winnersName;
    }

    public void addIfMaxScore(Map.Entry<String, Integer> entry, int maxScore, List<String> winners) {
        if (entry.getValue() == maxScore) {
            winners.add(entry.getKey());
        }
    }
}
