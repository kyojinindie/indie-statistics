package com.kyojin.indie.statistics;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Statistic {
	
	private static Double mean;
	private static Double s;
	private static Double kurtosis;
	
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
	
	public static Number populationStandardDeviation(ArrayList<Number> numberList) {
		clear();
		numberList.forEach(n -> {
			s += Math
					.pow(n.doubleValue() - mean(numberList).doubleValue(), 2);
		});
		 
		return Math.sqrt(s/numberList.size());
	}
	
	public static Number kurtosisUngroupedData(ArrayList<Number> numberList) {
		clear();
		
		numberList.forEach(n -> {
			kurtosis += Math.pow((n.doubleValue()-mean(numberList).doubleValue()), 4);
		});
		return kurtosis/(numberList.size()*Math
				.pow(populationStandardDeviation(numberList).doubleValue(), 4));
	}
	
	private static void clear() {
		mean = 0.0;
		s = 0.0;
		kurtosis = 0.0;
	}
}
