package com.kyojin.indie.statistics.descriptive.dispersion;

import java.util.ArrayList;

import com.kyojin.indie.statistics.descriptive.mesure.location.MesureLocationImpl;

public class DispersionImpl extends MesureLocationImpl {
	
	public Number sampleStandardDeviation(ArrayList<Number> numberList) {
		clear();
		numberList.forEach(n -> {
			dispersion += Math
					.pow(n.doubleValue() - mean(numberList).doubleValue(), 2);
		});
		 
		return Math.sqrt(dispersion/(numberList.size() -1));
	}
	
	public Number populationStandardDeviation(ArrayList<Number> numberList) {
		clear();
		numberList.forEach(n -> {
			dispersion += Math 
					.pow(n.doubleValue() - mean(numberList).doubleValue(), 2);
		});
		 
		return Math.sqrt(dispersion/numberList.size());
	}
	
	public Number kurtosisUngroupedData(ArrayList<Number> numberList) {
		clear();
		numberList.forEach(n -> {
			dispersion += Math.pow((n.doubleValue()-mean(numberList).doubleValue()), 4);
		});
		return dispersion/(numberList.size()*Math
				.pow(populationStandardDeviation(numberList).doubleValue(), 4));
	}
	
	public Number populationStandardError(ArrayList<Number> numberList) {
		return populationStandardDeviation(numberList).doubleValue()/Math.sqrt(numberList.size());
	}
	
	public Number sampleStandardError(ArrayList<Number> numberList) {
		return sampleStandardDeviation(numberList).doubleValue()/Math.sqrt(numberList.size());
	}
	
	public Number pearsonCoefficientSkewness(ArrayList<Number> numberList) {
		return (3*(mean(numberList).doubleValue()- median(numberList).doubleValue()))
				/(sampleStandardDeviation(numberList).doubleValue());
	}
}
