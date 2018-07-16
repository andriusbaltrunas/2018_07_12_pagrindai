package days.third;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/16/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String line = "";
        while (!line.equals("q")) {
            System.out.println("Iveskite du skaicius ir veiksma tarp ju pvz '20 + 20'");
            line = scanner.nextLine();
            String[] items = line.split(" ");
            if (items.length == 3) {
                double numb = getNumber(scanner, items[0], "pakartokite pirmo sk ivedima");
                double numb2 = getNumber(scanner, items[2], "pakartokite antro sk ivedima");

                double result;
                switch (items[1]) {
                    case "+":
                        result = calculator.sum(numb, numb2);
                        System.out.println("Suma " + result);
                        break;
                    case "-":
                        //TODO
                        break;
                    case "/":
                        while (numb2 == 0) {
                            numb2 = NumberUtils.getCorrectNumber(scanner, "iveskite gera skaiciu ir nelygu 0");
                        }
                        //TODO division
                        break;
                    default:
                        System.out.println("Nepavyko rasti");
                        break;
                }
            } else if (!line.equals("q")){
                System.out.println("Blogas formatas");
            }
        }
    }

    private static double getNumber(Scanner scanner, String numb, String message) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner, message);
        }
        return result;
    }
}
