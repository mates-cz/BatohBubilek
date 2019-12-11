package knapsackproblem.solution;

import knapsackproblem.item.Bag;
import knapsackproblem.item.Items;

public abstract class Algorithm {

    Items items;
    Bag bag;

    public Algorithm(Items items, int capacity) {
        this.items = items;
        this.bag = new Bag(capacity);
    }

    public abstract Bag run();    

}
