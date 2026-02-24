/*
Problem "data1"
Given a date that may be in the format day/month/year, where the day and
month are less than 10 and may or may not have a leading zero, display the day,
month, and year separately in numerical form. Assume a valid date.
*/
package main.java.com.pabloceni.string;

public class Data2 {

    public static String formatDate(int day, int month, int year){


        String formatDay = String.format("%02d", day);
        String formatMonth = String.format("%02d", month);

        return formatDay + "/" + formatMonth + "/" + year;
    }

    public static void main(String[] args) {

        String s = formatDate(01, 2, 2000);

        System.out.println(s);
    }
}
