package com.kyojin.indie.distribution.discrete;

/*
 * Powered by: Kyojin-Indie
 * 
 * Author: Erick Roberto Medina Lavielle
 * */

import java.util.HashMap;
import java.util.Map;

public class DiscreteDistribution {
	
	public static Map<String,Double> bernulli(int favorableCases, int probableCases) {
		Map<String,Double> bernulliCases = new HashMap<String, Double>();
		Double p = (double) favorableCases/probableCases;
		bernulliCases.put("Success", p);
		bernulliCases.put("Failure", 1-p);
		return bernulliCases;
	}

}
