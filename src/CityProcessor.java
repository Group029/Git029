
public class CityProcessor {
	public static float getAvgPopulation(City pCity []) {
		int size = pCity.length; 
		float avgPopulation =0;
		int sum=0;
		for (City c : pCity) {
		int population = c.getPopulation();
		sum += population;
		}
		avgPopulation = (sum/size); 
		return avgPopulation;
	}
	public static String[] getBigCityNames(City pCity[]) {
		int size =pCity.length;
		String bigCity[] = new String[size];
		int index =0;
		for(City c : pCity) {
			int population = c.getPopulation();
			if(population>4000000) {
				String name = c.getName();
				bigCity[index]= name;
				index++;
			}
		}
		return bigCity;
	}

}
