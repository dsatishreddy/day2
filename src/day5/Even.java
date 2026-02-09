package day5;

import java.util.*;
import java.util.stream.*;

public class Even {

	public static void main(String args[]) {

		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };

		Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(list);
	}

}
