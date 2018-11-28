import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Second {

    //This assignment takes in several strings and sorts them by the first two letters.
    //A space is printed between each sequence of strings.
    //Every sequence is preceded by an int to set the length of the sequence.

    public void compareAndSortStrings() {

        ArrayList<String> testCases = new ArrayList<>();
        ArrayList<String> newArrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            if (sc.hasNextInt()) {

                testCases.sort(Comparator.comparing(s->s.substring(0, 2)));
                newArrayList.addAll(testCases);

                switch (sc.nextInt()) {
                    case 0:
                        newArrayList.remove(0);
                        for (String item : newArrayList) {
                            System.out.println(item);
                        }
                        break;

                    default: {
                        newArrayList.add("");
                        testCases.clear();
                        break;
                    }
                }
            } else {
                testCases.add(sc.next());
            }
        }
    }

}

