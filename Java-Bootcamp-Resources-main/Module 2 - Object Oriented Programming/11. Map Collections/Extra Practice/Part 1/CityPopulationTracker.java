import java.util.HashMap;

import cityModel.City;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String cityName) {
        return new City(this.cityPopulations.get(cityName));
    }

    public void addCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    public void setCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    public void printCityPopulations() {
        // for (Map.Entry<String,City> set : this.cityPopulations.entrySet()) {
        //     System.out.println(set); // New York=City@38af3868, Los Angeles=City@77459877
        // }

        for (String name : this.cityPopulations.keySet()) {
            String value = this.cityPopulations.get(name).toString();
            System.out.println(name + ": " + value);
        }
    }

}
