import java.util.*;

/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/21/2022, Friday
 * @project : dynamic-programming-memoization-best-sum
 **/
public class BestSum {

    public static ArrayList<Integer> bestSum(Integer targetSum, List<Integer> numbers, Map<Integer, ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }
        ArrayList<Integer> leastCombination = null;
        for (int num : numbers) {
            int reminder = targetSum - num;
            ArrayList<Integer> bestSums = bestSum(reminder, numbers, memo);
            if (bestSums != null) {
                ArrayList<Integer> numbersList = new ArrayList<>(bestSums);
                numbersList.add(num);
                if (leastCombination == null || numbersList.size() < leastCombination.size()) {
                    leastCombination = numbersList;
                }
            }
        }
        if (!memo.containsKey(targetSum)){
            memo.put(targetSum, leastCombination);
        }
        return memo.get(targetSum);
    }

    public static void print(List<Integer> array) {
        if (array == null) {
            return;
        }
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(bestSum(7, Arrays.asList(5, 3, 4, 7), new HashMap<>()));
        print(bestSum(8, Arrays.asList(2, 3, 5), new HashMap<>()));
        print(bestSum(8, Arrays.asList(1, 4, 5), new HashMap<>()));
        print(bestSum(100, Arrays.asList(1, 2, 5, 25), new HashMap<>()));
    }
}
