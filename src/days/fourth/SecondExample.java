package days.fourth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/17/2018.
 */
public class SecondExample {

    //Is konsoles irasyti 5 vardus i List
    // juos atspausdinti surykiuotus Collections.sort(JUSU_LISTAS);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        for (int i=0; i < 5; i++){
            System.out.println("Iveskite " +i+ " varda");
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names);

        names.forEach(System.out :: println);
    }
}
