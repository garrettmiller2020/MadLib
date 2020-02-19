package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase 1

        String color;
        String noun;
        String adjective;
        String time;
        String number;
        String adjective2;
        String noun2;
        String properNoun;
        String properNoun2;
        String pluralNoun;
        String noun3;
        String verb;
        String noun4;
        String adjective3;
        String adverb;
        String place;
        String properNoun3;
        String adjective4;

        Scanner keyboard;

        //Phase 2

        keyboard = new Scanner (System.in);

        System.out.println("Give me a color.");
        color = keyboard.nextLine();

        System.out.println("Give me a noun.");
        noun = keyboard.nextLine();

        System.out.println("Give me an adjective.");
        adjective = keyboard.nextLine();

        System.out.println("Give me a time.");
        time = keyboard.nextLine();

        System.out.println("Give me a number.");
        number = keyboard.nextLine();

        System.out.println("Give me another adjective.");
        adjective2 = keyboard.nextLine();

        System.out.println("Give me another noun.");
        noun2 = keyboard.nextLine();

        System.out.println("Give me a Proper Noun.");
        properNoun = keyboard.nextLine();

        System.out.println("Give me another Proper Noun.");
        properNoun2 = keyboard.nextLine();

        System.out.println("Give me a plural noun.");
        pluralNoun = keyboard.nextLine();

        System.out.println("Give me a 3rd noun.");
        noun3 = keyboard.nextLine();

        System.out.println("Give me a verb.");
        verb = keyboard.nextLine();

        System.out.println("Give me one more noun.");
        noun4 = keyboard.nextLine();

        System.out.println("Give me a 3rd adjective.");
        adjective3 = keyboard.nextLine();

        System.out.println("Give me an adverb.");
        adverb = keyboard.nextLine();

        System.out.println("Name a place.");
        place = keyboard.nextLine();

        System.out.println("Give me a 3rd Proper Noun.");
        properNoun3 = keyboard.nextLine();

        System.out.println("Give me a 4th adjective.");
        adjective4 = keyboard.nextLine();

        //Phase 3

        System.out.println("I groaned in my bed for twenty seconds yesterday morning, but eventually I got dressed.\n" +
                "I wore a "+ color +" and white striped, long sleeve "+noun+" with a collar on it, a red tie, dark \n" +
                "gray pants, white socks, black shoes, and a(n) "+adjective+" hat. In "+time+" I made lunch and ate \n" +
                "my breakfast. "+number+" minutes later, the bus came. A few minutes later, I was at school. In school,\n" +
                "I met two really "+adjective2+" kids. All of us became friends very fast. That day we had Science, and \n" +
                "luckily my friends and I were at the same "+noun2+". My friends' names are "+properNoun+" and "+properNoun2+".\n" +
                "In Math we weren't together, and that really bugged me. We learned what "+pluralNoun+" were, and when \n" +
                "to use them. At snack and recess, we played a "+noun3+" together. It was extremely fun! At P. E., we were \n" +
                ""+verb+" off of the ropes onto "+noun4+" I thought it was a very "+adjective3+" idea. In swimming class, \n" +
                "we needed to swim extremely "+adverb+", or else we would have to swim longer. When I got home from school \n" +
                "I went to "+place+" to meet "+properNoun3+" I then went home and went to get ready for bed. I went to my \n" +
                "bed and "+adjective4+".");

    }
}
