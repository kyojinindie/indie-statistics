package otro.paquete;

import java.util.ArrayList;

import com.kyojin.indie.statistics.Statistic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> miArray = new ArrayList<Number>();
		
		miArray.add(7);
		miArray.add(2);
		System.out.println("Promedio: " + Statistic.mean(miArray).doubleValue());
		System.out.println("Media: " + Statistic.median(miArray).doubleValue());
		System.out.println("Moda: " + Statistic.mode(miArray).doubleValue());
		System.out.println("Desviación estándar: " + Statistic.sampleStandardDeviation(miArray));
	}

}
