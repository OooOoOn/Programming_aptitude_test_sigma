import java.util.Scanner;

public class Tutorial {

    public void difference() {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(Math.abs(a - b));
        }

    }

    }
