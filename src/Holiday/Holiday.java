package Holiday;

import java.util.ArrayList;

public class Holiday {
    private  String name;
    private int day;
    private String month;


    /*

    a)  Write a constructor for the class Holiday, which takes a String representing the name,
    an int representing the day,and a String representing the month as its arguments, and
    sets the class variables to these values.

     */




    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {


        this.month = month;
    }


    /*
    b)  Write a method inSameMonth, which compares two instances of the class Holiday,
     and returns the Boolean value true if they have the same month, and false if they do not.

    */


    public static boolean inSameMonth(String month1, String month2){
        if(month1.equals(month2)){
            return  true;
        }else{

            return  false;
        }
    }





    public static double avgDate(ArrayList<Holiday> arr){
        double sum=0;
        for(int i=0;i<arr.size();i++){
            double day = arr.get(i).day;
            sum+=day;
        }


        return sum/ arr.size();
    }



}
