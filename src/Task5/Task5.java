package Task5;

import java.util.Scanner;

public class Task5 {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();


    public void dubler(){
        String m = "";
        for (int i = 0; i < a.length(); i++) {

            m = m + a.charAt(i) + a.charAt(i);


        }
        System.out.println(m);
    }
}
