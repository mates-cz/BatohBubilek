package knapsackproblem.solution;

import knapsackproblem.item.IItem;

public class BetterHungryAlgorithmRatioItem {

    private final IItem item;

    public BetterHungryAlgorithmRatioItem(IItem item) {
        this.item = item;
    }

    public double getRatio() {
        return item.getPrice() / item.getWeight();
    }

    public IItem getItem() {
        return item;
    }
}
