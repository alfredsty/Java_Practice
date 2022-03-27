package Tutorial.ch03.data_oop;

public class City {

       private String name;
       private String nation;
       private int population;

    public City(String name, String nation, int population) {
        this.name = name;
        this.nation = nation;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", population=" + population +
                '}';
    }

}
