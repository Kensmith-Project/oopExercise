package com.company;
import Holiday.Holiday;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Holiday holiday = new Holiday("Valentine",14,"February");
        Holiday holiday2 = new Holiday("Easter",2,"February");
        Holiday instanceOf = new Holiday("Independence Day",4,"July");
        Holiday instanceOf2 = new Holiday("ValentineDay",7,"February");
        Holiday instanceOf3 = new Holiday("Easter",9,"April");
        String month1 = holiday.getMonth();
        String month2 = holiday2.getMonth();
        System.out.println(Holiday.inSameMonth(month1,month2));
        System.out.println(instanceOf3);
        System.out.println(Holiday.avgDate(new ArrayList<Holiday>(List.of(instanceOf, instanceOf3))));




    }
}
