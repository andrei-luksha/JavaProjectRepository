package com_epam_andrei_luksha__module4_task7;

/**
 * Created by Andrei_Luksha on 7/2/2014.
 */
public class Sweet {

    protected String sweetName;
    //protected Integer cost;
    protected Integer sweetWeight;
    //protected Date expDate;

    public Sweet(String sweetName, Integer sweetWeight) {
        //public Sweet(String name, Integer cost, Integer weight, Date expDate){
        super();    // вызов конструктора базового класса
        //  вызывает методы родительского класса

        this.sweetName = sweetName;
        this.sweetWeight = sweetWeight;
        //this.expDate=expDate;
        // this.cost=cost;
    }

    public String getSweetName() {
        return sweetName;
    }
    public String setSweetName() {
        return this.sweetName = sweetName;
    }



    public Integer getSweetWeight() {
        return sweetWeight;
    }
    public Integer setweetWeight() {
        return this.sweetWeight = sweetWeight;
    }

    public String getInfo(){
        return "Sweet name is: " + getSweetName() + ", with waight = " + getSweetWeight() + "\n";
    }
}