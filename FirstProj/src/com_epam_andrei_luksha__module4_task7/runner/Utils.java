package com_epam_andrei_luksha__module4_task7.runner;

import com_epam_andrei_luksha__module4_task7.model.Sweetness;
import java.util.List;

/**
 * Created by Andrei_Luksha on 7/7/2014.
 */
public class Utils {
    public static void findByNAme(String searchName, List<Sweetness> list){

        int counter =0;
        for (Sweetness sweet : list){
            if (searchName.equals(sweet.getSweetName()) ){
                System.out.println(sweet.getInfo());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There are not records with " + searchName + " name");
        }

    }

}
