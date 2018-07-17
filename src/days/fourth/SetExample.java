package days.fourth;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by andriusbaltrunas on 7/17/2018.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Jonas");
        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Andrius");

        System.out.println(names.size());

        //nuo java 8, names - SET,
        names.forEach(System.out :: println);
    }
}
