package days.second;


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
        double a = getCorrectNumber(scanner,"Iveskite a statini");
        double b = getCorrectNumber(scanner,"Iveskite b statini");
        return (a*b)/2;
    }

    private double getCorrectNumber(Scanner sc, String message){
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
