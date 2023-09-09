package cityModel;

public class City {
    private String name;
    private String country;
    private long population;

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public City(City city) {
        setName(city.name);
        setCountry(city.country);
        setPopulation(city.population);
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (isNullOrBlank(name)) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (isNullOrBlank(country)) {
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }
        this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        if (isLessThanOrEqualToZero(population)) {
            throw new IllegalArgumentException("Population must be greater than 0.");
        }
        this.population = population;
    }

    public boolean isNullOrBlank(String str) {
        return str.isBlank() || str == null;
    }

    public boolean isLessThanOrEqualToZero(long number) {
        return number <= 0;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", country='" + getCountry() + "'" +
            ", population='" + getPopulation() + "'" +
            "}";
    }


}
