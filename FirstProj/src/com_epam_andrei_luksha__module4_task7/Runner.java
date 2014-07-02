package com_epam_andrei_luksha__module4_task7;

import java.util.Scanner;

/**
 * Created by Andrei_Luksha on 7/2/2014.
 */
public class Runner {

    public static void main(String[] args) {

        boolean repeat = true;

        while (repeat) {
            System.out.println("1. - add a new sweet to gift.");
            System.out.println("2. - find a sweet on gift.");
            System.out.println("3. - show all sweets which gift has.");
            System.out.println("0. - exit.");

            Scanner scanner = new Scanner(System.in);
            int action=scanner.nextInt();

            switch (action){
                case 0:
                    repeat=false;
                    System.out.println("Completed");
                case 1:

                case 2:

                case 3:

            }
        }


    }

}
