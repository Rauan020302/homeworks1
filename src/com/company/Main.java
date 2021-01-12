package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        //Ex B
        String name = "Perfect";
        String performer = "Ed Sheeran";
        String genre = "Pop";
        String text = "I found a love for me\n" +
                "Oh darling, just dive right in and follow my lead\n" +
                "Well, I found a girl, beautiful and sweet\n" +
                "Oh, I never knew you were the someone waiting for me\n" +
                "'Cause we were just kids when we fell in love\n" +
                "Not knowing what it was\n" +
                "I will not give you up this time\n" +
                "But darling, just kiss me slow, your heart is all I own\n" +
                "And in your eyes, you're holding mine\n" +
                "Baby, I'm dancing in the dark with you between my arms\n" +
                "Barefoot on the grass, listening to our favourite song\n" +
                "When you said you looked a mess, I whispered underneath my breath\n" +
                "But you heard it, darling, you look perfect tonight\n" +
                "Well I found a woman, stronger than anyone I know\n" +
                "She shares my dreams, I hope that someday I'll share her home\n" +
                "I found a love, to carry more than just my secrets\n" +
                "To carry love, to carry children of our own\n" +
                "We are still kids, but we're so in love\n" +
                "Fighting against all odds\n" +
                "I know we'll be alright this time\n" +
                "Darling, just hold my hand\n" +
                "Be my girl, I'll be your man\n" +
                "I see my future in your eyes\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "When I saw you in that dress, looking so beautiful\n" +
                "I don't deserve this, darling, you look perfect tonight\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "I have faith in what I see\n" +
                "Now I know I have met an angel in person\n" +
                "And she looks perfect\n" +
                "I don't deserve this\n" +
                "You look perfect tonight";

        Song song = new Song(name,performer,genre,text);

        FileWriter fileWriter = new FileWriter("Perfect.txt");
        fileWriter.write(name + "\n" + performer + "\n" + genre + "\n" + text );
        fileWriter.close();

        //Ex A

        FileReader fileReader = new FileReader("Song.txt");

        Scanner sc = new Scanner(fileReader);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            song.setText(line);
            //System.out.println(line);
            System.out.println(song.getText());
        }
        fileReader.close();


        //Ex C


        //1. Как вы понимаете исключения(exception)?
        //   это ошибки которые мы способны проверять, решать их в отличии от Error, проверяем с помощью try catch
        //   или  throws тогда мы его не проверяем а пропускаем
        //2. Какие исключения вы встречали?
        //   NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException
        //3. Что вы знаете о классе Exception
        //   Exception все наследники этого класса наз проверяемыми исключениями
        //4. Что будет если не обработать исключение?
        //   не удасться скомпилировать тоесть вывести на консоль
        //5. Объясните, как работает структура try-catch
        //   В try мы пишем код который надо проверить а catch исключение которое надо поймать
    }
}
