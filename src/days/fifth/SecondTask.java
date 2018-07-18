package days.fifth;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/18/2018.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savaites diena");
        int numb = scanner.nextInt();

        Week week = Week.getDayById(numb);

        System.out.println(week.name());
    }
}
