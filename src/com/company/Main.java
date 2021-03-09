package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	//HashSet-хранит уникальные значения парами ключ-значение ключ должен быть уникален
    //LinkedHashSet-тоже самое что и HashSet просто хранит порядок добавления
    //TreeSet-хранит уникальные элементы сортировка в порядке возрастания использует деревья красно-черные

        City city1 = new City(31,"Bishkek");
        City city2 = new City(32,"Osh");
        City city3 = new City(4420,"London");
        City city4 = new City(3491,"Madrid");
        City city5 = new City(331,"Paris");
        City city6 = new City(718,"New-York");
        City city7 = new City(495,"Moscow");
        City city8 = new City(4930,"Berlin");
        City city9 = new City(4989,"Munich");
        City city10 = new City(44151,"Liverpool");

        HashSet<City> hashSet = new HashSet<>();
        TreeSet<City> treeSet = new TreeSet<>();
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(city1);
        arrayList.add(city2);
        arrayList.add(city3);
        arrayList.add(city4);
        arrayList.add(city5);
        arrayList.add(city6);
        arrayList.add(city7);
        arrayList.add(city8);
        arrayList.add(city9);
        arrayList.add(city10);
        System.out.println(arrayList);

        hashSet.add(city2);
        hashSet.add(city3);
        hashSet.add(city6);
        hashSet.add(city8);
        System.out.println(hashSet);

        treeSet.add(city1);
        treeSet.add(city4);
        treeSet.add(city5);
        treeSet.add(city7);
        treeSet.add(city9);
        treeSet.add(city10);
        Iterator<City> it1 = treeSet.descendingIterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }


        Iterator<City> it2 = treeSet.iterator();
        while (it2.hasNext()){
            City city = it2.next();
            if (city.getName().length() > 5){
                it2.remove();
                System.out.println(it2.next());
            }
        }







    }
}
