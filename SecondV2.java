import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SecondV2 {

    //This assignment takes in several strings and sorts them by the first two letters.
    //A space is printed between each sequence of strings.
    //Every sequence is preceded by an int to set the length of the sequence.

    ArrayList<ArrayList<String>> testCases = new ArrayList<>();

    public void difference() {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                if (i == 0) {
                    break;
                }
                ArrayList<String> miniArray = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    if (sc.hasNextInt())
                        break;
                    miniArray.add(sc.next());
                }
                miniArray.sort(Comparator.comparing(s -> s.substring(0, 2)));
                testCases.add(miniArray);
            }
        }

        for (int miniArrayIndex = 0; miniArrayIndex < testCases.size(); miniArrayIndex++) {
            for (String value : testCases.get(miniArrayIndex)
                    ) {
                System.out.println(value);
            }
            if (miniArrayIndex != testCases.size() - 1)
                System.out.println("");
        }

    }
}
