import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println(intList);

        List<Integer> positiveNumbers = new ArrayList<Integer>();
        for (int number : intList) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        System.out.println(positiveNumbers);

        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number : positiveNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);
    }
}