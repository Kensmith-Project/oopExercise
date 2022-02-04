/*

d)  Write a piece of code that creates a Holiday
instance with the name “Independence Day”,
 with the day “4”, and with the month “July”.

 */

package holidayInstance;
import Holiday.Holiday;
public class Instanceholiday {
    public static void main(String[] args) {
        Holiday instanceOf = new Holiday("Independence Day",4,"July");
        Holiday instanceOf2 = new Holiday("ValentineDay",7,"February");
        Holiday instanceOf3 = new Holiday("Easter",9,"April");
        System.out.println(instanceOf.getName());
        System.out.println(instanceOf.getDay());
        System.out.println(instanceOf.getMonth());



    }
}
