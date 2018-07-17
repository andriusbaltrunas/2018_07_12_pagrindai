package days.fourth;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by andriusbaltrunas on 7/17/2018.
 */
public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(2, "Jonas");
        names.put(3, "Andrius");
        names.put(1, "Jonas");
        names.put(5, "Petras");
        names.put(5, "Jokubas");

        System.out.println(names.size());

        for(Integer key : names.keySet()){
            System.out.println("key " + key +" " + names.get(key));
        }

        System.out.println(names.get(3));

        ConstructorExample constructorExample = new ConstructorExample();
    }
}
