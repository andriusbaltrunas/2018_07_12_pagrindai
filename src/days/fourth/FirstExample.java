package days.fourth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by andriusbaltrunas on 7/17/2018.
 */
public class FirstExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Petras");
        names.add("Andrius");
        names.add("Tomas");
        names.add("Donatas");

        for (String name : names){
            if(name.length() > 6){
                System.out.println(name);
            }
        }

        FirstExample f = new FirstExample();
        System.out.println(f.getFirst(names));
        System.out.println(f.getLast(names));
    }

    private String getFirst(List<String> names){
        return names.get(0);
    }

    private String getLast(List<String> names){
        return names.get(names.size() - 1);
    }
}
