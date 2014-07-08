package com_epam_andrei_luksha__module4_task7.model;

import java.util.Date;

/**
 * Created by Andrei_Luksha on 7/2/2014.
 */
public class Sweet extends Sweetness {

    private Sweetness chololate;

    public Sweet(String sweetName, Integer sweetWeight) {
        super(sweetName, sweetWeight);
    }


    public Sweet(String sweetName, Integer sweetWeight,Sweetness chololate) {
        super(sweetName, sweetWeight);
        this.chololate=chololate;

    }

    public String getInfo(){
        return super.getInfo() + "\n Factory type with " + chololate.getInfo() + "\n\n";
    }

}
