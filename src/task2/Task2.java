package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    String[] arr = new String[3];
    Scanner in = new Scanner(System.in);
    public void sort(){
        for(int i = 0; i < 3; i++){
            arr[i] = in.nextLine();
        }
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j].length() > arr[j+1].length() ){
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
