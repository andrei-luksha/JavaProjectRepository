package com_epam_andrei_luksha__module4_task7.runner;

import com_epam_andrei_luksha__module4_task7.model.Sweetness;

import java.util.*;

/**
 * Created by Andrei_Luksha on 7/7/2014.
 */
public class Utils {
    public static void findByNAme(String searchName,String searchWeight ,List<Sweetness> list){

        int counter =0;
        for (Sweetness sweet : list){
            if (searchName.equals(sweet.getSweetName()) | (searchWeight.equals(sweet.getSweetWeight()))){
                System.out.println(sweet.getInfo());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There are not records with <" + searchName + "> name");
        }
    }

    public class SortingGift implements Comparator<Sweetness> {

        @Override
        public int compare(Sweetness o1, Sweetness o2) {
            if (o1.getSweetWeight() < o2.getSweetWeight()){
                return 1;
            } else {
                return -1;
            }
        }
    }
}
