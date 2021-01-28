package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        try {
            FileReader fileReader = new FileReader("src/Main.java");
            Scanner sc = new Scanner(fileReader);
            File file = new File("com/company/java.txt");
            FileWriter fileWriter = new FileWriter(file);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
                fileWriter.write(str);

            }
            fileWriter.close();
            fileReader.close();

            if (file.length() > 100) {
                throw new IllegalStateException(file.length() + " ");

            }

        }catch (FileNotFoundException e) {
            System.out.println("Файл не доступен");
        }catch (IllegalStateException e){
            System.out.println("Код слишком большой, его размер: " + e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }




















        //1. Как вы понимаете Error? RuntimeException? CheckedException?

        // Error это как катастрофа большие проблемы,RunTimeException это как непоправимая ошибка,
        // CheckedException это поправимая его мы должны исправить сразу а то код не запуститься

        //2. Для чего применяется throw?

        //  чтобы выбрасить ошибку

        //3. Разница между Unchecked Exceptions & Checked Exceptions? (Прям совсем своими словами!)

        // Unchecked возникает когда мы вызываем программу, а Checked показывается сама до запуска

        //4. Как вы понимаете блоки try {} catch {} finally {}?

        // try - пишем код который вызывает подозрение, catch - пишем исключение которое хотим отловить, finally - пишем что хотим он работает не зависимо есть исключение или нет
        // finally не обязателен если есть catch или наоборот try пишем всегда

        //5. Почему при множественном catch, сначала используем более детальные Exceptions, и только потом переходим к родителям?

        //чтобы сначала отлавливали исключение наследников а потом родителей
        // если так не делать то в родитель запишется наследник исключение



    }
}
