package days.third;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/16/2018.
 */
public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ugis = NumberUtils.getCorrectNumber(scanner, "Iveskite savo ugi, prasau");
        double svoris = NumberUtils.getCorrectNumber(scanner, "Iveskite savo svori, prasau");

        double result = getKmi(ugis, svoris);

        System.out.println("Jusu KMI yra:"+ result);

    }

    private static double getKmi(double ugis, double svoris){
        return svoris/Math.pow(ugis, 2);
    }
}
