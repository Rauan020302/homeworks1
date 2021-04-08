package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static  void main(String[] args) {

        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(1,"Barca");
        hashmap.put(2,"PSG");
        hashmap.put(3,"Atalanta");
        hashmap.put(4,"Inter");
        hashmap.put(5,"Juventus");
        hashmap.put(6,"United");
        hashmap.put(7,"City");
        hashmap.put(8,"Bayern");
        hashmap.put(9,"Madrid");
        hashmap.put(10,"Arsenal");

        Optional<String> values1 = hashmap.keySet().stream().filter(x -> x > 5).map(hashmap::get).reduce((value1,combined) -> value1 + "," + combined);
        System.out.println(values1.orElse(null) + " ");

        System.out.println("*******************************");

        Optional<String> values2 = hashmap.keySet().stream().filter(x -> x % 3 == 0).map(hashmap::get).reduce((value1, combined) -> value1 + "," + combined);
        System.out.print(values2.orElse(null) + " ");
        System.out.println();

        System.out.println("*******************************");
//        Stream<Integer> values3  = hashmap.keySet().stream().filter(x -> x > 5).map(hashmap::get).;
//        System.out.println(values3 + " ");

        for (Map.Entry<Integer,String> item : hashmap.entrySet()){
            if (item.getKey() > 5){
                System.out.println(item.getKey()*item.getKey());
            }
        }

        //Stream.of(hashmap).filter(x -> x.keySet() > 5).forEach(x -> System.out.println(x));
        //Stream.of(hashmap).filter(x -> x.keySet() % 3 == 0).forEach(x -> System.out.print(x + ", "));
        //Stream.of(hashmap).filter(x -> x.keySet() > 5).forEach(x -> System.out.println(x));



        ////////
        ///B.///
        ////////

        System.out.println("*******************************");
        Integer[] arr = {10,12,55,12,42,25,35,64,57,78,98};
        Arrays.stream(arr).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
        List<Integer> list = Arrays.stream(arr).filter(x -> x % 2 != 0).map(x -> x + 10).collect(Collectors.toList());
        System.out.println(list);

    }
}