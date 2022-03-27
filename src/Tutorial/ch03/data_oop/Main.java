package Tutorial.ch03.data_oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("서울", "한국", 58000000));
        cities.add(new City("도쿄", "일본", 123123000));
        cities.add(new City("워싱턴d.c", "미국", 1230932));

//        for(City c = cities){
//            System.out.println(cities.toString());
//        }
    }
}
