package com_epam_andrei_luksha__module4_task7.runner;

import com_epam_andrei_luksha__module4_task7.model.Sweet;
import com_epam_andrei_luksha__module4_task7.model.Sweetness;

import javax.swing.*;
import java.util.*;

import static com_epam_andrei_luksha__module4_task7.runner.Utils.*;

/**
 * Created by Andrei_Luksha on 7/2/2014.
 */
public class Runner {

    public static void main(String[] args) {

        boolean repeat = true;

        Sweetness chocolate = new Sweetness("chocolateSpartakSweet","10");

        List<Sweetness> sweetList = new ArrayList<>();

        while (repeat) {
            System.out.println("1. - add a new sweet to gift.");
            System.out.println("2. - find a sweet on gift.");
            System.out.println("3. - show all sweets which gift has and weight of gift.");
            System.out.println("4. - sorting gifts by weight.");
            System.out.println("0. - exit.");

            Scanner scanner = new Scanner(System.in);
            int action=scanner.nextInt();

            switch (action){
                case 0:
                    repeat=false;
                    System.out.println("Completed");
                    break;
                case 1:
                    System.out.println("Type sweet name: ");
                    String sweetName =new Scanner(System.in).nextLine();
                    System.out.println("Type sweet weight: ");
                    String sweetWeight = new Scanner(System.in).nextLine();
//                    System.out.println("Type sweet cost: ");
//                    String sweetCost = new Scanner(System.in).nextLine();
//                    System.out.println("Type sweet expDate: ");
//                    String sweetExpDate = new Scanner(System.in).nextLine();
                    sweetList.add(new Sweet(sweetName, sweetWeight, chocolate));
                    break;
                case 2:
                    System.out.println("Type sweet name and sweet waight (ex: mu-mu,5)");
                    String searchBy = new Scanner(System.in).nextLine();
                    findByNAme(searchBy, searchBy, sweetList);
                    break;

                case 3:
                    for(Sweetness sweet : sweetList){
                        System.out.println(sweet.getInfo());
                    }
                    break;
                case 4:
                    Collections.sort(sweetList, new Utils.SortingGift());
                    for(Sweetness sweet : sweetList) {
                        System.out.println("Sweets was sorted: " + sweet.getInfo());
                    }
                    break;
                default:
                    System.out.println("Incorrect value! Please, try again.");
                    break;
            }
        }


    }

}
