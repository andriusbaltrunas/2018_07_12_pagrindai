package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/16/2018.
 */
public class NumberUtils {

    public static double getCorrectNumber(Scanner sc, String message){
        double result;
        while (true) {
            System.out.println(message);
            try {
                result = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Nepavyko pakartoki");
                sc.nextLine();
            }
        }
        return result;
    }
}
