package org.likui.study.spark.pre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CollectionUtils {
	public static <T> List<T> map(List<T> input, Function processor) {
		ArrayList result = new ArrayList();
		for(T obj : input) {
			result.add(processor.apply(obj));
		}
		return result;
	}
	
	public static void main(String... args) {
		List input = Arrays.asList(new String[] {"apple", "orange", "pear"});
//		List length = CollectionUtils.map(input, v -> {
//			
//		});
		List uppercase = CollectionUtils.map(input,  (v) -> ((String) v).toUpperCase());
	}
}
