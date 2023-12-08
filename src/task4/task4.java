package task4;

import java.util.Scanner;

public class task4 {

    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    String c = scanner.nextLine();


    public void srav() {
        char[] a1 = this.a.toCharArray();
        char[] b1 = this.b.toCharArray();
        char[] c1 = this.c.toCharArray();
        int d = Math.max(a.length(), Math.max(b.length(),c.length()));
        for (int i = 0; i < d; i++) {
            {
                if (a1[i] != b1[i] && a1[i] != c1[i]) {
                    System.out.println(a);
                    break;
                } else if (b1[i] != a1[i] && b1[i] != c1[i]) {
                    System.out.println(b);
                    break;
                } else {
                    System.out.println(c);
                    break;
                }

            }
        }
    }
}
