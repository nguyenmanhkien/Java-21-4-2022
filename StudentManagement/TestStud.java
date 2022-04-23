package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class TestStud {
    public static void main(String[] args) {
        List<Stud> stud = new ArrayList<>();
        stud.add(new Stud("Nguyen Manh Kien", 19,"Suat sac"));
        stud.add(new Stud("Dinh Quang Anh", 23,"Kha"));
        stud.add(new Stud("Nguyen Ba Khanh", 19,"Ngu"));
        stud.add(new Stud("Luong Viet Hoang", 19,"Kha"));
        stud.add(new Stud("Ta Van Minh", 19,"Kha"));

        stud.forEach(stud1 -> {
            System.out.println("Name: " + stud1.getName() + " Age: " + stud1.getAge() + " Status: "+ stud1.getStatus());
            System.out.println(stud1);
        });
    }
}
