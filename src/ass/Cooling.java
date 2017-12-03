package ass;

import java.text.DecimalFormat;

public class Cooling {
	
	public static final double FREEZER_TEMPERATURE = -20;
	public static final double K = 0.001;

	public static void main(String[] args) {
		temperatureTest(70, 0);
		temperatureTest(70, 60); 
		temperatureReport(70);
		timeToCoolTest(70, -10);
		timeToCoolTest(70, -20);
		
	}

	// TODO: Implement method as specified in assignment brief 
	
	public static double temperature(double initialTemperature, int seconds) {
	//store of difference in temp, new temperature, final temp
		double dt = 0;
		double newTemp = 0;
		int i = 0;
		double perSecTemp = 0;
		
		if (seconds == 0){
			return initialTemperature;
		}
		else{
	//loop for temperature
		while(i <= seconds){
			dt = (initialTemperature - FREEZER_TEMPERATURE);
			newTemp = dt * K;
			perSecTemp = initialTemperature - newTemp;
			i++;
			initialTemperature = perSecTemp; 
		}
	//value return	
		return initialTemperature;
		}
	}
	
	
	// TODO: Implement method as specified in assignment brief 
	
	public static void temperatureReport(double initialTemperature) {
	//formal to one decimal, and store of data	
		int totalMin = 60;
		int convertMinSec = 0;
		double storeTemp = 0;
		DecimalFormat one = new DecimalFormat("#,##0.0");
	//beginning print
		System.out.println("Temperature report each 10 minutes till 60 minutes");
		System.out.println("Minutes | Temperature");
		
	//loop working out temperature per ten minutes
		for (int eachTenMin = 0; eachTenMin <= totalMin; eachTenMin = eachTenMin + 10){
			convertMinSec = eachTenMin * 60;
			storeTemp = temperature(initialTemperature, convertMinSec);
			System.out.println("  "+ eachTenMin  +"    |  " + one.format(storeTemp));
		}
	
	}
	
	// TODO: Implement method as specified in assignment brief 
	
	public static int timeToCool(double initialTemperature, double targetTemperature) {
	// stores the temperatures
		double dt = 0;
		double currentTemp = 0;
		int currentTime = 0;
		int lessthanfreezer = -1;
	
	//said if less than target is less than freezer, return negative 1
		if(targetTemperature <= FREEZER_TEMPERATURE){
			return lessthanfreezer;
		}
	//if not do the time loop	
		else {
			
		
		while(initialTemperature >= targetTemperature){
			dt = initialTemperature - FREEZER_TEMPERATURE;
			currentTemp = dt * K;
			initialTemperature = initialTemperature - currentTemp;
			currentTime++;
		}
		return currentTime; 
		
		}
	}

	public static void timeToCoolTest(double initialTemperature, double targetTemperature) {
		System.out.println("### Time To Cool");
		System.out.println("Initial temperature = " + initialTemperature);
		System.out.println("Target temperature = " + targetTemperature);
		int timeTaken = timeToCool(initialTemperature, targetTemperature);
		System.out.println("Time to cool = " + timeTaken + " seconds\n");
	}

	public static void temperatureTest(double initialTemperature, int seconds) {
		System.out.println("### Temperature Test");
		System.out.println("Initial temperature = " + initialTemperature);
		System.out.println("Seconds = " + seconds);
		double temp = temperature(initialTemperature, seconds);
		System.out.println("Temperature = " + temp + "\n");
	}

}


