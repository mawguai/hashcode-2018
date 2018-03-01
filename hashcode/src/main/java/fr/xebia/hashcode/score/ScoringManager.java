package fr.xebia.hashcode.score;

public class ScoringManager {

    private int total = 0;
    private int bonus;

    public ScoringManager(int bonus) {
        this.bonus = bonus;
    }

    public void addScore(int earliestStart, int latestFinish, int currentStep) {
        if (latestFinish >= currentStep) {
            total += latestFinish - earliestStart;
        }

        if (latestFinish == currentStep) {
            total += bonus;
        }
    }

    public int getTotal() {
        return total;
    }

}
