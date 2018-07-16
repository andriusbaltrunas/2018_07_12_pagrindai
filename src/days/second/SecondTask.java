package days.second;


import utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/13/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecondTask secondTask = new SecondTask();
        System.out.println("Pasitinkite figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\nd-apskritimas");

        String selection = scanner.nextLine();

        switch (selection) {
            case "a":
                System.out.println(secondTask.trikampioPlotas(scanner));
                break;
            case "b":
                //TODO
                break;
            case "c":
                //TODO
                break;
            case "d":
                //TODO
                break;
            default:
                System.out.println("Ka tu nematai, pas pateikta?");
                break;
        }
    }

    private double trikampioPlotas(Scanner scanner){
        double a = NumberUtils.getCorrectNumber(scanner, "Iveskite a statini");
        double b = NumberUtils.getCorrectNumber(scanner,"Iveskite b statini");
        return (a*b)/2;
    }




}
