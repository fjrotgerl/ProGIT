package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Print "Hola mon!"
        printHola.printHolaFuncio();

        //Llista del 0 fins el 10
        int c = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número " + c);
            c++;
        }

        //Print d'array
        String[] ar = {"Dilluns","Dimarts","Dimecres","Dijous","Divendres","Dissabte","Diumenge"};
        System.out.println(Arrays.toString(ar));

        //Comentaris
        System.out.println("Comentari 1");
        System.out.println("Comentari 2");
    }
}