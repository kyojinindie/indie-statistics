package com.kyojin.indie.statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Statistic {
	
	private static Double mean;
	private static Double s;
	
	public static Number mean(ArrayList<Number> numberList ) {
		clear();
		numberList.forEach(number -> mean +=  number.doubleValue());
		return mean/numberList.size();
	}
	
	public static Number median(ArrayList<Number> numberList) {
		numberList.sort(null);
		return numberList.get(numberList.size()/2);
	}
	
	public static Number mode(ArrayList<Number> numberList) {
		Map<Number, Long> map = numberList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return Collections.max(map.values());
	}
	
	public static Number sampleStandardDeviation(ArrayList<Number> numberList) {
		clear();
		numberList.forEach(n -> {
			s += Math
					.pow(n.doubleValue() - mean(numberList).doubleValue(), 2);
		});
		 
		return Math.sqrt(s/(numberList.size() -1));
	}
	
	public static void populationStandardDeviation() {
		
	}
	
	private static void clear() {
		mean = 0.0;
		s = 0.0;
	}
}
