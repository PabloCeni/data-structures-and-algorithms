/*Problem: "Password"
 A system requires that, upon registration, the user's password must have at least 8 characters in total,
 at least one letter (uppercase or lowercase), at least one digit, and at least one special character: @, #, &.
 Write a program to determine if a given password is valid or invalid.*/

package main.java.com.pabloceni.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    public static boolean validatePassword(String str){

        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@&#]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }

    public static void main(String[] args) {

        System.out.println( validatePassword("@amerca1"));
        System.out.println(validatePassword("amrca154682"));
    }
}
