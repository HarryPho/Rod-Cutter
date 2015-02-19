package assignment4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RodCutterMemoized extends RodCutter {
	
	private final Map<Integer, List<Integer>> storeResults = new HashMap<>();

	public List<Integer> cutRod(int length, List<Integer> prices) {
		return storeResults.computeIfAbsent(length, k -> super.cutRod(k, prices));
	}
}