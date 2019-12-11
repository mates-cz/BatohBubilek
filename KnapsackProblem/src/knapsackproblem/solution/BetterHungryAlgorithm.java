package knapsackproblem.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import knapsackproblem.item.Bag;
import knapsackproblem.item.Items;

public class BetterHungryAlgorithm extends Algorithm {

    List<BetterHungryAlgorithmRatioItem> ratios;

    public BetterHungryAlgorithm(Items items, int capacity) {
        super(items, capacity);
        ratios = new ArrayList<>();
    }

    @Override
    public Bag run() {
        items.getItems().forEach((item) -> {
            ratios.add(new BetterHungryAlgorithmRatioItem(item));
        });
        ratios.sort(Comparator.comparing(BetterHungryAlgorithmRatioItem::getRatio).reversed());
        ratios.forEach((BetterHungryAlgorithmRatioItem ratioItem) -> {
            bag.add(ratioItem.getItem());
        });
        return bag;
    }

}
