package assignment4;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.function.BinaryOperator;

public class RodCutter {

    public List<Integer> cutRod(int length, List<Integer> prices) {

        if(length < 1)
          return Arrays.asList(0);

        if(length == 1) {
          return Arrays.asList(lookupPrice(length, prices), 1);
        }

        List<Integer> priceForLength = Arrays.asList(lookupPrice(length, prices), length);

        BinaryOperator<List<Integer>> accumulator = (previousResult, indexWrappedInList) -> {
          int index = indexWrappedInList.get(0);
          List<Integer> part1 = cutRod(index, prices);
          List<Integer> part2 = cutRod(length - index, prices);

          int revenue = part1.get(0) + part2.get(0);

          if(previousResult.get(0) > revenue)
            return previousResult;

          List<Integer> result = new ArrayList<>();
          result.add(revenue);
          result.addAll(part2.subList(1, part2.size()));        
          result.addAll(part1.subList(1, part1.size()));
          return result;
        };

        return Stream.iterate(1, next -> next + 1)
                     .limit(length - 1)
                     .map(number -> {List<Integer> index = Arrays.asList(number); return index;})
                     .reduce(priceForLength, accumulator);      
      }

      public int lookupPrice(int length, List<Integer> prices) {
        return prices.size() >= length ? prices.get(length - 1) : 0;
      }
}