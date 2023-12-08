package task3;

import java.util.Scanner;

public class Task3 {

    String[] arr = new String[3];
    Scanner in = new Scanner(System.in);

    public void three(){
        int sum = 0;
        int sr = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
            sum = sum + arr[i].length();
            sr = sum/3;
            if(arr[i].length() < sr){
                System.out.println(arr[i].length());
                System.out.println(arr[i]);
            }
        }

    }
}
