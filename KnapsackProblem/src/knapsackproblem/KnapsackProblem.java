package knapsackproblem;

import knapsackproblem.item.Items;
import knapsackproblem.solution.BetterHungryAlgorithm;
import knapsackproblem.solution.HungryAlgorithm;
import knapsackproblem.solution.RandomAlgorithm;

public class KnapsackProblem {

    public static void main(String[] args) {

        Items items = BookLoader.read("items/items-20.csv");        
        items.print("KnapsackProblem\n*All items:");
        int bagCapacity = 30;
        
        (new RandomAlgorithm(items, bagCapacity)).run().print("Random Alg");
        
        (new HungryAlgorithm(items, bagCapacity)).run().print("Hungry Alg");
        
        (new BetterHungryAlgorithm(items, bagCapacity)).run().print("Better Hungry Alg");
    }

}
