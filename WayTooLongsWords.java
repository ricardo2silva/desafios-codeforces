package com.desafios.codeforces.logicaprogramacao.desafios;

import java.util.Locale;
import java.util.Scanner;

public class WayTooLongsWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a word");
        String word = sc.nextLine();
        WayTooLongsWords.abbreviation(word);
        sc.close();
    }

    public static void abbreviation(String word) {
        String abrev = word;
        int midle = 0;
        if(word.length() > 8) {
            abrev = word.substring(0,1);
            midle = (word.substring(1,word.length() -1)).length();
            abrev += midle + word.substring(word.length() -1);
        }
        System.out.println(abrev);

    }
}
