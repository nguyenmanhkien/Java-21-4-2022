package SortAArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before: "+numbers);

        Collections.sort(numbers);

        System.out.println("After: "+numbers);
    }
}
