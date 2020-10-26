package com.kyojin.indie.statistics.descriptive.mesure.location;

import java.util.ArrayList;

public interface MesureLocation {
	public Number mean(ArrayList<Number> numberList );
	public Number median(ArrayList<Number> numberList);
	public Number mode(ArrayList<Number> numberList);
}
