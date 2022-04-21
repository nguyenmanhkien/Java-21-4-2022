package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Khanh F0");
        animals.add("Khanh F1");
        animals.add("Khanh F2");
        animals.add("Khanh F3");
        animals.add("Khanh F4");
        animals.add("Khanh F5");
        System.out.println(animals);
        animals.add(3,"Cho");
        System.out.println(animals);
    }
}
