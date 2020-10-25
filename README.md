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

### **Example-Statistics**

```java
ArrayList<Number> numberList = new ArrayList<Number>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(6);
		numberList.add(7);
		numberList.add(3);
		numberList.add(4);
		
		System.out.println(Statistic.mean(numberList).doubleValue());
		System.out.println(Statistic.median(numberList).doubleValue());
		System.out.println(Statistic.mode(numberList).doubleValue());
		System.out.println(Statistic.sampleStandardDeviation(numberList).doubleValue());
		System.out.println(Statistic.populationStandardDeviation(numberList).doubleValue());
		System.out.println(Statistic.kurtosisUngroupedData(numberList).doubleValue());
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
