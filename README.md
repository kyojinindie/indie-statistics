# indie-statistics
![Image of KyojinIndie](https://github.com/kyojinindie/indie-statistics/blob/master/kyojinIndie.png)


This is a open source project.

## **indie-statistics**

Is a library that provides an API whit some statistic descriptive function.

### **USAGE**

Download jar file.

Add jar into your project.

Open source is a development methodology; free software is a social movement.

Happy Hacking :)


### **API-Statistics**

Modifier and type | Method and description
------------ | -------------
Number | mean(`ArrayList<Number> numberList` ) Returns mean.
Number | median(`ArrayList<Number> numberList`)Function sort that data set and returns the element of data set (X1, X2,…, XN) that leaves half the values to the left and right.
Number | mode(`ArrayList<Number> numberList`) Returns the most repeated value in data set.
Number | sampleStandardDeviation(`ArrayList<Number> numberList`) Returns sample Standar deviation.
Number | populationStandardDeviation(`ArrayList<Number> numberList`) Returns population standard deviation.
Number | kurtosisUngroupedData(`ArrayList<Number> numberList` ) Returns kurtosis ungrouped data.
Number | populationStandardError(ArrayList<Number> numberList) Returns population standard error.
Number | sampleStandardError(ArrayList<Number> numberList) Returns sample standard error.
Number | pearsonCoefficientSkewness(ArrayList<Number> numberList) Returns Pearson coefficient skewness.

### **Example-Statistics**

```java
Double[] myArray ={0.09,0.13,0.41,0.51,1.12,1.20,1.49,3.18,3.50,6.36,7.83,8.92,10.13,12.99,16.40};
		ArrayList<Number> sample = new ArrayList<Number>();
		
		for(int i = 0; i< myArray.length;i++) {
			sample.add(myArray[i]);
		}
		DispersionImpl disp = new DispersionImpl();
		System.out.println(disp.kurtosisUngroupedData(sample).doubleValue());
		System.out.println(disp.mean(sample).doubleValue());
		System.out.println(disp.median(sample).doubleValue());
		System.out.println(disp.mode(sample).doubleValue());
		System.out.println(disp.pearsonCoefficientSkewness(sample).doubleValue());
		System.out.println(disp.populationStandardDeviation(sample).doubleValue());
		System.out.println(disp.populationStandardError(sample).doubleValue());
		System.out.println(disp.sampleStandardDeviation(sample).doubleValue());
		System.out.println(disp.sampleStandardError(sample).doubleValue());
```

### **API-DiscreteDistribution**

Modifier and type | Method and description
------------ | -------------
`Map<String,Double>` | bernulli(int favorableCases, int probableCases) Returns Map with succes and failure probabilities.

### **Example-DiscreteDistribution**

```java
	DiscreteDistribution.bernulli(1,6).foreach((k,v) ->{
		System.out.println(k + ": " + v);
	})
```
