package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // print n amount of triangles from user input in the following form: 5-3-7

        System.out.println("What size triangle shall we print? If you wish to print more than one, please give the following sizes separated by a dash (like this: 5-3-7-4)");

        //making a String table from user input by splitting it with "-"

        Scanner lukija = new Scanner(System.in);
        String userInput = lukija.nextLine();

        String[] userInputtable = userInput.split("-");

        //converting String table to int table

        int size = userInputtable.length;
        int[] userIntlist = new int[size];
        for (int i = 0; i < size; i++) {
            userIntlist[i] = Integer.parseInt(userInputtable[i]);
        }

        //reading userIntlist while there are values
        int indeksi = 0;

        while (indeksi < userIntlist.length) {

            //calling for printTriangle method after each index
            printTriangle(userIntlist[indeksi]);

            indeksi = indeksi + 1;
        }
    }


        public static void printStars(int amount) {

            int printed = 0;

            while (printed < amount) {
                printed++;
                System.out.print("*");
            }

            System.out.println("");
        }


        public static void printTriangle(int size){


            int printed = 0;

            while (printed < size) {

                printed++;

                int amount = printed;

                printStars(amount);


            }
        }
    }


