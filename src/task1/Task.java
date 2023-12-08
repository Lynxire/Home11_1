package task1;

import java.util.Scanner;

public class Task {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    String c = scanner.nextLine();

    public void Max(){
       if(this.a.length() > this.b.length() && this.a.length() > this.c.length()){
           System.out.println(a.length());
           System.out.println(a);
       }
       else if(this.b.length() > this.a.length() && this.b.length() > this.c.length()){
           System.out.println(b.length());
           System.out.println(b);
       }
       else {
           System.out.println(c.length());
           System.out.println(c);
       }
    }
    public void Min(){
        if(this.a.length() < this.b.length() && this.a.length() < this.c.length()){
            System.out.println(a.length());
            System.out.println(a);
        }
        else if(this.b.length() < this.a.length() && this.b.length() < this.c.length()){
            System.out.println(b.length());
            System.out.println(b);
        }
        else {
            System.out.println(c.length());
            System.out.println(c);
        }

    }
}
