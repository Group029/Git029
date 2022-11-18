
public class CityProcessorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City cities[] =  new City[4];
		cities[0]= new City("Pune",4500000);
		cities[1]= new City("Mumbai",5500000);
		cities[2]= new City("Nashik",3500000);
		cities[3]= new City("Nagpur",2500000);
		
		System.out.println("Average of all cities Population "+CityProcessor.getAvgPopulation(cities));
		
		String bigCity[] = CityProcessor.getBigCityNames(cities);
		
		System.out.println("\nCities witn highest population");
		
		for(String name : bigCity) {
			if(name != null)
				{System.out.println(name);}
		}
	}
}
