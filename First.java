import java.util.Scanner;

public class First {

    public void oddOrEven() {

        //This assignment takes an int and determines whether it is odd or even.
        // An initial int is received to set the length of the sequence of ints.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
