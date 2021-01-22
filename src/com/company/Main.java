package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();


        //Массив
        System.out.println("Array");
        int[] array  =new int[20];

        for(int i = 0; i < array.length;i++){
            array[i] = rand.nextInt(2);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n-------------------------");

        int[] newArray = sortArray(array);
        for(int i = 0; i < newArray.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //ArrayList
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 20;i++){
            arrayList.add(rand.nextInt(2));
        }
        System.out.println("ArrayList");
        System.out.println(arrayList);


        System.out.println("-------------------------");

        System.out.println(sortArrayList(arrayList));



        //LinkedList
        System.out.println();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 20;i++){
            linkedList.add(rand.nextInt(2));

        }
        System.out.println("LinkedList");
        System.out.print(linkedList + " \n");

        System.out.println("-------------------------");

        System.out.print(sortLinkedList(linkedList));
    }

    public static int[] sortArray(int[] sort){
        for(int i = 0; i < sort.length; i++){
            for(int l = 0; l < sort.length - i - 1; l++){
                int nextIndex = l + 1;
                if(sort[l] > sort[nextIndex]) {
                    int a = sort[l];
                    sort[l] = sort[nextIndex];
                    sort[nextIndex] = a;
                }
            }
        }
        return sort;
    }
    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> sort){
        Collections.reverse(sort);
        Collections.sort(sort);

        return sort;
    }
    public static LinkedList<Integer> sortLinkedList(LinkedList<Integer> sort){

        LinkedList<Integer> result = new LinkedList<>();
        for (Integer number:sort){
            if(number == 0){
                result.addFirst(number);
            }else if(number == 1){
                result.addLast(number);
            }

        }
        return result;
    }


}



//1. Что такое Enum?
//   Что то вроде перечисления ,ограниченный набор значений
//2. Приведите 3 примера где можно было бы использовать Enum?
//   погода,Время года,стороны света
//3. Какие плюсы использования Enum вы знаете?
//   хорошо работает с switch case не нужно создавать final static переменные
//4. Когда лучше использовать LinkedList, ArrayList и обычный Array?
//   если часто вставлять или удалять - выбираем в пользу LinkedList, в противном случае ArrayList
//5. Напишите кодом любой пример из 2. Пункта используя switch case
// switch (Season)
//   case Winter;
//   case Spring;
//   case Autumn;
//   case Summer;
//       sout"Season"
//    default:
//        sout"Not Season"

