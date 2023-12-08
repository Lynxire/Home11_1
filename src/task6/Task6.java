package task6;

import java.util.Scanner;

public class Task6 {
    //для примера
    String str = "I 12321 pokemon loxa";

    String[] words = str.split(" ");


    public boolean isPalindrome(int n) {
        String slan = this.words[n-1];
        StringBuilder strBuilder = new StringBuilder(slan);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();
        System.out.println(slan);
        return slan.equalsIgnoreCase(invertedText) ;

    }

}
