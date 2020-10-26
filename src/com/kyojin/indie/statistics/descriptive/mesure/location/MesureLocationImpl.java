package com.kyojin.indie.statistics.descriptive.mesure.location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kyojin.indie.statistics.descriptive.DescriptiveStatistic;

public class MesureLocationImpl extends DescriptiveStatistic implements MesureLocation {
	
	public Number mean(ArrayList<Number> numberList ) { 
		clear();
		numberList.forEach(number -> trend +=  number.doubleValue());
		return trend/numberList.size();
	}
	
	public Number median(ArrayList<Number> numberList) {
		numberList.sort(null);
		return numberList.get(numberList.size()/2);
	}
	
	public Number mode(ArrayList<Number> numberList) {
		Map<Number, Long> map = numberList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return Collections.max(map.values());
	}
	
	
}
