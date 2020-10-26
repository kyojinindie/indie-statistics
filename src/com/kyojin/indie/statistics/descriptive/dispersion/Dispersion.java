package com.kyojin.indie.statistics.descriptive.dispersion;

import java.util.ArrayList;

public interface Dispersion {
	
	public Number sampleStandardDeviation(ArrayList<Number> numberList);
	public Number populationStandardDeviation(ArrayList<Number> numberList);
	public Number kurtosisUngroupedData(ArrayList<Number> numberList);
	public Number populationStandardError(ArrayList<Number> numberList);
	public Number sampleStandardError(ArrayList<Number> numberList);
	public Number pearsonCoefficientSkewness(ArrayList<Number> numberList);

}
