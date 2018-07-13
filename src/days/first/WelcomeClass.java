package days.first;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
public class WelcomeClass {

    //psvm sukuria main metoda
    //ctrl+alt+l sulygiuoja
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        //kaip iskviesti statisni metoda?
        System.out.println(minus(12, 6));
        int b = minus(12, 9);
        System.out.println(b);
        //kaip iskviesti ne statini metoda?

        WelcomeClass welcomeClass = new WelcomeClass();// sukuriamas objektas
        welcomeClass.printName("Andrius");
    }

    private void printName(String name){
        //sout sukuria System.out.println()
        System.out.println(name);
    }

    private static int minus(int numb, int numb2){
        return numb - numb2;
    }

}
